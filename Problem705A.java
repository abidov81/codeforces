import java.util.Scanner;

public class Problem705A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String r = "I hate it ";
        StringBuilder stringBuilder = new StringBuilder("I hate ");
        boolean status = true;
        while (n > 1) {
            if (status) {
                stringBuilder.append("that I love ");
                status = ! status;
            }
            else {
                stringBuilder.append("that I hate ");
                status = !status;
            }
            n--;
        }
        stringBuilder.append("it");
        System.out.println(stringBuilder.toString());
    }
}
