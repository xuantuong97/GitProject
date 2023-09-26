package module_2.io_binary_file.utils.impl;

import module_2.io_binary_file.utils.IIOByByteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractUtils<O> implements IIOByByteStream<O> {

//    @Override
//    public List<O> readByByteStream(String path) {
//
//        File file = null;
//        FileInputStream fileInputStream = null;
//        ObjectInputStream objectInputStream = null;
//
//        try{
//            file = new  File(path);
//            if(!file.exists()){
//                return new ArrayList<>();
//            }
//        }
//        catch (){
//
//        }
//        return null;
//    }
}
