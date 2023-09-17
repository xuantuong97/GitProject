package studentManagement.service.impl;

import studentManagement.model.Student;
import studentManagement.repository.IstudentRepo;
import studentManagement.repository.impl.StudentRepoImpl;
import studentManagement.service.IStudentService;

public class StudentServiceImpl implements IStudentService {

    private final IstudentRepo studentRepo
            = new StudentRepoImpl();

    @Override
    public void createStudent(Student student) {
        if (student == null){
            return;
        }
        studentRepo.createStudent(student);
    }

    @Override
    public Student[] getStudents() {
        return studentRepo.getStudents();
    }

    @Override
    public Student getDetail(int id) {
        if(id <= 0){
            return null;
        }
        return studentRepo.getDetail(id);
    }

    @Override
    public void updateStudent(Student newStudent) {

    }

    @Override
    public void deleteStudent(int id) {

    }
}
