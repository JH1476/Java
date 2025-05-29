import java.util.*;
import java.io.*;

public class DataStructure7 {

    public static void main(String[] args) throws IOException {
        try {
            File file = new File("test.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line = null;

            while ((line = br.readLine()) != null) {

                ArrayStack as = new ArrayStack();
                ArrayQueue aq = new ArrayQueue();

                StringTokenizer st = new StringTokenizer(line, " ");
                while (st.hasMoreTokens()) {
                    as.push(Integer.parseInt(st.nextToken()));
                    aq.add(as.pop());
                }
                System.out.print(aq.remove() + " ");
                System.out.print(aq.remove() + " ");

                if ((line = br.readLine()) != null) {
                    StringTokenizer st1 = new StringTokenizer(line, " ");
                    while (st1.hasMoreTokens()) {
                        if(!aq.isEmpty()) {
                            as.push(Integer.parseInt(st1.nextToken()));
                            aq.add(as.pop());
                        }
                    }
                }

                while (!aq.isEmpty()) {
                    System.out.print(aq.remove() + " ");
                }
                System.out.println();
            }
            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            System.out.println("I/O exception");
        }
    }
}

class ArrayStack {
    private int[] s;
    private int top;
    public ArrayStack() {
        s = new int[1];
        top = -1;
    }
    public int size() { return top+1; }
    public boolean isEmpty() { return top == -1;}

    public void push(int newItem) {
        if(size() == s.length)
            resize(2*s.length);
        s[++top] = newItem;
    }

    public void resize(int newsize) {
        int[] t = new int[newsize];
        for (int i = 0; i < size(); i++) {
            t[i] = s[i];
        }
        s = t;
    }

    public int pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        int item = s[top];
        s[top--] = 0;
        if (size() > 0 && size() == s.length/4) {
            resize(s.length/2);
        }
        return item;
    }
}

class ArrayQueue {
    private int[] q;
    private int front, rear, size;
    public ArrayQueue() {
        q = new int[2];
        front = rear = size = 0;
    }
    public int size() { return size; }
    public boolean isEmpty() { return (size == 0);}

    public void add(int newItem) {
        if((rear+1)%q.length == front) {
            resize(2 * q.length);
        }
        rear = (rear+1) % q.length;
        q[rear] = newItem;
        size++;
    }

    public void resize(int newsize) {
        int[] t = new int[newsize];
        for (int i = 1, j=front+1; i < size+1; i++) {
            t[i] = q[j%q.length];
        }
        front = 0;
        rear = size;
        q = t;
    }

    public int remove() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        front = (front+1) % q.length;
        int item = q[front];
        q[front] = 0;
        size--;
        if(size > 0 && size == q.length/4) {
            resize(q.length/2);
        }
        return item;
    }
}
