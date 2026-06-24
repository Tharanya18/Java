package Day1;

class BankAccount {

    int accountNumber; // instance variable
    String holderName; // instance variable
    BankAccount(int accountNumber, String holderName) {
        // this keyword 
        this.accountNumber = accountNumber;
        this.holderName = holderName;
    }

    void display() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name : " + holderName);
    }
}
public class Exp16 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(1001, "Deepa");
        b1.display();
    }
}
