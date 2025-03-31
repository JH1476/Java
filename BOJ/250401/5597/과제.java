import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] a = new int[30];

        for(int i = 0; i < 28; i++) {
            int n = Integer.parseInt(br.readLine());
            a[n-1] = 1;
        }

        for(int j = 0; j < a.length; j++) {
            if(a[j] != 1) {
                System.out.println(j+1);
            }
        }
    }
}
