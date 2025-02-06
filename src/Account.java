package src;

public class Account{

    private String customer;
    private double balance;

    //Constructor
    public Account(){
        this.customer = "[Name Not Provided]";
        this.balance = -1;
    }
    public Account(String customer){
        this.customer = customer;
        this.balance = -1;
    }
    public Account(double balance){
        this.customer = "[Name Not Provided]";
        this.balance = balance;
    }
    public Account(String customer, double balance){
        this.customer = customer;
        this.balance = balance;
    }

    //Methods
    public String getCustomer(){
        return this.customer;
    }

    public void setCustomer(String customer){
        this.customer = customer;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setBalance(){
        this.balance = balance;
    }

    public void printAccount(){
        System.out.println("Account Info:");
        System.out.println(getCustomer() + " has a balance of: $" + getBalance());
    }

    public static void main(String[] args) {
        Account account = new Account();
        Account account1 = new Account("Boo", 23390.89);
        account.printAccount();
        account1.printAccount();
    }
}
