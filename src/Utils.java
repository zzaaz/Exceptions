import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Utils {
    private Utils() {

    }

    public static int[] readFromFile(String fileName) throws FileNotFoundException, InvalidNumberException {
        int[] array = new int[10];
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        String numString = "";
        try {
            int i = 0;
            while (scanner.hasNext() && i < array.length) {
                numString = scanner.nextLine();
                if (numString.length() > 10) {
                    throw new ArithmeticException("number is too long to be an integer");
                }
                array[i] = Integer.parseInt(numString);
                System.out.println(array[i]);
                if (array[i] < 0) {
                    throw new InvalidNumberException(String.format("Number %s is negative", array[i]), 700, "Utils.java");
                }
                i++;
            }
        } catch (NumberFormatException ex) {
            System.out.println(String.format("ERROR: String '%s' is not written in a form of an integer", numString));
        } catch (ArithmeticException ex) {
            System.out.println(String.format("caught arithmetic exception: %s", ex.getMessage()));
        }
        return array;
    }

    public static double sum(int[] array) {
        double sum = 0;
        for (double number : array) {
            sum += number;
        }
        return sum;
    }

    public static double sum(double[] array) {
        double sum = 0;
        for (double number : array) {
            sum += number;
        }
        return sum;
    }

}
