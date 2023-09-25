package module_2.io_text_file.read_csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadCSV {

    static final String PATH = "C:\\Users\\ADMIN\\Documents\\GitProject\\Module_2\\Introduction\\src\\module_2\\io_text_file\\read_csv\\";

    static public void readCSVFile(String fileName){

        try{
            String sourcePath = PATH + fileName;
            File file = new File(sourcePath);

            if(!file.exists()){
                throw new FileNotFoundException();
            }

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] arrStr;

            while ((line = bufferedReader.readLine())!= null){
                arrStr = line.split(",");
                for(String str: arrStr){
                    System.out.print(str + "\t");
                }
                System.out.println();
            }
        }
        catch (Exception e){
            System.out.println("File Not Found.");
        }
    }
}
