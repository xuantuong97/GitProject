package module_2.exception;

public class IllegalTriangleException2 extends Exception{

    public String getMessageOfException2(){
        return "The sum of the two sides must be greater than the remaining side";
    }
}
