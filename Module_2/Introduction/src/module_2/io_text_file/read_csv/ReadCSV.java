package module_2.io_text_file.read_csv;

import java.io.*;

public class ReadCSV {

    static final String PATH = "C:\\Users\\ADMIN\\Documents\\GitProject\\Module_2\\Introduction\\src\\module_2\\io_text_file\\read_csv\\";

    static public void readCSVFile(String fileName){
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try{
            String sourcePath = PATH + fileName;
            File file = new File(sourcePath);

            if(!file.exists()){
                throw new FileNotFoundException();
            }

             fileReader = new FileReader(file);
             bufferedReader = new BufferedReader(fileReader);
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
}
