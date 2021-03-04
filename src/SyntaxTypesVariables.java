public class SyntaxTypesVariables {

    public static void main(String [] args){

//        byte bite = 127;
//        System.out.println(((Object)bite).getClass().getName());
//
//        short shoort = 127;
//        System.out.println(((Object)shoort).getClass().getName());
//
        int myInt = 2147483647;
//            System.out.println(((Object)myInt).getClass().getName());
//
//        long loong = 2000000000;
//        System.out.println(((Object)loong).getClass().getName());

        int minValue = Integer.MIN_VALUE;
//        System.out.println(minValue - 1);

        int maxValue = Integer.MAX_VALUE;
//        System.out.println(maxValue + (maxValue + 3));


        // FLOAT
        float flt = 1.1F;
        float flt2 = 1873e3F;

        //Double

        double dbl = 1873e3;

        //Boolean

        boolean isTrue = ((1 < 2) && (1 > 0));
//        System.out.println(isTrue);

        //Char

        char letter = 'a'; // double quotes doesnt work with char
        char letter2 = 'b';

                var output = letter + letter2;
//        System.out.println(output);

//        System.out.println(((Object)output).getClass().getName());

        // String
        String myString = "String";
//        System.out.println(myString.length());

        String myStr = "This is my first line \nthis my new \t line"; // \n is new line \t giving tab space
//        System.out.println(myStr);

        //Variables

        int num;

        if ("this" == "that") {

            num = 1;
        }else{
            num = 2;
        }
//        System.out.println(num);

        //Constants

        final String myStuff = "thing"; // final is declare constant


        //Arithmetic Operators

        //Casting

        //command b for search class


    }

}
