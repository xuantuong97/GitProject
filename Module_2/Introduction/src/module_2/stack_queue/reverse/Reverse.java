package module_2.stack_queue.reverse;

import java.util.Stack;

public class Reverse {
    private Stack<Integer> integerStack = new Stack<>();

    private Stack<String> characterStack = new Stack<>();

    public Reverse(){};


    public Stack<Integer> getIntegerStack() {
        return integerStack;
    }

    public void setIntegerStack(Stack<Integer> integerStack) {
        this.integerStack = integerStack;
    }

    public int[] reverseNumberArray(int[] arrNumber){
        for(int number: arrNumber){
            integerStack.push(number);
        }

        for(int i= 0; i<arrNumber.length; i++){
            arrNumber[i] = integerStack.pop();
        }

        return arrNumber;
    }

    public String reverseString(String str){
        for(String string: str.split("")){
            characterStack.push(string);
        }

        String newString = "";
        for(int i = 0; i< str.length(); i++){
            newString += characterStack.pop();
        }

        return newString;
    }
}
