

public class PracticeD {
    public static void main(String[] args) {
        Vehicle obj1 = new Car(); // object car hi hai but reference is vehicle
        obj1.print1(); // object1 is vehicle type in this only print will recognise not print1 because 
        // in vehicle there is only print fuction not print1 so it understood only print func
         // so we never call from this vehiclwe object on print1
         // so this is an error
        Vehicle obj2 = new Vehicle();
        obj2.print();
    }
    
}
class Vehicle{
    void print(){
        System.out.println("Base class(Vehicle)");
    }
}
class Car extends Vehicle{
    void print1(){ // this is different function
        System.out.println("Derived class(Car)");
    }
}