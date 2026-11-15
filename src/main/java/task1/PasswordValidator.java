package task1;

import java.lang.reflect.Field;
import java.util.Arrays;

public class PasswordValidator {

    public static boolean validate(Object obj) {
        if (obj == null) {
            return false;
        }
        Field[] fields = obj.getClass().getDeclaredFields();

        return Arrays.stream(fields)
                .filter(field -> field.isAnnotationPresent(PasswordValidation.class))
                .allMatch(field -> isFieldValid(field, obj));
    }

    private static Object readValue(Field field, Object obj) {
        try {
            field.setAccessible(true);
            return field.get(obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean isFieldValid(Field field, Object obj) {
        Object value = readValue(field, obj);

        if (!(value instanceof String password)) {
            return false;
        }

        PasswordValidation rules = field.getAnnotation(PasswordValidation.class);

        return hasValidLength(password, rules.minLength())
                && hasRequiredDigit(password, rules.requireDigit())
                && hasRequiredSpecialChar(password, rules.requireSpecialChar());
    }

    private static boolean hasValidLength(String password, int minLength) {
        return password.length() >= minLength;
    }

    private static boolean hasRequiredDigit(String password, boolean required) {
        return !required || password.chars().anyMatch(Character::isDigit);
    }

    private static boolean hasRequiredSpecialChar(String password, boolean required) {
        return !required || password.chars()
                .anyMatch(ch -> !Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch));
    }
}
