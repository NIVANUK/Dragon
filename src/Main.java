import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String inputFName="Input.txt";
        Scanner sq= new Scanner(new File("Input.txt"));
        int n=sq.nextInt();
        int m=sq.nextInt();
        int k= sq.nextInt();

        String result;
        int t=0;// cutsCount
      if(n<=k) {
          result = "NO";
          System.out.println(result);

      }
       else
        {
           while (m>0)
           {
               m=m-n+k;
               t++;
           }

        }
        System.out.println(t);


    }
}