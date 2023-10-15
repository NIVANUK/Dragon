import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        String inputFName = "Input.txt";
        Scanner sq = new Scanner(new File("Input.txt"));
        int n = sq.nextInt();
        int m = sq.nextInt();
        int k = sq.nextInt();
        String f;
        if (k >= n) {
            f = "NO";
            String OutPutFName = "Output.txt";
            Files.writeString(Path.of(OutPutFName), f);
        }
        else {
            int t = 0;
            while (m > 0) {
                m = m - n + k;
                t++;
            }

            String OutPutFName = "Output.txt";
            String s=Integer.toString(t);
            Files.writeString(Path.of(OutPutFName),s);
        }
    }
}