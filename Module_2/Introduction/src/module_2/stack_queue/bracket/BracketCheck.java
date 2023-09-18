package module_2.stack_queue.bracket;

import java.util.Stack;

public class BracketCheck {

    private Stack<String> stringStack = new Stack<>();

    BracketCheck(){};

    public boolean checkBracket(String string){

        boolean check = true;

        for(String str : string.split("")){
            if(str.equals("(")){
                stringStack.push(str);

            } else if (str.equals(")")) {
                if(stringStack.empty()){
                    check = false;
                    break;
                }
                else {
                    stringStack.pop();
                }
            }
        }
        if(!stringStack.empty()){
            check = false;
        }
        return check;
    }
}
