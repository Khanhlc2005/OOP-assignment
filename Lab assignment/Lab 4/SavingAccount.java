public class SavingAccount extends Account{
    //Attribute
    private double interest;
    private double term;

    //Constructor
    public SavingAccount(String accountNo, String ownerName, double amount, String accountType, double interest, double term){
        super(accountNo, ownerName, amount, accountType);
        this.interest = interest;
        this.term = term;
    }

    //Setter
    public void setInterest(double interest){
        if (interest > 0)
            this.interest = interest;
    }
    public void setTerm(double term){
        if (term > 0)
            this.term = term;
    }

    //Getter
    public double getInterest(){
        return interest;
    }
    public double getTerm(){
        return term;
    }

    //CalculateInterest method
    public void  calculateInterest(){
        double interestAmount = getAmount() + (getAmount() * interest) * term;
        super.deposit(interestAmount); 
    }

    //deposit method
    @Override
    public void deposit(double value){
        super.deposit(value);
        calculateInterest();
    }

    //withdraw method
    @Override
    public void withdraw(double value){
            super.withdraw(value);
            calculateInterest();
    }
}
