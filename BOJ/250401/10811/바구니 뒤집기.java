import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());
        int[] a = new int[N];
        int temp = 0;

        for(int i = 0; i < N; i++) {
            a[i] = i+1;
        }

        for (int k = 0; k < M; k++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int left = Integer.parseInt(st2.nextToken())-1;
            int right = Integer.parseInt(st2.nextToken())-1;
            while (right > 0 && left < right) {
                temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
        }

        for(int n = 0; n < N; n++) {
            System.out.print(a[n] + " ");
        }


    }
}
