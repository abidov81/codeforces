import java.util.Scanner;

public class Problem1186A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m, k;
        n = scanner.nextInt();
        m = scanner.nextInt();
        k = scanner.nextInt();
        if ((m >= n) && (k >= n))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
