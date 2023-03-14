import java.util.*;
import java.util.Arrays;
public class FibonacciNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número: ");
        String line = scanner.nextLine();
        int term = Integer.parseInt(line);
        int[] array = new int[term + 1];
        int fibonacci = 0;
        int current = 0;
        int previus = 1;

        for (int i = 1; i <= term; i++) {
            fibonacci = current + previus;
            previus = current;
            current = fibonacci;
            array[i] = fibonacci;
            System.out.println(fibonacci);
        }

        boolean n = true;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == term) {
                n = false;
                System.out.println("O número " + term + " informado pertence a sequência de Fibonacci.");
            }
        }
        if (n == true) {
            System.out.println("O número " + term + " informado não pertence a sequência de Fibonacci.");
        }
    }
}
