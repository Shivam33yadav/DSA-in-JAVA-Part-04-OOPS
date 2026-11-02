import java.util.*;

public class AEncapsulation {  // oops have four main branches 1) encap, inheri,abstr,polymo
     public static void main(String[] args) {
        //Student s1 = new Student("Shivam");
        //System.out.println(s1.name);
        Student s1 = new Student();
        
     }

    
}
class Student{
    String name;
    int roll;

    // to initialise student we made a constructor
    //Student(String name){ 
        //this.name = name;
        Student(){
        System.out.println("Constructor is called");
    }
}


