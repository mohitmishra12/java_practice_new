package Arrays;


import javax.xml.namespace.QName;
class Student {
    String name;

    Student(String n) {
        name = n;
    }

    void display() {
        System.out.println(name);
    }
}


public class ConstractorJava {
    public static void main(String[] args) {

        Student  nn = new Student("mohit");
        nn.display();
    }
}
