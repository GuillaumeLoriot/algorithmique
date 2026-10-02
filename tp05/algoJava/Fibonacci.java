import java.util.HashMap;
import java.util.Scanner;

public class Fibonacci {

    static int naiveCallCount = 0;
    static int memoCallCount = 0;
    static HashMap<Integer, Long> cache = new HashMap<>();



    public static long fibonacciNaive(int n) {

        naiveCallCount++;

        if (n <= 1) {
            return n;
        }

        return fibonacciNaive(n - 1) + fibonacciNaive(n - 2);
    }

    public static long fibonacciMemo(int n) {

        memoCallCount++;

        if (n <= 1) {
            return n;
        }

        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        long result = fibonacciMemo(n - 1) + fibonacciMemo(n - 2);

        cache.put(n, result);

        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Valeur de n ?");
        int n = scanner.nextInt();

        naiveCallCount = 0;

        System.out.println("Naive Fibonacci: " + fibonacciNaive(n));
        System.out.println("Nombre d'appel: " + naiveCallCount);

        memoCallCount = 0;
        cache.clear();

        System.out.println();
        System.out.println("Memoized Fibonacci: " + fibonacciMemo(n));
        System.out.println("Nombre d'appels: " + memoCallCount);

        scanner.close();
    }
}