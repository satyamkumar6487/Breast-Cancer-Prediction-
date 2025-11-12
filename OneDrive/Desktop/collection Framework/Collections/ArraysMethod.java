import java.util.Arrays;
import java.util.List;

public class ArraysMethod {
    public static void main(String [] args ) {


        // 1st method
//    String [] arr= {"chicken", "mutton" , "Fish"};
//
//
//        List<String> list = Arrays.asList(arr);
//
//        for (String s : list){
//            System.out.println(s + " ");
//        }


        // 2nd method


//        int [] arr  = new int [5];
//
//        Arrays.fill(arr, 100);
//
//        for (Integer i : arr){
//            System.out.print(i + " ");
//        }


        // Method 3
        int [] arr1 = new int[5];

        int [] arr2 = Arrays.copyOf(arr1, arr1.length);
        arr2[2] = 47;

        for (int i : arr1){
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i : arr2) {
            System.out.print(i + " ");
        }


    }


}
