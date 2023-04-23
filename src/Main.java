import java.io.FileNotFoundException;
import java.util.Arrays;

public class Main {
    private static final String myFile = "src/file.txt";
    public static void main(String[] args) throws FileNotFoundException {
        try {
            System.out.println(Arrays.toString(Utils.readFromFile(myFile)));
            System.out.println(Utils.sum(Utils.readFromFile(myFile)));
        } catch (InvalidNumberException ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getErrorCode());
            System.out.println(ex.getErrorSourceClass());
            System.out.println(ex.getSuggestion());
        }
    }
}