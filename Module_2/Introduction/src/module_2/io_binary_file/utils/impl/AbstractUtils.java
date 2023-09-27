package module_2.io_binary_file.utils.impl;

import module_2.io_binary_file.utils.IIOByByteStream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractUtils<O> implements IIOByByteStream<O> {

    @Override
    public List<O> readByByteStream(String path) {

        File file ;
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        try{
            file = new  File(path);
            if(!file.exists()){
                return new ArrayList<>();
            }
            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);

            return (List<O>) objectInputStream.readObject();
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

    @Override
    public void writeByByteStream(String path, List<O> data) {
        File file;
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try{
            file = new File(path);
            if(!file.exists()){
                file.createNewFile();
            }

            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
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
                throw new RuntimeException(e);
            }
        }
    }
}
