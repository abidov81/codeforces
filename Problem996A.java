import java.util.Scanner;

public class Problem996A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, count = 0;
        n = scanner.nextInt();
        while (n > 0) {
            if (n >= 100) {
                count = count + n / 100;
                n %= 100;
            } else if (n >= 20) {
                count = count + n / 20;
                n %= 20;
            } else if (n >= 10) {
                count = count + n / 10;
                n %= 10;
            } else if (n >= 5) {
                count = count + n / 5;
                n %= 5;
            } else {
                count = count + n;
                n = 0;
            }
        }
        System.out.println(count);
    }
}
