    import java.util.*;
            import java.io.*;

    public class Main {
        public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b[] = new int[a];
                for (int i = 0; i < a; i++) {
                    int c = sc.nextInt();
                    int d = sc.nextInt();
                    b[i] = c+d;
                }
                for (int j = 0; j < a; j++) {
                    System.out.println(b[j]);
                }
        }
    }
