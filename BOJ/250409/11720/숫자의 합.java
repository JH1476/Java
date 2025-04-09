import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();

        int i = 0;
        int sum = 0;
        int[] c = new int[a];
        while(i < a) {
            c[i] = b.charAt(i) - '0';
            sum += c[i];
            i++;
        }
        System.out.println(sum);
    }
}
