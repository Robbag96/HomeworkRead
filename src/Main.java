import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        String[] read = Service.read("C:\\Users\\Robert\\Desktop\\data.txt");

        String[] h1 = read[0].split(",");
        Human human1 = new Human(h1[0], h1[1], Integer.parseInt(h1[2]), Integer.parseInt(h1[3]));
        String[] h2 = read[1].split(",");
        Human human2 = new Human(h2[0], h1[1], Integer.parseInt(h2[2]), Integer.parseInt(h2[3]));
        String[] h3 = read[2].split(",");
        Human human3 = new Human(h3[0], h3[1], Integer.parseInt(h3[2]), Integer.parseInt(h3[3]));
        String[] h4 = read[3].split(",");
        Human human4 = new Human(h4[0], h4[1], Integer.parseInt(h4[2]), Integer.parseInt(h4[3]));
        String[] h5 = read[4].split(",");
        Human human5 = new Human(h5[0], h1[1], Integer.parseInt(h5[2]), Integer.parseInt(h5[3]));
        String[] h6 = read[5].split(",");
        Human human6 = new Human(h6[0], h6[1], Integer.parseInt(h6[2]), Integer.parseInt(h6[3]));
        String[] h7 = read[6].split(",");
        Human human7 = new Human(h7[0], h7[1], Integer.parseInt(h7[2]), Integer.parseInt(h7[3]));
        String[] h8 = read[7].split(",");
        Human human8 = new Human(h8[0], h8[1], Integer.parseInt(h8[2]), Integer.parseInt(h8[3]));


        List<Human> humans = new ArrayList<>(Arrays.asList(human1, human2, human3, human4, human5, human6, human7, human8));

        Collections.sort(humans);
        System.out.println("After sorting \n" + humans);

        System.out.println();
        System.out.println(Service.sortByName(humans));
        Service.write("C:\\Users\\Robert\\Desktop\\data.txt", "Name \n" + humans);


    }
}



