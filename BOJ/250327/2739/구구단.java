    import java.util.*;
            import java.io.*;

    public class Main {
        public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            for(int i=1; i < 10; i++){
                System.out.println(a + " * " + i + " = " + a*i);
            }
        }
    }
