package module_2.io_text_file.copy_file;

public class Main {

    public static void main(String[] args) {
        String source = "source.txt";
        String target = "target.txt";

        CopyFile.newFile(source, target);

        CopyFile.showFile(target);
    }
}
