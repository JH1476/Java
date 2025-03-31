import java.util.*;
import java.io.*;

public class DataStructure3 {
    public static void main(String[] args) throws IOException {

        try {
            File file = new File("test.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line = null;

            while ((line = br.readLine()) != null) {
                String[] str1 = line.split(" ");
                int[] str2 = new int[str1.length];
                for (int i = 0; i < str1.length; i++) {
                    str2[i] = Integer.parseInt(str1[i]);
                }
                System.out.println(Arrays.toString(str2));

                if ((line = br.readLine()) != null) {

                    Iteration1 iteration = new Iteration1();
                    Recursive1 recursive = new Recursive1();

                    int integer_value = Integer.parseInt(line);
                    System.out.println("Iteration");
                    iteration.Iteration_sum(str2, integer_value);
                    System.out.println("Recursive");
                    recursive.Recursive_sum(str2, integer_value,0,str2.length-1);
                }

            }
            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            System.out.println("I/O exception");
        }
    }
}

class Iteration1 {
    public void Iteration_sum (int[] str2, int num) {

        int first = 0, last = str2.length-1;

        while(first < last) {

            int sum = str2[first] + str2[last];

            if (sum == num) {
                System.out.println(str2[first] + " " + str2[last]);
                first++;
                last--;
            } else if (sum < num) {
                first++;
            } else {
                last--;
                if (first == last) {
                    System.out.println("pair not found");
                    return;
                }
            }
        }
    }
}

class Recursive1 {
    public void Recursive_sum(int[] str2, int num, int first, int last) {

        int sum = str2[first] + str2[last];

        if (sum == num) {
            System.out.println(str2[first] + " " + str2[last]);
            if (first == 0 && last == str2.length-1) {
                first++;
                last--;
                Recursive_sum(str2,num,first,last);
            }
        }

        else if (sum < num) {
            first++;
            Recursive_sum(str2,num,first,last);
        }

        else {
            last--;
            if (first == last) {
                System.out.println("pair not found");
                return;
            }
            Recursive_sum(str2,num,first,last);
        }
    }
}
