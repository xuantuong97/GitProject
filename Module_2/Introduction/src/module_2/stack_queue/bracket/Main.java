package module_2.stack_queue.bracket;

public class Main {

    public static void main(String[] args) {
        String string = "())( ";

        BracketCheck bracketCheck = new BracketCheck();

        System.out.println(bracketCheck.checkBracket(string));
    }
}
