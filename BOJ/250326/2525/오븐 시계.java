    import java.util.*;
            import java.io.*;

    public class Main {
        public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(System.in);
            int H = sc.nextInt();
            int M = sc.nextInt();
            int N = sc.nextInt();

            if ((H >= 0 && H <= 23) && (M >= 0 && M <= 59) && (N>=0 && N<=1000)) {

                int A = M+N;

                if (H != 23 && A >= 60) {
                    if((A/60)+H >= 24) {
                        System.out.println(((H-24)+(A/60) + " " + (A%60)));
                    }
                    else {
                    System.out.println((H+(A/60)) + " " + (A%60));
                    }
                }
                else if (H != 23 && A < 60) {
                    System.out.println(H+((A/60)) + " " + (A%60));
                }
                else {
                    System.out.println(((H-24)+(A/60) + " " + (A%60)));
                }
            }
        }
    }
