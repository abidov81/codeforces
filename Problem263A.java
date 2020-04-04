import java.util.Scanner;

public class Problem263A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0, m = 0, temp = 0, count = 0;
        for (int i = 1; i <= 5; i++)
            for (int j = 1; j <= 5; j++) {
                temp = scanner.nextInt();
                if (temp == 1) {
                    n = i;
                    m = j;
                }
            }
        count += Math.abs(n - 3);
        count += Math.abs(m - 3);
        System.out.println(count);
    }
}
