

public class PracticeB {
    public static void main(String[] args) {
       Student s = new Student();
       s.name = "Shivam";
       s.weight = 65;
       System.out.println(s.name);
       System.out.println(s.weight);
    
    }
    
}
class Person{ // multiple inheritance
    String name ;
    int weight;


}
class Student extends Person{ //student sari inherit kr rha h
    int rollNumber; // ist variable  // ye dono propreties person k andr nhi ja rhi thats why it can never accces roll number and schol name .. it will accesonly anme and weight
    String schoolName;//2nd variable 
}
