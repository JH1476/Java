import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        scanner.nextLine();
        String B = scanner.nextLine();
        System.out.println(A*(B.charAt(2)-'0'));
        System.out.println(A*(B.charAt(1)-'0'));
        System.out.println(A*(B.charAt(0)-'0'));
        System.out.println(A*Integer.parseInt(B));

    }
}
