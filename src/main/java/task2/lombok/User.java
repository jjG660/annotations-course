package task2.lombok;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true, builderMethodName = "create", buildMethodName = "done")
public class User {

    private String name;

    private String surname;

    private String email;

    private int age;

    @Builder.Default
    private boolean subscriber = false;

    @Singular
    private List<String> products;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private String password;
}
