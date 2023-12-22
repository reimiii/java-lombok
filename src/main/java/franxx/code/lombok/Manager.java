package franxx.code.lombok;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString
public class Manager extends Employee {

    private Integer totalEmployee;

}
