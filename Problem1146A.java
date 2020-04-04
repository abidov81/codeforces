import java.util.Scanner;

public class Problem1146A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        s = scanner.next();
        int count = 0;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == 'a')
                count++;
        System.out.println(Math.min(s.length(), 2 * count - 1));
    }
}
