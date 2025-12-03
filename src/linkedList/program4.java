package linkedList;

 import java.util.LinkedList;

public class program4 {
    static void main(String[] args) {
        LinkedList <String> a1 = new LinkedList<>();
        a1.add("james");
        a1.add("peter");
        a1.add("maria");
        a1.add("kapil");
        a1.add("shubh");
        System.out.println(a1);
        a1.addFirst("roger");
        a1.addLast("jack");
        System.out.println(a1);

        System.out.println(a1.get(1));
        System.out.println(a1.getFirst());
        System.out.println(a1.getLast());

        System.out.println(a1.size());
        a1.clear();
        System.out.println(a1);


    }
}
