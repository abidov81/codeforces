import java.util.Scanner;

public class Problem1220A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, zeros = 0, ones = 0;
        String s;
        n = scanner.nextInt();
        s = scanner.next();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'z')
                zeros++;
            if (s.charAt(i) == 'n')
                ones++;
        }
        for (int i = 0; i < ones; i++)
            System.out.print("1 ");
        for (int i = 0; i < zeros; i++)
            System.out.print("0 ");
    }
}
