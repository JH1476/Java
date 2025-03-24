import java.util.*;
import java.io.*;

public class DataStructure2 {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("test.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line = null;

            while ((line = br.readLine()) != null) {

                ArrList2 arrList = new ArrList2();

                StringTokenizer st = new StringTokenizer(line, " ");
                while (st.hasMoreTokens()) {
                    int value = Integer.parseInt(st.nextToken());
                    arrList.insert_dec(value);
                }

                arrList.print();
            }
            br.close();

            ArrList2 arrList = new ArrList2();
            Random random = new Random(2);

            for (int i = 0; i < 10; i++) {
                int random_elements = (random.nextInt(100));
                arrList.insert_dec(random_elements);
            }

            arrList.print();

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            System.out.println("I/O exception");
        }
    }
}

class ArrList2 {
    private int a[];
    private int size;
    private int count;
    private int temp;
    private int number_of_executions;

    public ArrList2() {
        a = new int[1];
        size = 0;
        count = 0;
        temp = 0;
        number_of_executions = 0;
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

        System.out.println("average: " + number_of_executions/size);
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

    public void insert_dec(int x){
        a[size] = x;
        size++;
        if (size == a.length) {
            resize(2 * a.length);
        }

        int i = size-1;
        number_of_executions = 0;
        count = 0;

        while ( i > 0 && a[i-1] < a[i]) {
            temp = a[i - 1];
            a[i - 1] = a[i];
            a[i] = temp;
            i--;
            count++;
            number_of_executions += count;

            if (i > 0 && a[i - 1] > a[i]) {
                count++;
                number_of_executions += count;
            }
        }

    }
}
