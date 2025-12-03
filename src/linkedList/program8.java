package linkedList;

 import java.util.LinkedList;
 import java.util.ListIterator;

public class program8 {
    static void main(String[] args) {
        LinkedList <String> a1 = new LinkedList<>();
        a1.add("james");
        a1.add("peter");
        a1.add("maria");
        a1.add("kapil");
        a1.add("shubh");

        System.out.println(a1);


        ListIterator itr = a1.listIterator();// instant factory method
        while(itr.hasNext())
        {
            System.out.println(itr.next()+"");
        }

        while(itr.hasPrevious())
        {
            System.out.println(itr.previous()+"");
        }






    }
}
