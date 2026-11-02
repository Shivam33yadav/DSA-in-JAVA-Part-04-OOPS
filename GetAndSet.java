public class GetAndSet { 
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());

        p1.setColor("yellow");
        System.out.println(p1.getColor());

        
    }
     
    
}
class Pen{
   private String color;
   private int tip;
    //made get
    String getColor(){
        return this.color;// this is special keyword for current object ...jo object call kr rhi h uske properties ki baat kr rhe

    }
   // we made get tip
   int getTip(){
    return this.tip;
   }


    void setColor(String newColor){
       this.color = newColor;
    }

    void setTip(int Tip){//same name variable we use this ....here it tells this is external variable
       this.tip = Tip; // this .tip tells tip property pen k andr ki h
    }
}