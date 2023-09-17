package studentManagement.repository.impl;

import studentManagement.model.Student;
import studentManagement.repository.IstudentRepo;

public class StudentRepoImpl implements IstudentRepo {

    private Student[] students = new Student[]{
            new Student(1, "tuong", "10-02", "male")
    };

    @Override
    public void createStudent(Student student) {
        Student[] newStudents = new Student[students.length + 1];
        for( int i = 0; i<students.length; i++){
            newStudents[i] = students[i];
        }
        student.setId(newStudents.length);
        newStudents[newStudents.length - 1] = student;
        students = newStudents;
    }

    @Override
    public Student[] getStudents() {
        return students;
    }

    @Override
    public Student getDetail(int id) {
        for(Student student : students){
            if(student.getId() == id){
                return student;
            }
        }
        return null;
    }

    @Override
    public void updateStudent(Student newStudent) {

    }

    @Override
    public void deleteStudent(int id) {

    }
}
