package Example44;

public class TestThrowsException {

    public static void main(String[] args) {

        try{
            divide1(1, 0);
        }catch( IllegalArgumentException ex){
            System.out.println( ex.getMessage());
            // get the string passed to the exception constructor
        }


    }
    // unchecked exception - no need to declare and handle
    public static int divide1( int x, int y){

        if( y == 0) throw new IllegalArgumentException("denominator cannot be zero");

        return x/y;
    }
}
