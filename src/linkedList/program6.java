package linkedList;

 import java.util.LinkedList;

public class program6 {
    static void main(String[] args) {
        LinkedList <String> a1 = new LinkedList<>();
        a1.add("james");
        a1.add("peter");
        a1.add("maria");
        a1.add("kapil");
        a1.add("shubh");

        System.out.println(a1);

        a1.set(2,"sofiya");// first it removes existing value then insert a new value.
        System.out.println(a1);

        System.out.println(a1.contains("peter"));
        System.out.println(a1.contains("peter"));







    }
}
