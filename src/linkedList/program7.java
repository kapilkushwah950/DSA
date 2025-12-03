package linkedList;

 import java.util.LinkedList;

public class program7 {
    static void main(String[] args) {
        LinkedList <String> a1 = new LinkedList<>();
        a1.add("james");
        a1.add("peter");
        a1.add("maria");
        a1.add("kapil");
        a1.add("shubh");

        System.out.println(a1);


        LinkedList <String> a2 = new LinkedList<>();
        a2.add("rojar");
        a2.add("sofia");
        a2.addAll(a1);
        System.out.println(a2);

        LinkedList  a3 = (LinkedList)a2.clone();
        System.out.println(a3);









    }
}
