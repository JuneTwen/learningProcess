package com.learn.collection_.list_.linkedList_;

public class Test {
    public static void main(String[] args) {
        Node a = new Node("a");
        Node b = new Node("b");
        Node d = new Node("d");
        Node c = new Node("c");

        // 连接三个节点，形成双向列表
        a.next = b;
        b.next = c;
        c.pre = b;
        b.pre = a;

        Node first = a; //头节点
        Node last = c; //尾节点
        //从头到尾的遍历
        while (true) {
            if (first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }
        System.out.println("-----------");
        b.next = d;
        d.pre = b;

        c.pre = d;
        d.next = c;

        //从尾到头的遍历
        while (true) {
            if (last == null){
                break;
            }
            System.out.println(last);
            last = last.pre;
        }
    }
}
class Node{
    public Object item; //存放数据
    public Node next; //指向下一个节点
    public Node pre; //指向上一个节点
    public Node(Object name){
        this.item = name;
    }

    @Override
    public String toString(){
        return "Node name="+item;
    }
}