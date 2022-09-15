package com.queue;

import java.util.Scanner;

public class ArrayQueueDemo {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(3);

        boolean loop = true;
        while (loop){
            System.out.println("show");
            System.out.println("exit");
            System.out.println("add");
            System.out.println("get");
            System.out.println("head");
            char key = new Scanner(System.in).next().charAt(0);
            switch (key){
                case 's':
                    queue.showQueue();
                    break;
                case 'a':
                    System.out.println("input the data");
                    int value = new Scanner(System.in).nextInt();
                    queue.addQueue(value);
                    break;
                case 'g':
                    try {
                        int result = queue.getQueue();
                        System.out.println("the fetched data is："+result);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h'://view the head data
                    try {
                        int result = queue.headQueue();
                        System.out.println("the head data is:"+result);
                    }catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e':
                    loop = false;
                    break;
            }
        }
        System.out.println("program exit");

    }
}
//use array to simulate queue
class ArrayQueue{
    private int maxSize;
    private int front;//head
    private int rear; //rail
    private int[] arr; //store data

    //initial
    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        front = -1;//point to the previous position of queue head,
        rear = -1; //point to the exact rail of the queue,including the last data
    }

    //if queue is full
    public boolean isFull(){
        return rear == maxSize-1;
    }

    //if queue is empty
    public  boolean isEmpty(){
        return rear == front;//both are -1
    }

    //add data to queue
    public  void addQueue(int n){
        if (isFull()){
            System.out.println("queue is full can't add");
            return;
        }
        rear++;//rear move forward
        arr[rear]=n;
    }
    //get out of queue
    public  int getQueue(){
        if (isEmpty()){
            throw  new RuntimeException("queue is empty can't get data");
        }
        front++;
        return arr[front];
    }
    //show all the data of queue
    public void showQueue(){
        if (isEmpty()){
            System.out.println("queue is empty");
            return;
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print("arr["+i+"]"+"="+arr[i]+"\t");
        }
        System.out.println();
    }
    public int headQueue(){
        if (isEmpty()){
            throw new RuntimeException("queue is empty");
        }
        return arr[front+1];
    }

}