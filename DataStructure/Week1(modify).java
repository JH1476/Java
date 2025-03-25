import java.util.*;
import java.io.*;

public class DataStructure1 {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("test.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line = null;

            while ((line = br.readLine()) != null) {

                ArrList1 arrList = new ArrList1();

                StringTokenizer st = new StringTokenizer(line, " ");
                while (st.hasMoreTokens()) {
                    int value = Integer.parseInt(st.nextToken());
                    arrList.insert(value);
                }

                arrList.print();

                if ((line = br.readLine()) != null) {
                    int integer_value = Integer.parseInt(line);
                    arrList.modify(integer_value);
                }

                arrList.print();
            }
            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            System.out.println("I/O exception");
        }
    }
}

class ArrList1 {
    private int a[];
    private int size;

    public ArrList1() {
        a = new int[1];
        size = 0;
    }

    public void insert(int x) {
        a[size] = x;
        size++;
        if (size == a.length) {
            resize(2 * a.length);
        }
    }

    public void resize(int k) {
        int[] t = new int[k];
        for (int i = 0; i < size; i++)
            t[i] = a[i];
        a = t;

    }

    public void print() {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public void modify(int x) {
        int i = 0;
        int j = size-1;
        for(int k = i; k <= j;) {
            if (a[i] > x) {
                i++;
                k++;
            } else if (a[i] <= x) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j--;
            }
        }
    }
}
