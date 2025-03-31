import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());
        int[] a = new int[N];

        for(int i = 0; i < N; i++) {
            a[i] = i+1;
        }

        for(int i = 0; i < M; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st2.nextToken());
            int c = Integer.parseInt(st2.nextToken());

            int temp = a[b-1];
            a[b-1] = a[c-1];
            a[c-1] = temp;
        }

        for(int i = 0; i < N; i++) {
            System.out.print(a[i] + " ");
        };
    }
}
