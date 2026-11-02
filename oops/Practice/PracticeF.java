

public class PracticeF { //find error in which line if yes then find
    public static void main(String[] args) {
        Test t = new Test();
        t.set_marks(98);// line 2
        System.out.println(Test.marks); // line 3
        
    }
    
}
class Test{
    static int marks;
    void set_marks(int marks){
        this.marks = marks; // line1
    } 

}

