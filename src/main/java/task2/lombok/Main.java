package task2.lombok;

public class Main {

    public static void main(String[] args) {
        User user = User.create()
                .name("John")
                .surname("Smith")
                .age(20)
                .password("1234")
                .product("product1")
                .product("product2")
                .done();

        System.out.println(user.toString());

        user.setAge(30);
        System.out.println("New user age: " + user.getAge());

        User user2 = user.toBuilder()
                .name("Elen")
                .done();

        System.out.println("User 1 hashcode: " + user.hashCode());
        System.out.println("User 2 hashcode: " + user2.hashCode());
        System.out.println("Are user 1 and 2 the same?: " + user.equals(user2));

        Employee employee = Employee.builder()
                .name("Bob")
                .surname("Smith")
                .department("IT")
                .build();

        System.out.println(employee.toString());
    }
}
