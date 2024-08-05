import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("sayilar.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}