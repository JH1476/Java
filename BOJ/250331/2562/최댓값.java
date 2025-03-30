import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[9];

        for (int i = 0; i < 9; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        int max = a[0];
        int count = 1;

        for(int i = 1; i < 9; i++) {
            if(a[i] > max) {
                max = a[i];
                count = i+1;
            }
        }

        System.out.println(max);
        System.out.println(count);
    }
}
