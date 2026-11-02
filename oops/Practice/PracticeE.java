


public class PracticeE {  // output?
    public static void main(String[] args) {
        System.out.println(Book.count);
        Book b1 = new Book(1500);
        Book b2 = new Book(2500);
        System.out.println(Book.count);
        
    }
    
}
class Book {
    int price;
    static int count;  // kitni hi books bna le unke liye count ek hi rehga   ... initialise with 0

    public Book(int price){ // book is constructor and price as a parameter
        this.price = price;
        count++;

    }
}
