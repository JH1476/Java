import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int i = 0;
        while(i < T) {
        String a = br.readLine();
        System.out.print(a.charAt(0)+ "" + a.charAt(a.length()-1));
        System.out.println();
        i++;
        }
    }
}
