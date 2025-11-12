import java.util.HashSet;
import java.util.Iterator;

public class Hashing {


    public static void main (String [] args ){

        HashSet <Integer> set = new HashSet<>();

        // Insert
        set.add(1);
        set.add(2);
        set.add(5);


        // Search


if (set.contains(2)){
    System.out.println("yes it contains");
}

if ( !set.contains(6)){
    System.out.println("does not contain");
}


// Delete
        set.remove(1);
if (!set.contains(1)){
    System.out.println("Does not contain  1 - we deleted 1 ");
}

// Iterator
        Iterator it = set.iterator();
while(it .hasNext()){
    System.out.println(it.next());
}

    }
}
