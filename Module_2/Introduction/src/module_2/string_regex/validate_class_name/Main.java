package module_2.string_regex.validate_class_name;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"C0223G", "A0323K", "M0318G", "P0323A", "0931k", "c0000G"};

        for(String str: strings){
            System.out.println(str + " " + ClassName.validate(str));
        }
    }
}
