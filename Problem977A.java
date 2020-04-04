import java.util.Scanner;

public class Problem977A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, k;
        n = scanner.nextInt();
        k = scanner.nextInt();
        while (k > 0) {
            if (n % 10 == 0)
                n /= 10;
            else
                n--;
            k--;
        }
        System.out.println(n);
    }
}
