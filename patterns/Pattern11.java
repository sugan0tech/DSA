import java.util.*;

public class Pattern11 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" " + count + " ");
                count++;
            }
            System.out.println();

        }
        scan.close();

    }

}
