package com.collections.list;

/*
 * how-to-find-middle-element-of-linked-list-one-pass
 * */
public class LinkedListMiddleElement {
  
  
    public static void main(String args[]) {
        //creating LinkedList with 5 elements including head
      LinkedList linkedList = new LinkedList();
      LinkedList.Node head = linkedList.head();
      linkedList.add( new LinkedList.Node("A"));
      linkedList.add( new LinkedList.Node("B"));
      linkedList.add( new LinkedList.Node("C"));
      linkedList.add( new LinkedList.Node("D"));
    //  linkedList.add( new LinkedList.Node("E"));
    
      //finding middle element of LinkedList in single pass
      LinkedList.Node current = head;
      int length = 0;
      LinkedList.Node middle = head;
    
      while(current.next() != null){
          length++;
          if(length%2 ==0){
              middle = middle.next();
          }
          current = current.next();
      }
    
      if(length%2 == 1){
          middle = middle.next();
      }

      System.out.println("length of LinkedList: " + length);
      System.out.println("middle element of LinkedList : " + middle);
      
    } 
  
}

class LinkedList{
    private Node head;
    private Node tail;
  
    public LinkedList(){
        this.head = new Node("head");
        tail = head;
    }
  
    public Node head(){
        return head;
    }
  
    public void add(Node node){
        tail.next = node;
        tail = node;
    }
  
    public static class Node{
        private Node next;
        private String data;

        public Node(String data){
            this.data = data;
        }
      
        public String data() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public Node next() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
      
        public String toString(){
            return this.data;
        }
    }
}

//Read more: http://javarevisited.blogspot.com/2012/12/how-to-find-middle-element-of-linked-list-one-pass.html#ixzz3ewT14Rgd