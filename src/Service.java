import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Service {

    public static String[] read(String path) throws IOException {

        return  Files.readAllLines(Paths.get(path)).toArray(new String[0]);
    }
}
