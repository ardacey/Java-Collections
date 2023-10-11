import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
public class Io {
    public static String[] readFile(String path) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(path));
            lines.removeIf(line -> line.trim().equals(""));
            lines.replaceAll(String::trim);
            return lines.toArray(new String[0]);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}