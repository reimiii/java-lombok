package franxx.code.lombok;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Employee {

    private String id;

    private String name;
}
