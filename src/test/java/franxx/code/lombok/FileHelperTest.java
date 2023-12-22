package franxx.code.lombok;

import org.junit.jupiter.api.Test;

public class FileHelperTest {

    @Test
    void file() throws Exception {
        System.out.println(FileHelper.loadFile("pom.xml"));
    }
}
