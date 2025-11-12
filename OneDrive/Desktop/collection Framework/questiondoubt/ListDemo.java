import java.util.*;

public class ListDemo {

    public static void main (String [] args){
        int [] arr = {-1,0,1,2,-1,-4};

        List<List<Integer>> result = threesum(arr);

        System.out.println(result);



    }

    public  static List<List<Integer>> threesum(int [] arr){

        if (arr == null || arr.length <3 ) return new ArrayList<>();

        Arrays.sort(arr);

        Set<List <Integer>>  res = new HashSet<>();

        for (int i = 0 ; i < arr.length-2; i ++){

            int lef1 = i + 1 ;
            int Right = arr.length-1;

            System.out.println(Right);

            res.add(Arrays.asList(arr[i]));
        }
        return new ArrayList<>( res);
    }



}
