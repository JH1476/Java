    import java.util.*;
    import java.io.*;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int T = Integer.parseInt(br.readLine());
            int[] sum = new int[T];
            int[] A = new int[T];
            int[] B = new int[T];

            for(int i = 0; i < T; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                A[i] = Integer.parseInt(st.nextToken());
                B[i] = Integer.parseInt(st.nextToken());
                sum[i] = A[i] + B[i];
            }
            for(int j = 0; j < T; j++) {
                bw.write("Case #" + (j+1) + ": ");
                bw.write(A[j] + " + " + B[j] + " = " + sum[j]);
                bw.write("\n");
            }
            bw.flush();
            bw.close();
        }
    }
