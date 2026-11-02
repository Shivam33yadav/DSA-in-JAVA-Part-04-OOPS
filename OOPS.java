public class OOPS { // in java classes name start from capital and functions name starts from small
        public static void main(String[] args) {
            // to make actual object of pen
            Pen p1 = new Pen(); // constructor (created a pen object called p1)
              p1.setColor("Blue"); //.operator will use for p1 to call its function and pass the color
              System.out.println(p1.color); // print the color by p1.color
              // this gives ans blue

          //we can also set tip
              p1.setTip(5);// thickness
              System.out.println(p1.tip); // print tip

        }
    
}

class Pen{
    //properties + function
    //properties
    String color;
    int tip;

    //functions
    
    void setColor(String newColor){  // function return type is void... setcolor mein koi new color aaega as an argument
        color = newColor; //color is set as new color

    }
    void setTip(int newTip){ //new tip aaegi
        tip = newTip;// tip = newtip
    }
}

class Student{
    String name;
    int age ;
    float percentage;

    //how to calc percentage ...we make a function

    void calcPercentage(int phy, int chem, int maths){
        percentage = (phy + chem + maths) / 3;
    }
}

