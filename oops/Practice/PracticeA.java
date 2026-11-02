import java.util.*;

public class PracticeA { // assign name to object
    public static void main(String[] args) {
        Student s = new Student(); // is object ko anme assign krna 
        s.name = "Shivam ";
        System.out.println(s.name);
    }
    
}
class Student{
    String name;
    int marks;
}

