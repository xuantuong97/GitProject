package module_2.io_text_file.copy_file;

import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class CopyFile {

    static final String PATH = "C:\\Users\\ADMIN\\Documents\\GitProject\\Module_2\\Introduction\\src\\module_2\\io_text_file\\copy_file\\";
    public static void copyAndWrite(String source, String target){
        FileReader reader = null;
        BufferedReader bufferedReader = null;
        FileWriter writer = null;
        BufferedWriter bufferedWriter = null;

        try {

            String sourcePath = PATH + source;
            String targetPath = PATH + target;
            File sourceFile = new File(sourcePath);
            File targetFile = new File(targetPath);

            if(!sourceFile.exists()){
                throw new FileNotFoundException();
            }

             reader = new FileReader(sourceFile);
             bufferedReader = new BufferedReader(reader);

             writer = new FileWriter(targetFile);
             bufferedWriter = new BufferedWriter(writer);

            String line ;
            String sumString = "";

            while ((line = bufferedReader.readLine())!= null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                sumString += line;
            }

            System.out.println("Copy: "+ sumString.length() + " characters.");

        }
        catch (FileNotFoundException e){
            System.out.println("Source file not found!");
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                if(bufferedReader != null){
                    bufferedReader.close();
                }
                if(reader !=null){
                    reader.close();
                }
                if(bufferedWriter != null){
                    bufferedWriter.close();
                }
                if(writer !=null){
                    writer.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void showFile(String fileName){

        File file;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try{
            String filePath = PATH + fileName;
            file = new File(filePath);

            if(!file.exists()){
                throw new FileNotFoundException();
            }
             fileReader = new FileReader(file);
             bufferedReader = new BufferedReader(fileReader);
            String line;

            while((line = bufferedReader.readLine())!= null){
                System.out.println(line);
            }
        }
        catch (Exception e){
            System.out.println("File not found!");
        }
        finally {
            try {
                if(bufferedReader!= null){
                    bufferedReader.close();
                }
                if(fileReader!= null){
                    fileReader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
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
