import java.util.Scanner;

public class Problem867A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, fs = 0, sf = 0;
        String s;
        n = scanner.nextInt();
        s = scanner.next();
        for (int i = 0; i < n - 1; i++) {
            if ((s.charAt(i) == 'F') && (s.charAt(i + 1) == 'S'))
                fs++;
            if ((s.charAt(i) == 'S') && (s.charAt(i + 1) == 'F'))
                sf++;
        }
        if (sf > fs)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
