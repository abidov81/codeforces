import java.util.Scanner;

public class Problem1281A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String[] strings = new String[t];
        for (int i = 0; i < t; i++) {
            strings[i] = scanner.next();
            if (strings[i].endsWith("mnida"))
                System.out.println("KOREAN");
            else if (strings[i].endsWith("po"))
                System.out.println("FILIPINO");
            else
                System.out.println("JAPANESE");
        }
    }
}
