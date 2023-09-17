package studentManagement.repository;

import studentManagement.model.Student;

public interface IstudentRepo {

    void createStudent(Student student);

    Student[] getStudents();

    Student getDetail (int id);

    void updateStudent( Student newStudent);

    void deleteStudent(int id);

}
