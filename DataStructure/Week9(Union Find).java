import java.util.*;
import java.io.*;

public class DataStructure9 {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("test.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            int N = Integer.parseInt(br.readLine());
            Node3[] a = new Node3[N];
            for(int i = 0; i < N; i++) {
                a[i] = new Node3(i,1);
            }

            UnionFind uf = new UnionFind(a);
            String line = br.readLine();
            while (line != null) {
                StringTokenizer st = new StringTokenizer(line);
                int node_a = Integer.parseInt(st.nextToken());
                int node_b = Integer.parseInt(st.nextToken());

                uf.union(node_a, node_b);
                line = br.readLine();
            }

            uf.printsets();
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            System.out.println("I/O exception");
        }
    }
}

class Node3 {
    int parent;
    int rank;

    public Node3(int newParent, int newRank) {
        parent = newParent;
        rank = newRank;
    }
    public int getParent() {return parent;}
    public int getRank() {return rank;}
    public void setParent(int newParent) {parent = newParent;}
    public void setRank(int newRank) {rank = newRank;}
}

class UnionFind {
    protected Node3[] a;

    public UnionFind(Node3[] iarray) {
        a = iarray;
    }

    public void union(int i, int j) {
        int iroot = find(i);
        int jroot = find(j);
        if (iroot == jroot) {
            return;
        }

        if (a[iroot].getRank() > a[jroot].getRank()) {
            a[jroot].setParent(iroot);
            a[iroot].setRank(a[iroot].getRank() + a[jroot].getRank());
        }

        else if (a[iroot].getRank() < a[jroot].getRank()) {
            a[iroot].setParent(jroot);
        }

        else {
            if (iroot > jroot) {
                a[jroot].setParent(iroot);
                a[iroot].setRank(a[iroot].getRank() + a[jroot].getRank());
            } else {
                a[iroot].setParent(jroot);
                a[jroot].setRank(a[iroot].getRank() + a[jroot].getRank());
            }
        }
    }


    protected int find(int i) {
        int root, j, h;
        root = i;
        while (root != a[root].getParent()) {
            root = a[root].getParent();
        }

        j = i;
        while(j != root) {
            h = a[j].getParent();
            a[j].setParent(root);
            j = h;
        }

        return root;
    }

    public void printsets() {
        boolean[] v = new boolean[a.length];
        int num = 1;

        for (int i = 0; i < a.length; i++) {
            if (!v[i]) {
                System.out.print("set " + num + ": ");
                int root = find(i);

                for (int j = 0; j < a.length; j++) {
                    if (find(j) == root) {
                        System.out.print(j + " ");
                        v[j] = true;
                    }
                }
                num++;
            }
        }
    }
}
