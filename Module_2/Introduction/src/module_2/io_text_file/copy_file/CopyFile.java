package module_2.io_text_file.copy_file;

import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class CopyFile {

    static final String PATH = "C:\\Users\\ADMIN\\Documents\\GitProject\\Module_2\\Introduction\\src\\module_2\\io_text_file\\copy_file\\";
    public static void copyAndWrite(String source, String target){
        try {

            String sourcePath = PATH + source;
            String targetPath = PATH + target;
            File sourceFile = new File(sourcePath);
            File targetFile = new File(targetPath);

            if(!sourceFile.exists()){
                throw new FileNotFoundException();
            }

            FileReader reader = new FileReader(sourceFile);
            BufferedReader bufferedReader = new BufferedReader(reader);

            FileWriter writer = new FileWriter(targetFile);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            String line ;
            String sumString = "";

            while ((line = bufferedReader.readLine())!= null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                sumString += line;
            }

            bufferedReader.close();
            bufferedWriter.close();

            System.out.println("Copy: "+ sumString.length() + " characters.");

        }
        catch (FileNotFoundException e){
            System.out.println("Source file not found!");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void showFile(String fileName){

        try{
            String filePath = PATH + fileName;
            File file = new File(filePath);

            if(!file.exists()){
                throw new FileNotFoundException();
            }

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;

            while((line = bufferedReader.readLine())!= null){
                System.out.println(line);
            }

            bufferedReader.close();
        }
        catch (Exception e){
            System.out.println("File not found!");
        }
    }

    public static void newFile(String source, String target){

        String targetPath = PATH + target;
        File targetFile = new File(targetPath);

        try {
            if(targetFile.exists()){
                System.out.println("The file name is exist, do you want override this file?" +
                        "\n1. Yes" +
                        "\n2. No");
                Scanner scanner = new Scanner(System.in);
                int choose = Integer.parseInt(scanner.nextLine());

                switch (choose){
                    case 1: copyAndWrite(source, target);
                    case 2: return;
                    default: return;
                }
            }
            else {
                copyAndWrite(source, target);
            }
        }
        catch (NumberFormatException e){
            System.out.println("Choose is not valid.");
        }
    }
}
