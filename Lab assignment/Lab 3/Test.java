
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Tạo đối tượng
        Account ac1 = new Account("123", "Ed", 1000, "Saving account");
        Account ac2 = new Account("124", "Lorrent", 1500, "Transaction account");
        Atm atm = new Atm();
        Scanner sc = new Scanner(System.in);

        //Chọn hành động muốn thực hiện
       System.out.println("Press 1 to withdraw\nPress 2 to deposit\nPress 3 to view account\nPress 4 to transfer");
       int choice = sc.nextInt();
        switch(choice){
            case 1:{
                atm.withdraw(ac1);
                break;
            }
            case 2:{
                atm.deposit(ac1);
                break;
            }
            case 3:{
                atm.viewamount(ac1);
                break;
            }
            case 4:{
                atm.transfer(ac1, ac2);
                break;
            }
            default:
                System.out.println("Error");
        }
        sc.close();
    }
}
