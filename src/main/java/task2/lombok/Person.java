package task2.lombok;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@SuperBuilder
public class Person {

    private String name;

    private String surname;

    private int age;
}
