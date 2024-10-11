package PaymentProcessing;

public class CreditCard {
    private double balance;
    private int code;
    public CreditCard(int code,double balance){
        this.balance=balance;
        this.code=code;
    }
    public double getBalance() {
        return balance;
    }
    public int getCode() {
        return code;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public boolean payment(double total){
        boolean test=false;
        if (balance>=total){
            balance=balance-total;
            System.out.println("payment is done successfully");
            test=true;
        }
        else{
            System.out.println("insufficient balance");
        }
        return test;
    }
}
