package linkedList;

 import java.util.LinkedList;

public class program5 {
    static void main(String[] args) {
        LinkedList <String> a1 = new LinkedList<>();
        a1.add("james");
        a1.add("peter");
        a1.add("maria");
        a1.add("kapil");
        a1.add("shubh");

        System.out.println(a1);
        a1.remove(2);
        System.out.println(a1);
        a1.removeFirst();
        a1.removeLast();
        System.out.println(a1);





    }
}
