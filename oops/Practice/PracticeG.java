

public class PracticeG { // find error
    public static void main(String[] args) {
        Test t = new Test();
        t.changeB(); //calling changeB
        System.out.println(Test.a + Test.b); // value of variable a + val... b
        
    }
}
    
    class Test{
        static int a = 10;
        static int b;  // by default 0
        static void changeB(){ //value chnges
            b = a* 3; 

        }
    }

