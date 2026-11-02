

public class MultiLev {
    public static void main(String[] args) {
        //object of dog
        Dog dobby = new Dog();
        dobby.eat(); // for dobby we can call eat function
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
    
}
class Animals{
    String color;

    void eat(){
        System.out.println("Eats");
    }
    void breadth(){
        System.out.println("Breadths");
    }
}
   class Mammals extends Animals{
    int legs;

   }
  class Dog extends Mammals{
    String breed;
  }