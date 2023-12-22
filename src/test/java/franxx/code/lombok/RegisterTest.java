package franxx.code.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegisterTest {

    @Test
    void with() {
        Register register = new Register("me", "mee");
        Register register1 = register.withUsername("mi");

        Assertions.assertEquals(register1.getPassword(), register.getPassword());
        Assertions.assertNotEquals(register1.getUsername(), register.getUsername());
    }
}
