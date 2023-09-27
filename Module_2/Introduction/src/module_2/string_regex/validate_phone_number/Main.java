package module_2.string_regex.validate_phone_number;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"(84)-(0978489648)", "(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};

        for(String str : strings){
            System.out.println(str + " " + PhoneNumber.validate(str));
        }
    }
}
