    import java.util.*;
            import java.io.*;

    public class Main {
        public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(System.in);
            int H = sc.nextInt();
            int M = sc.nextInt();
            int N = sc.nextInt();

            if (H == M && M == N) {
                System.out.println(10000 + H*1000);
            }
            else if ((H == M) || (M == N)) {
                System.out.println(1000 + M*100);
            }
            else if (H == N) {
                System.out.println(1000 + H*100);
            }
            else {
                if(H > M && H > N) {
                    System.out.println(H*100);
                }
                else if (M > H && M > N) {
                    System.out.println(M*100);
                }
                else {
                    System.out.println(N*100);
                }
            }
        }
    }
