import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] a = new int[N];
        int max = a[0];
        double average = 0;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(st.nextToken());

            if (a[i] > max) {
                max = a[i];
            }
        }

        for (int j = 0; j < N; j++) {
            average += (double)a[j]/max*100;
        }
        System.out.print(average/N);
    }
}
