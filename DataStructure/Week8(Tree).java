import java.util.*;
import java.io.*;

public class DataStructure8 {

    public static int[] make_tree (String s) {
        StringTokenizer st = new StringTokenizer(s, " ");
        List<Integer> indexs = new ArrayList<>();
        List<Integer> keys = new ArrayList<>();
        int maxIndex = 0;

        while (st.hasMoreTokens()) {
            int index = Integer.parseInt(st.nextToken());
            int key = Integer.parseInt(st.nextToken());
            indexs.add(index);
            keys.add(key);
            maxIndex = Math.max(maxIndex, index);
        }

        int[] tree = new int[maxIndex + 1];

        for (int i = 0; i < indexs.size(); i++) {
            int index = indexs.get(i);
            int key = keys.get(i);
            tree[index] = key;
        }

        return tree;
    }

    public static void print_depth (int tree[], int index1, int index2) {
        int depth1 = 0, depth2 = 0;
        int temp1 = index1, temp2 = index2;

        while (temp1 > 1) {
            temp1 /= 2;
            depth1++;
        }

        while (temp2 > 1) {
            temp2 /= 2;
            depth2++;
        }

        while (depth1 > depth2) {
            index1 /= 2;
            depth1--;
        }
        while (depth2 > depth1) {
            index2 /= 2;
            depth2--;
        }

        while (index1 != index2) {
            index1 /= 2;
            index2 /= 2;
        }

        System.out.println("key : " + tree[index1] + " depth : " + depth1);
    }

    public static void main(String[] args) throws IOException {
        try {
            File file = new File("test.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {

                int[] tree = make_tree(line);

                String indexLine = br.readLine();
                StringTokenizer indexSt = new StringTokenizer(indexLine, " ");
                int index1 = Integer.parseInt(indexSt.nextToken());
                int index2 = Integer.parseInt(indexSt.nextToken());

                print_depth(tree, index1, index2);

            }
            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            System.out.println("I/O exception");
        }
    }
}
