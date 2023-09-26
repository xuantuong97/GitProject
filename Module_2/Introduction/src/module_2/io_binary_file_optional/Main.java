package module_2.io_binary_file_optional;

public class Main {
    public static void main(String[] args) {
        String source = "C:\\Users\\ADMIN\\Documents\\GitProject\\Module_2\\Introduction\\src\\module_2\\io_binary_file\\data\\product.dat";
        String target = "C:\\Users\\ADMIN\\Documents\\GitProject\\Module_2\\Introduction\\src\\module_2\\io_binary_file_optional\\target.dat";

        CopyBinaryFile.copy(source, target);
    }
}
