package oops;

public class f2 {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "sudhanshu shekhar";
        myAcc.setPassword("sudhanshu"); 
    }
}
class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}