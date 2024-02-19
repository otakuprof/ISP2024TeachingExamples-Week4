package Example43;

import java.math.BigDecimal;

import sun.lwawt.macosx.CSystemTray;

public class TestBigDecimal {

    public static void main(String[] args) {

        try{
            System.out.println(divide("2abc","12.0"));
            // write catch block from the most specific Exception to the most General
        }catch( NumberFormatException ex){
            System.out.println("Wrong rounding mode");
        }catch( IllegalArgumentException ex){
            System.out.println("String is not a valid number");
            ex.printStackTrace(); // call this to help you figure out what went wrong
        }catch( RuntimeException ex){
            System.out.println("Something else went wrong!");
        }

    }
    // unchecked exceptions --> Java doesn't force you to declare and handle
    public static String divide (String s1, String s2) {
        // THIS METHOD COULD THROW ILLEGALARGUMENTEXCEPTION and NUMBERFORMATEXCEPTION

        /** The constructors throw a NumberFormatException if the string is not a valid number */
        BigDecimal b1 = new BigDecimal(s1);
        BigDecimal b2 = new BigDecimal(s2);

        /** using the deprecated overloaded version of divide()
         * public BigDecimal divide(BigDecimal divisor, int scale, int roundingMode);
         * It throws NumberFormatException if the Rounding Mode is not a valid number
         */
        BigDecimal b3 = b1.divide(b2,3, 20);
        return b3.toString();
    }

}

