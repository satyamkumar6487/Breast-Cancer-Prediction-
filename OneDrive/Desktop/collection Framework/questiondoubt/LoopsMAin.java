public class LoopsMAin {

    public static void main (String [] args ){

        int [] arr =  {-4 , -1 , -1, 0,1, 2};

        for (int i = 0 ; i < arr.length -2 ; i ++){

            int left = i + 1;
            int Right = arr.length-1;
            System.out.println("left = " + left + ", right = " + Right);

        }

    }

}
