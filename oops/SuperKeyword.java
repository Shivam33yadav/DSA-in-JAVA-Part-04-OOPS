public class SuperKeyword {
    public static void main(String[] args) {
        
    
      Horse h = new Horse();
      System.out.println(h.color);
    }
}
class Animal{
    String color;
    Animal() { // constructor of Animal
        System.out.println("Animal constructor is called");
    }
}
  class Horse extends Animal{
    Horse(){
        // constructor of horse
       // super();  // isse animal class ka const call ho jaega
       super.color = "brown";
        System.out.println("Horse const is called");
    }
  }