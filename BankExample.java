public class BankExample {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Shivam Yadav"; // try to set username
      //  myAcc.Password = "abcefghi"; // error
        // we use 
        myAcc.setPassword("abcdefghi"); 

    }
    
}
class BankAccount{
    public String username;
    private String Password;  // this will be private not accessible outside the class 
    public void setPassword(String pwd){ // here we can accesible
        Password = pwd; // 
    }
}
