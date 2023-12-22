package franxx.code.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberTest {


    @Test
    void constructorNull() {

        Assertions.assertThrows(NullPointerException.class, () -> {
            Member member = new Member(null, null);
        });

    }


    @Test
    void setterNull() {

        Assertions.assertThrows(NullPointerException.class, () -> {
            Member member = new Member("", "");

            member.setName(null);
        });

    }


    @Test
    void methodNull() {

        Assertions.assertThrows(NullPointerException.class, () -> {
            Member member = new Member("", "");

            member.sayHello(null);
        });

    }
}
