import javax.management.loading.MLet;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] a = new int[N];

        for(int n = 0; n < M; n++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st1.nextToken());
            int j = Integer.parseInt(st1.nextToken());
            int k = Integer.parseInt(st1.nextToken());

            while(i <= j) {
                a[i-1] = k;
                i++;
            }
        }
        for(int i = 0; i < N; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
