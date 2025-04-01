import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean a[] = new boolean[42];
        int count = 0;
        int num = 0;

        for(int i = 0; i < 10; i++) {
            num = Integer.parseInt(br.readLine()) % 42;
            if(!a[num]) {
                a[num] = true;
                count++;
            }
        }
        System.out.println(count);
    }
}
