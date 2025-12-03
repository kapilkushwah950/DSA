package linkedList;


import org.w3c.dom.Node;

class Node3
 {
     int data;
     Node3 previous;
     Node3 next;

 }
public class program3 {
    Node3 head;
    Node3 tail;

    // head = null
    //new
    void insertFirst(int value)
    {
       Node3 n = new Node3();
       n.data = value;
       n.next = head;
       n.previous = null;
       if(head != null)
       {
           head.previous = n;
       }

       head = n;
       if(tail == null)
       {
           tail = n;
       }


    }
    void insertLast(int value)
    {
      Node3 n  = new Node3();
      n.data = value;
      n.next = null;
      n.previous = tail;

      if(tail != null)
        {
          tail.next = n;
        }
      tail = n;
      if(head==null)
      {
          head = n;
      }

    }
    void deleteFirst()
    {
       Node3 n =new Node3();
    }
    void deleteLast()
    {

    }
    void displayFirst()
    {
        Node3 temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+"\t");
            temp = temp.next;
        }
        System.out.println();
    }

    void displaylast()
    {
        Node3 temp = tail;
        while(temp!=null)
        {
            System.out.print(temp.data+"\t");
            temp = temp.previous;
        }
        System.out.println();
    }

  public static void main(String[] args) {
      program3 p1 = new program3();
        p1.insertFirst(10);
        p1.insertLast(20);
        p1.insertLast(30);
        p1.insertLast(40);
        p1.displayFirst();
        p1.displaylast();
    }
}
