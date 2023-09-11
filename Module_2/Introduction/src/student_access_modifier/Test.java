package student_access_modifier;

import access_modifier.TestCircle;

public class Test {
    public static void main(String[] args) {
        Student test = new Student();

        test.setName("Tuong");
        test.setClasses("C07");
    }
}
// Get error if set access modifier of setName(), setClasses() is private.
// Can change access modifier to protected or default.
