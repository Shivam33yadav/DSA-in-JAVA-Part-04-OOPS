

public class Abstra { // we can not make an object in abstact class
    public static void main(String[] args) {
      Mustang myHorse = new Mustang();
      //Animal inherit horse horse inherit mustang   ANimal -> horse -> Mustang
        //making an object
     //   Horse h = new Horse();
       //now we can call for horse eat as well as walk
       //h.eat();
     //  h.walk();
     //  System.out.println(h.color); // when we make child class object  toh horse ka constructor callnhi hota sbse pehel uski super class ka (Animal call befor horse).. output brown 

    // Chicken c = new Chicken();

     // c.eat();
     // c.walk();

      // if we think that we create the class of animal 
      //Animal a = new Animal() ;  it gives error we can not create an object of animal  abstract classe k object create krenge then error 
         // weired thing we can not create object of class but we can create constructor

      
     
    }
    
}
  abstract class Animal{// making constructor 
    //Animal(){//every animal have skin color
      String color ;
      Animal(){
        System.out.println("Animal constructor called");
     color = "brown";
      }

    void eat(){
        System.out.println("Animal eats");
    }

    abstract void walk(); // walk depend on horse and chicken not on animal thatswhy abstractiom  .. walk function exist in all not gives implemntation it gives ide and that idea is implemented by horse and chicken
  }

  class Horse extends Animal{
    // make constructor of horse because it extends  // walk method is compulsory for horse
    Horse(){
      System.out.println(" Horse constructor called");
    }
    void changeColor(){
        color = " DarkBrown";
    }
    void walk(){
        System.out.println("walks on 4 legs"); // implemented in hosrse class
    }
  }
  // horse ko extend krne wali class bna lete
  class Mustang extends Horse{
    Mustang (){
      System.out.println("Mustang constructor caled"); // now make in main function
    }
  }

    class Chicken extends Animal{
      void changeColor(){
        color = " yellow";
      }
        void walk(){
           System.out.println("walks on two legs");  // differnt implementation
        }
    }

  