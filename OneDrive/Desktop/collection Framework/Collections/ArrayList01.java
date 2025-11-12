import java.util.ArrayList;
import java.util.*;
import java.util.Collection;
public class ArrayList01 {

    public static void main (String [] args){
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Add Element
        list.add(0);
        list.add(4);

        System.out.println(list);


        // get Element

       int element =   list.get(0);
        System.out.println(element);

// add elemnt in middle

        list.add(1 , 1);
System.out.println(list);

// set element
        list.set(0 , 5);
        System.out.println(list);

// remove
        list.remove(2);
        System.out.println(list);

// size
        int size = list.size();
        System.out.println(size);

// Loops
        for (int i = 0; i <list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();

// sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
