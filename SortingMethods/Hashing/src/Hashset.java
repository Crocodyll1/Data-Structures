import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
       HashSet<Integer> set = new HashSet<>();

//       insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        System.out.println("size of the list is "+ set.size());

        if(set.contains(1)){
            System.out.println("set contains");

        }
        if(!set.contains(6)){
            System.out.println("does not contain");
        }


//        Delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("does not contain 1 or 1 is removed");
        }
        System.out.println(set);

//        Iteration
        Iterator it = set.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

    }


}
