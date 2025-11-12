public class TwoPointers {

    public static void main(String[]args){

        int [] arr = {1,2,3,4,5,6};

int Left = arr[0];
int Right = arr.length-1;
        int target = 6;


        while (Left < Right) {
            int sum = arr[Left] + arr[Right];
            if (target == sum ){
                System.out.println(arr[Left] + " " + arr[Right]);
                break;
            } else if
                (sum < target){
                    Left ++;

                } else {
                Right --;
            }
        }
    }

}
