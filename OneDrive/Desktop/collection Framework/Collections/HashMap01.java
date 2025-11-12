
import java .util.*;


public class HashMap01 {
    public static void main (String [] args){

        // in hash map the key  is fix and value can change so String is key and Integer is value

        // // Country(Key)  , Population (value)

        HashMap<String,Integer> map = new HashMap<>();


        // Insertion
        ///  this unorder list

        map.put("india" , 120);
        map.put("USA", 30);
        map.put("China" ,150);

        System.out.println(map);

        map.put("China " , 180);
        System.out.println(map);

        // Search
        if(map.containsKey("China")){
            System.out.println("present");
        } else {
            System.out.println("Not present");
        }

        // get value any particular key

        System.out.println(map.get("China"));

 // Loop

        int arr [] = {1,2,3,4};
        for (int val: arr){
            System.out.print(val + " ");
        }
        System.out.println();



        // iterate in hashmap
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // Through key

        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key +" " + map.get (key));
        }
        map.remove("China");

    }

}
