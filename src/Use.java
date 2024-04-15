import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Use {
    public Use() throws FileNotFoundException {
        Scanner scanner=new Scanner(new File("input.txt"));
        ArrayList<Use> read=new ArrayList<>();
        while (scanner.hasNext()){
            String q= scanner.nextLine();
        }
    }
    public static void record() {

    }
}
