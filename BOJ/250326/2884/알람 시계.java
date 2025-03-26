import java.util.*;
        import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        if ((H >= 0 && H <= 23) && (M >= 0 && M <= 59)) {
            if(H != 0 && M < 45) {
                System.out.print(H-1 + " " + ((M+60)-45));
            }
            else if (H == 0 && M < 45) {
                System.out.print(((H+24)-1) + " " + ((M+60)-45));
            }
            else if(H != 0 && M >= 45) {
                System.out.print(H + " " + (M-45));
            }
            else if (H == 0 && M >= 45) {
                System.out.println(H + " " + (M-45));
            }
        }
    }
}
