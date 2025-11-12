public class Strings {
    public static void main (String [] args) {
        // concatemation
//        String firstname = "satyam";
//        String  lastname = "jha";
//
//        String fullname = firstname + " " + lastname;
//
//        // charAt
//
//        for (int i =0 ; i < fullname.length(); i++){
//
//            System.out.println(fullname.charAt(i));
//        }


        // compare

        // 1  s1 > s2 :  +ve value
        // 2  s1 < s2 :  -ve value
        // 3 s1 == s2  : 0

        String name1 = "satyam";
//        String  name2 = "jha";
        String  name2 = "satyam";

        if (name1.compareTo(name2) == 0){
            System.out.println(" Strings are Equal ");
        } else {
            System.out.println("Strings are not Equal");
        }


        // substring

        String sentence = " satyam kumar";

        String names =  sentence.substring(1,sentence.length());
System.out.println(names);







    }
}
