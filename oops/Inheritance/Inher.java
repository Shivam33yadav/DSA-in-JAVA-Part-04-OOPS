import java.util.*;

public class Inher {
    public static void main(String[] args) {
          Fish shark = new Fish();
    shark.eat();
    shark.breadth();
    shark.swim();
        
    }
}

class Animal{
    // this is the base class
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breadth(){
        System.out.println("Breadths");
    }
}
  // derived class subclass
  class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swim");
    }
}