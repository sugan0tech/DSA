import java.util.*;

public class DigitFrequency {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();
        int num = scan.nextInt();
        int tmp = 0;
        int count = 1;
        while (n != 0) {
            tmp = (int) n % 10;
            if (tmp == num)
                count++;
            n = Math.round(n / 10);
        }
        System.out.println(count);

    }

}
