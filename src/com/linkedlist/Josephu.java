package com.linkedlist;

public class Josephu {
    public static void main(String[] args) {

    }
}
class CircleSingleLinkedList{
    // create a first node
    private Boy first = new Boy(-1);
    //add boy node , to  create circleNode
    public void addBoy(int number){
        if (number<1){
            System.out.println("number should >=1");
            return;
        }
        Boy curBoy = null;
        for (int i = 1; i <= number; i++) {
            //create BoyNode
            Boy boy = new Boy(i);
            if (i == 1){
                first = boy;
                first.setNext(first);
                curBoy = first;
            }

        }
    }
}



//node
class Boy{
    private int no;
    private Boy next;

    public Boy(int no){
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Boy getNext() {
        return next;
    }

    public void setNext(Boy next) {
        this.next = next;
    }
}