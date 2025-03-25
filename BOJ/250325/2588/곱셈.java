import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int num1 = B%10;
        int num2 = B/10%10;
        int num3 = B/100;

        System.out.println(A*num1);
        System.out.println(A*num2);
        System.out.println(A*num3);
        System.out.println(A*B);

    }
}
