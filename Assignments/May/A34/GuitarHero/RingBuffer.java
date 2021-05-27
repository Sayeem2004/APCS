/****************************************************************************************************
    Name: Mohammad Khan, Dylan Hu, Asa Muhamamd, Caroline Leung, Esteak Shapin, Han Zhang, Jishan
    Chowdhury

    Compilation: javac RingBuffer.java
    Execution: java RingBuffer n
    Dependencies: none

    Notes: Class to simulate an updating array of values, the main function is used just to test this
    class out.

    > java RingBuffer 10
    Size after wrap-around is 10
    55.0

    > java RingBuffer 100
    Size after wrap-around is 100
    5050.0
****************************************************************************************************/
public class RingBuffer {
    private double[] rb;
    private int first;
    private int last;
    private int size;

    public RingBuffer(int capacity) {
        rb = new double[capacity];
        first = 0;
        last = 0;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public boolean isFull() {
        return (size == rb.length);
    }

    public void enqueue(double x) {
        if (isFull()) {
            throw new RuntimeException("Ring buffer overflow");
        }
        rb[last] = x;
        last = (last + 1) % rb.length;
        size++;
    }

    public double dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Ring buffer underflow");
        }
        double ret = rb[first];
        first = (first+1) % rb.length;
        size--;
        return ret;
    }

    public double peek() {
        if (isEmpty()) {
            throw new RuntimeException("Ring buffer underflow");
        }
        return rb[first];
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        RingBuffer buffer = new RingBuffer(N);
        for (int i = 1; i <= N; i++) {
            buffer.enqueue(i);
        }

        double t = buffer.dequeue();
        buffer.enqueue(t);
        System.out.println("Size after wrap-around is " + buffer.size());

        while (buffer.size() >= 2) {
            double x = buffer.dequeue();
            double y = buffer.dequeue();
            buffer.enqueue(x + y);
        }
        System.out.println(buffer.peek());
    }

}
