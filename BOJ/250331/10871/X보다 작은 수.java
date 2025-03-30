import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int[] a = new int[N];

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(st1.nextToken());
            if(a[i] < X) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
