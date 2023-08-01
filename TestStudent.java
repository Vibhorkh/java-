class Student {
    // instance variables
    int rollno;
    String name;
    long phoneno;
    String addr;
    char gender;

    // static
    static String course;

    // static method
    static void show() {
        System.out.println("student details of JSD batch Mumbai");
    }

    // non-static method
    void display() {
        System.out.println(rollno + " " + name + " " + phoneno + " " + addr + " " + gender + " " + course);
    }
}

class TestStudent {
    // entry point
    public static void main(String[] args) {

        // access static variable
        Student.course = "Java Full Stack";

        // access static method
        Student.show();

        Student s1 = new Student(); // object creation
        s1.name = "mamta";
        s1.rollno = 14;
        s1.addr = "mumbai";
        s1.phoneno = 98765432;
        s1.gender = 'F';
        s1.display(); // calling method

        Student s2 = new Student(); // object creation
        s2.rollno = 13; // access instance variable
        s2.name = "sam";
        s2.addr = "mumbai";
        s2.phoneno = 93674732;
        s2.gender = 'a';
        s2.display(); // calling method

    }
}
