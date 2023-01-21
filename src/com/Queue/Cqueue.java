package com.Queue;

public class Cqueue {
    int arr[];
    static final int defaultlen = 10;
    int front = 0;
    int rear = 0;
    int size = 0;

    public Cqueue() {
        this(defaultlen);
    }

    public Cqueue(int len) {
        this.arr = new int[len];
    }

    public boolean isFull() {
        return rear == arr.length;
    }

    public boolean isEmpty() {
        return rear == 0;

    }

    public boolean insert(int num) {
        if (isFull()) {
            return false;
        }
        arr[rear++] = num;
        rear = rear % arr.length;
        size++;
        return true;

    }
    public int remove(){
        int removed = arr[front];
        front = front%arr.length;
        rear--;
        return  removed ;



    }
    public  void  display()
    {
        int i = front ;
        do{
            System.out.println(arr[i]+"->");
            i++;
            i=i%arr.length;
        }while (i!=rear);
    }
}
