import java.util.Scanner;

public class Problem1154A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1, x2, x3, x4, maks;
        x1 = scanner.nextInt();
        x2 = scanner.nextInt();
        x3 = scanner.nextInt();
        x4 = scanner.nextInt();
        maks =  Math.max(Math.max(x1, x2), Math.max(x3, x4));
        if (maks - x1 > 0)
            System.out.print((maks - x1) + " ");
        if (maks - x2 > 0)
            System.out.print((maks - x2) + " ");
        if (maks - x3 > 0)
            System.out.print((maks - x3) + " ");
        if (maks - x4 > 0)
            System.out.print((maks - x4) + " ");

    }
}
