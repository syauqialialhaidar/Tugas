import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
        List<Integer> fibonacci = new ArrayList<>();
        int sum = 0;

        int a = 0;
        int b = 1;

        while (b <= 4500) {
            if (b >= 10 && b % 2 == 0) {
                fibonacci.add(b);
                sum += b;
            }

            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println("Bilangan Fibonacci genap:");
        System.out.println(fibonacci);

        System.out.println("Total elemen dalam array: " + fibonacci.size());

        System.out.println("Jumlah bilangan Fibonacci genap: " + sum);
    }
}