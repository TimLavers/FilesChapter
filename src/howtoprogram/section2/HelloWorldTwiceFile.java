package howtoprogram.section2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class HelloWorldTwiceFile {

    public static void main(String[] args) throws IOException {
        Path helloWorld = Paths.get("files/PrideAndPrejudicePage1.txt");
        List<String> strings = Files.readAllLines(helloWorld);

        System.out.println("strings = " + strings);
    }
}