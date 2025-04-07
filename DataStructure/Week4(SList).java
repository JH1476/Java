import java.util.*;
import java.io.*;

public class DataStructure4 {
    public static void main(String[] args) throws IOException {

        try {
            File file = new File("test.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line = null;

            while ((line = br.readLine()) != null) {

                SList1 s = new SList1();

                StringTokenizer st = new StringTokenizer(line, " ");
                while (st.hasMoreTokens()) {
                    s.insert_inc(st.nextToken());
                }
                s.print();

                if ((line = br.readLine()) != null) {
                    s.delete(line);
                }
                s.print();
            }
            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            System.out.println("I/O exception");
        }
    }
}

class Node1 {
    private String item;
    private Node1 next;
    public Node1(String newItem, Node1 node1) {
        item = newItem;
        next = node1;
    }

    public String getItem() {return item;}
    public Node1 getNext() {return next;}
    public void setNext(Node1 newNext) {next = newNext;}

}

class SList1 {
    protected Node1 head;

    public SList1() {
        head = new Node1(null, null);
    }

    public void print() {
        Node1 p = head;
        Node1 t = p.getNext();

        while (t != null) {
            System.out.print(t.getItem() + " ");
            t = t.getNext();
        }
        System.out.println();
    }

    public void insert_inc(String newItem) {
        Node1 p = head;
        Node1 t = head.getNext();

        while (t != null && t.getItem().compareTo(newItem) < 0) {
            p = t;
            t = t.getNext();
        }
        p.setNext(new Node1(newItem, t));
    }

    public void delete(String newItem) {
        Node1 p = head;
        Node1 t = head.getNext();

        while (t != null) {
            if (t.getItem().equals(newItem)) {
                p.setNext(t.getNext());
                t.setNext(null);
                break;
            }
            p = t;
            t = t.getNext();
        }
    }
}
