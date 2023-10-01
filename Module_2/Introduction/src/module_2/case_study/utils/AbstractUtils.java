package module_2.case_study.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractUtils<E> implements IUtils<E>{


    @Override
    public List<String> readFile(String path) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try{
            File file = new File(path);
            if(!file.exists()){
                return new ArrayList<>();
            }

            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            List<String> data = new ArrayList<>();
            String str;
            while((str = bufferedReader.readLine()) != null){
                data.add(str);
            }
            return data;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (bufferedReader != null){
                    bufferedReader.close();
                }
                if(fileReader != null){
                    fileReader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void writeFile(String path, List<String> data) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try{
            File file = new File(path);
            if(!file.exists()){
                file.createNewFile();
            }
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);

            for(String str: data){
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try{
                if(bufferedWriter != null){
                    bufferedWriter.close();
                }
                if(fileWriter != null){
                    fileWriter.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
