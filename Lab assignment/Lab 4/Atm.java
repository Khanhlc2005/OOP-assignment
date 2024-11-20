import java.util.Scanner;

public class Atm{

    private final Scanner sc;

    public Atm(){
        sc = new Scanner(System.in);
    }

    //Withdraw method
    public void withdraw(Account ac){
        //Nhập số tiền cần rút
        System.out.println("Enter an amount to withdraw: ");

        double amount1 = sc.nextDouble();
        //Kiểm tra tiền trong tài khoản có lớn hơn số tiền cần rút ko và số tiền rút lớn hơn 0
        if (ac.getAmount() >= amount1 && amount1 > 0){
            ac.withdraw(amount1);
            System.out.println("Withdraw successful");
            System.out.println("Amount in account: " + ac.getAmount());
        }
        else{
            System.out.println("Error");
        }
    }
    
    //Deposit method
    public void deposit(Account ac){
        System.out.println("Enter an amount to deposit: ");
        double amount2 = sc.nextDouble();
        ac.deposit(amount2);
        System.out.println("Amount in account: " + ac.getAmount());
    }

    //Transfer method
    public void transfer(Account ac1, Account ac2){
        System.out.println("Enter an amount to transfer: ");
        double amount3 = sc.nextDouble();
        //Kiểm tra tiền trong tài khoản có lớn hơn số tiền cần rút ko và số tiền rút lớn hơn 0
        if (ac1.getAmount() >= amount3 && amount3 > 0){
            ac1.withdraw(amount3);
            ac2.deposit(amount3);
            System.out.println("Transfer successful");
            System.out.println("Amount in account 1: " + ac1.getAmount());
            System.out.println("Amount in account 2: " + ac2.getAmount());
        }
        else{
            System.out.println("Error");
        }
    }

    //View method
    public void viewamount(Account ac){
        System.out.println("\nInformation");
        System.out.println("Account No: " + ac.getAccountNo());
        System.out.println("Owner Name: " + ac.getOwnerName());
        System.out.println("Accout Type: " + ac.getAccountType());
        System.out.println("Amount: " + ac.getAmount());
    }
    
    public void close(){
        sc.close();
    }
}