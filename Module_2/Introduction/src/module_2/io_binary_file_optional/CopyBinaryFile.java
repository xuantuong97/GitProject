package module_2.io_binary_file_optional;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyBinaryFile {
    private static List<Object> read(String path) {

        File file ;
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        try{
            file = new  File(path);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);

            return (List<Object>) objectInputStream.readObject();
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        catch (IOException | ClassNotFoundException e){
            System.out.println("Error");
        }
        finally {
            try{
                if(objectInputStream != null){
                    objectInputStream.close();
                }
                if(fileInputStream != null){
                    fileInputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Error");
            }
        }
        return new ArrayList<>();
    }

    public static void copy(String source, String target){
        File file;
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try{
            file = new File(target);
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            List<Object> list = read(source);
            objectOutputStream.writeObject(list);
            System.out.println("Size of file: "+ file.length());

        } catch (FileNotFoundException e) {
            System.out.println("Error");
        } catch (IOException e) {
            System.out.println("Error");
        }
        finally {
            try {
                if(objectOutputStream != null){
                    objectOutputStream.close();
                }
                if(fileOutputStream != null){
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Error");
            }
        }
    }
}
