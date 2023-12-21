package franxx.code.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest {

    @Test
    void login() {

//        Login login = new Login();
//        Login login1 = new Login("mee", "secret");

        Login empty = Login.createEmpty();

        Assertions.assertNull(empty.getUsername());
        Assertions.assertNull(empty.getPassword());

        Login login = Login.create("mee", "secret");

        Assertions.assertEquals("mee", login.getUsername());
        Assertions.assertEquals("secret", login.getPassword());

    }


    @Test
    void testToString() {
        Login login = Login.create("mee", "pass");

        System.out.println(login);
    }
}
