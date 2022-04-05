import java.util.*;

public class AnyToDec {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int base = scan.nextInt();
        int count = 0;
        int val = 0;
        while (n != 0) {
            val += (n % 10) * Math.pow(base, count);
            n = n / 10;
            System.out.println(n);
            count++;
        }
        System.out.println(val);
        scan.close();

    }

}
