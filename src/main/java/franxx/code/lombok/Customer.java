package franxx.code.lombok;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = {
        "name"
})
public class Customer {

    private String id;

    private String name;
}
