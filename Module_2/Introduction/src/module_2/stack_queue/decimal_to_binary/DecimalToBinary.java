package module_2.stack_queue.decimal_to_binary;

import java.util.Stack;

public class DecimalToBinary {

    private Stack<Integer> integerStack = new Stack<>();

    DecimalToBinary(){};

    public String convertDecimal(int number){

        int floor;
        int residual;
        String result = "";
        int size;
        do{
            floor = number/2;
            residual = number % 2;
            integerStack.push(residual);
            number = floor;
        }
        while (floor > 0);

        size = integerStack.size();

        for(int i = 0; i<size; i++){
            result += integerStack.pop();
        }
        return result;
    }
}
