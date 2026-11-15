package task1;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("validPassword123!");
        User user2 = new User("withoutDigit!");
        User user3 = new User("withoutSpecialChar123");
        User user4 = new User("tooShort");

        System.out.println("Valid password: " + PasswordValidator.validate(user1));
        System.out.println("Invalid password (without digit): " + PasswordValidator.validate(user2));
        System.out.println("Invalid password (without special char): " + PasswordValidator.validate(user3));
        System.out.println("Invalid password (too short): " + PasswordValidator.validate(user4));
    }
}
