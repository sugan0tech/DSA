import java.util.*;

public class DecToBase {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Stack<Integer> stk = new Stack<>();
        int n = scan.nextInt();
        int base = scan.nextInt();
        while (n != 0) {

            stk.push(n % base);
            n = n / base;
        }
        scan.close();
        int size = stk.size();
        for (int index = 0; index < size; index++) {
            System.out.print(stk.pop());
        }

    }

}
