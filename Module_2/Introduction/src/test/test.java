package test;

public class test {
    public static void main(String[] args) {
        Emp emp1 = new Emp();
        Person person1 = emp1;
        boolean a = (person1 instanceof Person);
        System.out.println(a);


//        Person person2 = new Emp();
//        Person student1 = (Student) person1;
//        person1.getOfPerson();
//        Student person2 = new Student();
    }

}
