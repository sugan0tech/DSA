import java.util.*;

public class Pattern17 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        scan.close();

    }

}
