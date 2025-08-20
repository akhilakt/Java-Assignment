import java.util.*;

public class TimeComplexityApp {
    public static void main(String[] args) {
        ComplexityTest ct = new ComplexityTest();
        int[] sizes = {1, 5, 10, 15};

        for (int n : sizes) {
            System.out.println("\n--- n = " + n + " ---");
            long start, end;

            start = System.nanoTime();
            ct.constantTime(n);
            end = System.nanoTime();
            System.out.println("O(1) Time: " + (end - start) + " ns");

            start = System.nanoTime();
            ct.logarithmicTime(n);
            end = System.nanoTime();
            System.out.println("O(log n) Time: " + (end - start) + " ns");

            start = System.nanoTime();
            ct.linearTime(n);
            end = System.nanoTime();
            System.out.println("O(n) Time: " + (end - start) + " ns");

            start = System.nanoTime();
            ct.linearithmicTime(n);
            end = System.nanoTime();
            System.out.println("O(n log n) Time: " + (end - start) + " ns");

            start = System.nanoTime();
            ct.quadraticTime(n);
            end = System.nanoTime();
            System.out.println("O(n^2) Time: " + (end - start) + " ns");
        }
    }
}

class ComplexityTest {
    public void constantTime(int n) {
        System.out.println("Hello World");
    }

    public void logarithmicTime(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) list.add(i);
        Collections.binarySearch(list, n-1);
    }

    public void linearTime(int n) {
        for (int i = 0; i < n; i++) {}
    }

    public void linearithmicTime(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = n; i > 0; i--) list.add(i);
        Collections.sort(list);
    }

    public void quadraticTime(int n) {
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {}
    }
}
