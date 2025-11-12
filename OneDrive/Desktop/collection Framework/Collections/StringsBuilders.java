

public class StringsBuilders {

    public static void main (String args[]){

        StringBuilder sb = new StringBuilder("Satyam");

        System.out.println(sb);


        // char at index
        System.out.println(sb.charAt(0));


        // set char at index
        sb.setCharAt(0,'j');
        System.out.println(sb);


        // insert

        sb.insert(0, 's');
        System.out.println(sb);


        // deletee the extra
        sb.delete(2,3);
        System.out.println(sb);
    }
}
