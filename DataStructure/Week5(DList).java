import java.util.*;
import java.io.*;

public class DataStructure5 {
    public static void main(String[] args) throws IOException {

        try {
            File file = new File("test.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line = null;

            while ((line = br.readLine()) != null) {
                DList1 d = new DList1();

                StringTokenizer st = new StringTokenizer(line, " ");
                while (st.hasMoreTokens()) {
                    int value = Integer.parseInt(st.nextToken());
                    d.insertBefore(d.tail, value);
                }
                d.print();

                if ((line = br.readLine()) != null) {
                    d.modify(Integer.parseInt(line));
                }
                d.print();
            }
            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            System.out.println("I/O exception");
        }
    }
}

class DNode1 {
    private int item;
    private DNode1 previous;
    private DNode1 next;
    public DNode1(int newItem, DNode1 p, DNode1 q) {
        item = newItem;
        previous = p;
        next = q;
    }

    public int getItem() {return item;}
    public DNode1 getPrevious() {return previous;}
    public DNode1 getNext() {return next;}
    public void setItem(int newItem) {item = newItem;}
    public void setPrevious(DNode1 p) {previous = p;}
    public void setNext(DNode1 newNext) {next = newNext;}

}

class DList1 {
    protected DNode1 head, tail;

    public DList1() {
        head = new DNode1(0,null, null);
        tail = new DNode1(0,head, null);
        head.setNext(tail);
    }

    public void print() {
        DNode1 p = head;
        DNode1 q = tail;
        DNode1 t = p.getNext();

        while (t != null && t != q) {
            System.out.print(t.getItem() + " ");
            t = t.getNext();
        }
        System.out.println();
    }

    public void insertBefore(DNode1 p, int x) {
        DNode1 k = p.getPrevious();
        DNode1 newNode = new DNode1(x,k,p);
        p.setPrevious(newNode);
        k.setNext(newNode);
    }

    public void modify(int x) {
        DNode1 p = head;
        DNode1 q = tail;
        DNode1 t = p.getNext();
        DNode1 k = q.getPrevious();

        while (t != null && t != k) {
            if (t.getItem() < x) {
                int item = t.getItem();
                t.setItem(k.getItem());
                k.setItem(item);
                k = k.getPrevious();
            }
            else if (t.getItem() >= x) {
                t = t.getNext();
            }
        }
    }
}
