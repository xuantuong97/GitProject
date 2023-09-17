package studentManagement.model;

public class Student {
    private int id;
    private String name;
    private String DOB;
    private String gender;

    public Student(){}

    public Student(int id, String name, String DOB, String gender) {
        this.id = id;
        this.name = name;
        this.DOB = DOB;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", DOB='" + DOB + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
