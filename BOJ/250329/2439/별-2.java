    import java.util.*;
    import java.io.*;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int T = Integer.parseInt(br.readLine());
            for(int i = 0; i < T; i++) {
                for(int j = T-1; j > i; j--) {
                    System.out.print(" ");
                }
                for(int k = 0; k <= i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
