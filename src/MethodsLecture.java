public class MethodsLecture {
    public static void main(String[] args){

//    multiplyUserInput();

//        printNames();


    }


// ============== Method Definitions ===============
// *** Access Modifiers ***

//    public static String getNameString(String name){
//        if ((name == null) || (name.equals(""))){
//            return "No name provided";
//        } else {
//            return getFormattedName(name, "Why, hello ");
//        }
//    }
//
//    public static String getFormattedName (String name, String greeting){
//        return greeting + name.toUpperCase();
//    }
//// *** Static vs Instance ***
//    public static int doTheMathStatic(){
//        return 1 + 2;
//    }
//
//    public int doTheMathInstance(){
//        return 1 + 2;
//    }
//// *** Returning vs Void ***
//
//    public static String getGreeting(){
//        return "hi";
//    }

//    public static void printGreeting(){
//        System.out.println(getGreeting());
//    }

// *** Parameters ***
// ============ Mini Exercise #1 =============
/* TODO:
 *   -Write a public static method which returns an integer
 *   -The method should take in *two parameters* and *return* the product of multiplying them
 *   -Print the output to the console by calling the method, passing in params, and logging its output
 *   BONUS: Use the Scanner class to get the numbers from the user input
 * */
//public static int multiplier (int param1, int param2){
//    return param1 * param2;
//}
//
//public static void printMultiplicationProduct (int param1, int param2){
//
//    System.out.println("Your result is : " + multiplier(param1,param2));
//}
//
//public static void multiplyUserInput (){
//    System.out.println("Enter the first parameter");
//    Scanner sc = new Scanner(System.in);
//    int param1 = sc.nextInt();
//    System.out.println("Enter the second parameter");
//    int param2 = sc.nextInt();
//
//    printMultiplicationProduct(param1, param2);
//}

// ============== Method Overloading ===============
// ============ Mini Exercise #2 =============

    /* TODO: Write a set of overloaded public static void methods which can take in 1-3 names and print them to the console
     *   -Call each of the methods, passing in the names for each
     *   -Minus 1000pts if you don't use an oxford comma on the 3 param version
     *   BONUS: Use the Scanner class to get the names from user input
     *  */

//        public static void printNames (String name){
//            System.out.println("Hello " + name);
//        }
//
//        public static void printNames(String name1, String name2){
//            System.out.println("Hello " + name1 + " and " + name2);
//        }
//
//        public static void printNames(String name1, String name2, String name3){
//            System.out.println("Hello " + name1 + " , " + name2 + " and " + name3);
//        }
//
//        public static void printNames(){
//            String name1 = "Yasin";
//            String name2 = "Justin";
//            String name3 = "Casey";
//            printNames(name1);
//            printNames(name1, name2);
//            printNames(name1, name2, name3);
//        }

// ============== Recursion ===============
// ============== Responsible Method Use ===============




}
