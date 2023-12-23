package franxx.code.lombok;

import lombok.Cleanup;
import lombok.SneakyThrows;

import java.io.FileReader;
import java.util.Scanner;

public class FileHelper {

    @SneakyThrows
    public static String loadFile(String file) {
        @Cleanup FileReader fileReader = new FileReader(file);
        @Cleanup Scanner scanner = new Scanner(fileReader);

        StringBuilder builder = new StringBuilder();

        while (scanner.hasNextLine()) {
            builder.append(scanner.nextLine()).append("\n");
        }

        return builder.toString();

    }
}
