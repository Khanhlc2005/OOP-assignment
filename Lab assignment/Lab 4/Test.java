
import java.util.Scanner;

public class Test {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        //Tạo đối tượng
        SavingAccount ac1 = new SavingAccount("123", "Ed", 1000, "Saving account", 0.02, 2);
        Account ac2 = new Account("124", "Lorrent", 1500, "Transaction account");
        Atm atm = new Atm();
        Scanner sc = new Scanner(System.in);

        //Chọn hành động muốn thực hiện
       System.out.println("Press 1 to withdraw\nPress 2 to deposit\nPress 3 to view account\nPress 4 to transfer");
       int choice = sc.nextInt();
        switch(choice){
            case 1 -> {
                atm.withdraw(ac1);
            }
            case 2 -> {
                atm.deposit(ac1);
            }
            case 3 -> {
                atm.viewamount(ac1);
            }
            case 4 -> {
                atm.transfer(ac1, ac2);
            }
            default -> System.out.println("Error");
        }
        sc.close();
    }
}
