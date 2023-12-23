package franxx.code.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

public class FileHelperTest {

    @Test
    void file() throws Exception {
        System.out.println(FileHelper.loadFile("pom.xml"));
    }

    @Test
    void fileNotFound() {
        Assertions.assertThrows(FileNotFoundException.class, () -> {
           FileHelper.loadFile("pommm.xml");
        });
    }
}
