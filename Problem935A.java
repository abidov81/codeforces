import java.util.Scanner;

public class Problem935A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, count = 0;
        n = scanner.nextInt();
        for (int i = 1; i <= n / 2; i++)
            if (n % i == 0)
                count++;
        System.out.println(count);
    }
}
