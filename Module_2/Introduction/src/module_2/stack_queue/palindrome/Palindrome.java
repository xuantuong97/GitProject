package module_2.stack_queue.palindrome;

import java.util.*;

public class Palindrome {

    private Stack<String> stringStack = new Stack<>();

    private Queue<String> stringQueue = new ArrayDeque<>();

    Palindrome(){};

    public boolean checkPalindrome(String string){

        boolean check = true;

        for(String str: string.split("")){
            stringStack.push(str);
            stringQueue.add(str);
        }

        for(int i = 0; i<string.length(); i++){
            if(!stringStack.pop().equals(stringQueue.remove())){
               check = false;
               break;
            }
        }
        return check;
    }
}
