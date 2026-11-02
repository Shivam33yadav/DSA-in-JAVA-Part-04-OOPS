

public class PracticeC {//what will be the output
    public static void main(String[] args) {
        Vehicle obj1 = new Car();
        obj1.print(); // concept of function Overriding because print function name is same for both   so print first derived class car

        Vehicle obj2 = new Vehicle();
        obj2.print();
        
    }
    
}
 class Vehicle{
    void print(){
        System.out.println("BAse class(Vehicle)");
    }
 }
  class Car extends Vehicle{
    void print(){  
        System.out.println("Derived class(Car)");
    }
  }