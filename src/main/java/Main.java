public class Main {

    public static int countArgs(Object... args) {
        int result = 0;
        for (Object i: args){
            result = result + 1 ;
        }
        return result;
    }



//    static void fun(int ...a)
//    {
//        System.out.println("Number of arguments: " + a.length);
//
//        // using for each loop to display contents of a
//        for (int i: a)
//            System.out.print(i + " ");
//        System.out.println();
//    }



}
