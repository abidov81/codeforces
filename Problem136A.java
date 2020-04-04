import java.util.Scanner;

public class Problem136A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] gifted = new int[n + 1];
        int[] received = new int[n + 1];
        for (int i = 1; i <= n; i++)
            gifted[i] = scanner.nextInt();
        for (int i = 1; i <= n; i++)
            received[gifted[i]] = i;
        for (int i = 1; i <= n; i++)
            System.out.print(received[i] + " ");
    }
}
