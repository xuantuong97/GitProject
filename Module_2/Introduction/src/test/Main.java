package test;

public class Main {

    public static void main(String[] args) {
        String[] strings = {"j@ga.com", "dg", "j@sag","@gsd.c"};

        EmailExample emailExample = new EmailExample();
        boolean check;

        for(String str : strings){
            check = emailExample.validate(str);
            System.out.println("result " + check);
        }
    }
}
