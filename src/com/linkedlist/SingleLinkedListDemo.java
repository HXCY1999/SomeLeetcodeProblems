package com.linkedlist;

import java.util.Stack;

public class SingleLinkedListDemo {
    public static void main(String[] args) {
        HeroNode hero1 = new HeroNode(1, "AAA", "aaa");
        HeroNode hero2 = new HeroNode(2, "BBB", "bbb");
        HeroNode hero3 = new HeroNode(3, "CCC", "ccc");

        HeroNode hero22 = new HeroNode(2, "rich", "rich forever");

        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addByOrder(hero1);
        singleLinkedList.addByOrder(hero3);
        singleLinkedList.addByOrder(hero2);
        singleLinkedList.show();
        System.out.println("**************");
        singleLinkedList.update(hero22);
        singleLinkedList.show();

        singleLinkedList.delete(hero1);
        singleLinkedList.show();

        System.out.println(singleLinkedList.getLength(singleLinkedList.getHead()));

        singleLinkedList.reverse(singleLinkedList.getHead());
        singleLinkedList.show();

        //reverse print
        System.out.println("********print reverse******");
        singleLinkedList.reversePrint(singleLinkedList.getHead());

    }
}
//define a hero node
class HeroNode{
    public int no;
    public String name;
    public String nickname;
    public HeroNode next;//point to the next node


    public HeroNode(int no, String name, String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' ;
    }
}
//manage hero
class SingleLinkedList{
    //initial head node
    //no data in head node
    private HeroNode head = new HeroNode(0,"", "");

    public HeroNode getHead() {
        return head;
    }

    public void setHead(HeroNode head) {
        this.head = head;
    }

    //find the last node, let node' next point to the new
    public void add(HeroNode heroNode){

        HeroNode temp = head;
        //iterate linked list to find the tail
        while (true){
            if (temp.next == null){ //find the last
                break;
            }
            temp = temp.next; //haven't find the last temp more forward
        }
        temp.next = heroNode;
    }
    //show linked list
    public void  show(){
        if (head.next == null){
            System.out.println("linked is empty");
            return;
        }
        HeroNode temp = head.next;
        while (true){
            if (temp == null){
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }
    public void addByOrder(HeroNode heroNode){
        HeroNode temp = head;
        //Marker number exists or not
        boolean flag = false;
        while (true){
            if (temp.next == null){
                break;
            }
            if (temp.next.no > heroNode.no) {//right position
                //insert behind temp
                break;
            }else if (temp.next.no == heroNode.no) // this no is already exist
            {
                flag = true;
                break;
            }
            temp = temp.next;

        }
        if (flag == true){
            //no exist
            System.out.println("there is already exist this number"+heroNode.no);
        }else {
            heroNode.next = temp.next;
            temp.next = heroNode;
        }
    }

    //according to newHeroNode's no to change
    public void update(HeroNode newHeroNode){
        if (head.next == null){
            System.out.println("linked list is empty");
            return;
        }
        //find needed to update node
        HeroNode temp = head.next;
        // if find this node
        boolean flag = false;
        while (true){
            if (temp == null){
                break;//iteration end
            }
            //
            if (temp.no == newHeroNode.no){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag){
            temp.name = newHeroNode.name;
            temp.nickname = newHeroNode.nickname;
        }else {
            System.out.println("none of this node which no is "+newHeroNode.no);
        }
    }
    public void delete(HeroNode heroNode){
        HeroNode temp = head;
        boolean flag = false;
        while (true) {
            if (temp.next == null){
                break;
            }
            if (temp.next.no == heroNode.no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag=true){
            temp.next = temp.next.next;
        }else {
            System.out.println("no such node, no: "+heroNode.no);
        }

    }
    //get numbers of node
    public int getLength(HeroNode head){
        if (head.next == null){
            return 0;
        }
        int length = 0;
        HeroNode current = head.next;
        while (current != null){
                length++;
                current = current.next;
        }
        return length;

    }

    // search the penultimate kth node
    public void reverse(HeroNode head){
        if (head.next == null || head.next.next == null){
            return;
        }
        //assist pointer
        HeroNode curr = head.next;
        HeroNode next =null;//point to
        HeroNode reverseHead = new HeroNode(0, "", "");

        while (curr!=null){
            next = curr.next;//save
            curr.next = reverseHead.next;
            reverseHead.next = curr;
            curr = next;
        }
        head.next = reverseHead.next;
    }

    public void reversePrint(HeroNode head){
        if (head.next == null){
            return;
        }
        Stack<HeroNode> stack = new Stack<>();
        HeroNode temp = head.next;
        while (temp != null){
            stack.push(temp);
            temp = temp.next;
        }
        while (stack.size()>0){
            System.out.println(stack.pop());
        }
    }

}