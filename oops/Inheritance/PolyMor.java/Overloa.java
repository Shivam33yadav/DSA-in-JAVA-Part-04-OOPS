

public class Overloa {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        //call calc.sum
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum((float)1.5,(float) 25.50));
        System.out.println(calc.sum(5, 10, 15));
    }
    
}
class Calculator{
    int sum(int a, int b){
        return a +b;


    }
    float sum(float a, float b){
        return a + b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}