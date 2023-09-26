package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void writeDataToFile(String path, List<MyStudent> myStudents){
        try{
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oss = new ObjectOutputStream(fos);
            oss.writeObject(myStudents);
            oss.close();
            fos.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String path = "C:\\Users\\ADMIN\\Documents\\GitProject\\Module_2\\Introduction\\src\\test\\students.txt";
        List<MyStudent> students = new ArrayList<>();
        students.add(new MyStudent(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new MyStudent(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new MyStudent(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new MyStudent(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new MyStudent(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        writeDataToFile(path, students);

        List<MyStudent> studentDataFromFile = readDataFromFile(path);
        for (MyStudent student : studentDataFromFile){
            System.out.println(student);
        }


    }

    public static List<MyStudent> readDataFromFile(String path){
        List<MyStudent> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<MyStudent>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return students;
    }

}
