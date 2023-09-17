package studentManagement.service;

import studentManagement.model.Student;

public interface IStudentService {

    void createStudent(Student student);

    Student[] getStudents();

    Student getDetail(int id);

    void updateStudent(Student newStudent);

    void deleteStudent(int id);
}
