import java.util.Scanner;

public class Problem1284A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0, m = 0, q = 0, y = 0;
        n = scanner.nextInt();
        m = scanner.nextInt();
        String[] s1 = new String[n];
        String[] s2 = new String[m];
        for (int i = 0; i < n; i++)
            s1[i] = scanner.next();
        for (int i = 0; i < m; i++)
            s2[i] = scanner.next();
        q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            y = scanner.nextInt();
            System.out.println(s1[(y - 1) % n] + s2[(y - 1) % m]);
        }
    }
}
