    import java.util.*;
    import java.io.*;

    public class Main {
        public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int i = 0;
            int sum = 0;
            if(n>=1 && n<= 10000) {
                while (i <= n) {
                    sum += i;
                    i++;
                }
                System.out.println(sum);
            }
        }
    }
