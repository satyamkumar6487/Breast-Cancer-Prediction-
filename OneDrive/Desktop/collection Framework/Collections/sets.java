
// it not conntains duplicate value


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class sets {

    public static void main (String [] args){

       // Set<Integer> sets = new HashSet<>();
// for sorting
        Set<Integer> sets = new TreeSet<>();
        sets.add(555);
        sets.add(56);
        sets.add(56);
        sets.add(54);
        sets.add(75);


        for(int num : sets){
            System.out.println(num);
        }


    }

}
