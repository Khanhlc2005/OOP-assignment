public class Account{

    //Thuộc tính
    private String accountNo;
    private String ownerName;
    private String accountType;
    private double amount;

    //Hàm tạo đầy đủ 
    public Account(String accountNo, String ownerName, double amount, String accountType){
        this.accountNo = accountNo;
        this.ownerName = ownerName;
        this.amount = amount;
        this.accountType = accountType;
    }

    //Method
    public void deposit(double value){
        if (value > 0)
            this.amount += value;
        else 
            System.out.println("Error");
    }
    public void  withdraw(double value){
            this.amount -= value;
    }

    //Setter 
    public void setAccountNo(String accountNo){
        this.accountNo = accountNo;
    }
    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }
    public void setAmount(double amount){
        this.amount = amount;
    }
    public void setType(String accountType){
        this.accountType = accountType;
    }

    //Getter 
    public String getAccountNo(){
        return accountNo;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public double getAmount(){
        return amount;
    }
    public String getAccountType(){
        return accountType;
    }

}