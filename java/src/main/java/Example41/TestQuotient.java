package Example41;

public class TestQuotient {

    public static void main(String[] args) {

        try{
            // Code that could give you an Exception
            System.out.println("A");
            System.out.println(divide1(1,0)); // throws an Exception, go to catch
            System.out.println("B");
        }catch( ArithmeticException ex){
            // Decide how your program behaves when it gets an Exception
            System.out.println("Hello, don't divide by int 0");
            //ex.printStackTrace(); // get the whole series of error messages
        }



    }

    /** TODO 1 Handle this method in main() using try/catch block */
    public static int divide1( int x, int y) {
        return x/y;
    }

    /** TODO 2 Handle this using if/else */
    public static int divide2( int x, int y){
        return x/y;
    }
}
