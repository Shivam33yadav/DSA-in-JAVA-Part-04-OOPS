

public class Hierarchi {
    public static void main(String[] args) {
        Mammals lion = new Mammals();
      lion.eat();
      lion.breadth();
      lion.walk();

      Fish whale = new Fish();
      whale.eat();
      whale.swim();

      Bird sparrow = new Bird();
      sparrow.fly();
      

      }
        
    }
    

class Animal{
    String color;
    void eat(){
       System.out.println("eats");
    }
    void breadth(){
        System.out.println("Breadth");

    }
    
}
class Mammals extends Animal{
    void walk(){
        System.out.println("Can walk");
    }

}
class Fish extends Animal{
    void swim(){
        System.out.println("Swim");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("Flies");
    }
}