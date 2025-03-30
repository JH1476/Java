import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            int[] a = new int[N];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            int min = a[0], max = a[0];
            for (int i = 1; i < N; i++) {
                if (min > a[i]) {
                    min = a[i];
                }
                if (max < a[i]) {
                    max = a[i];
                }
            }
            System.out.print(min + " " + max);
        }
    }
