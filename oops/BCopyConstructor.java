import java.util.*;

public class BCopyConstructor {
    public static void main(String[] args) {
        
    Student s1 = new Student();
    s1.name = "shivam";
    s1.roll = 456;
    s1.password = "abcd";
    s1.marks[0] = 100;
    s1.marks[1] = 90;
    s1.marks[2] = 80;

    }   
}
class Student{
    String name;
    int roll;
    String password;
    int marks[];
    

    //shalllow copy constructor
   // Student(Student s1){
      //  this.name = s1.name;
      //  this.roll = s1.roll;
      //  this.marks = s1.marks; // it reflects
  //  }
    //deep copy constructor for this we need shallow commen tout
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        // to copy marks we run a loop
        for(int i =0; i<marks.length;i++){
            this.marks[i] = s1.marks[i]; // it do not reflect change
        }
    }
    Student() {
        marks = new int[3];
        System.out.println("Constructor is called");

    }

}