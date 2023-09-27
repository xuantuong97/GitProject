package module_2.exception;

public class IllegalTriangleException extends Exception{

    public String getMessageOfException1(){
        return "The length of triangle must be greater 0";
    }

    public String getMessageOfException2(){
        return "The sum of the two sides must be greater than the remaining side";
    }
}
