import java.util.*;
        import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if((a >= -1000 && a <= 1000 && a!=0) && (b >= -1000 && b <= 1000 && b!=0)) {
            if(a>0 && b>0) {
                System.out.println('1');
            }
            if(a<0 && b>0) {
                System.out.println('2');
            }
            if(a<0 && b<0) {
                System.out.println('3');
            }
            if(a>0 && b<0) {
                System.out.println('4');
            }
        }
    }
}
