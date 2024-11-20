public abstract class TransactionAccount extends Account{
    
    //Constructor
    public TransactionAccount(String accountNo, String ownerName, double amount, String accountType){
        super(accountNo, ownerName, amount, accountType);
    }

    //Abstract method
    public void deposit(){};
    public void withdraw(){};
}
