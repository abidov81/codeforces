import java.util.Scanner;

public class Problem1223A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q, n;
        q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            n = scanner.nextInt();
            if (n == 2)
                System.out.println(2);
            else if (n % 2 == 1)
                System.out.println(1);
            else if ((n > 2) && (n % 2 == 0))
                System.out.println(0);
        }
    }
}
