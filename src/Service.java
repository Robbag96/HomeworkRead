import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

public class Service {

    public static String[] read(String path) throws IOException {

        return  Files.readAllLines(Paths.get(path)).toArray(new String[0]);
    }
    static void write(String path, String text) throws IOException {
        Files.write(Paths.get(path),text.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
    }

    static String sortByName(List<Human> humans){
        Collections.sort(humans,new ComparatorName());
        StringJoiner sj = new StringJoiner(" ");
        for (Human hm:humans){
        sj.add(hm.toString());
        }
        return sj.toString();
    }
}
