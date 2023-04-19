package sg.edu.nus.iss;


public class FixedDepositAccount extends BankAccount{
    private float interest;
    private Integer monthsDuration;
    private Boolean interestChanged;
    private Boolean monthsDurationChanged;
    private float accountBalance; //inherit

    

    // public FixedDepositAccount(String fullName, String accountNumber, Float accountBalance, List<String> transactions,
    //         Boolean closed, Date createdDate, Date closedDate, float interest, Integer monthsDuration,
    //         Boolean interestChanged, Boolean monthsDurationChanged, float accountBalance2) {
    //     super(fullName, accountNumber, accountBalance, transactions, closed, createdDate, closedDate);
    //     this.interest = interest;
    //     this.monthsDuration = monthsDuration;
    //     this.interestChanged = interestChanged;
    //     this.monthsDurationChanged = monthsDurationChanged;
    //     accountBalance = accountBalance2;
    // }

    public FixedDepositAccount(String fullName, float accountBalance, float interest) {
        super(fullName, accountBalance);
        this.interest = interest;
        this.monthsDuration = 6;
        this.accountBalance = accountBalance;

        this.interestChanged = false;
        this.monthsDurationChanged = false;
    }

    public FixedDepositAccount(String fullName, Float accountBalance) {
        super(fullName, accountBalance);
        this.interest = 3.0f;
        this.monthsDuration = 6;

        this.interestChanged = false;
        this.monthsDurationChanged = false;
        // this.fullName = fullName;
        // this.accountBalance = accountBalance;
    }

    public FixedDepositAccount(String fullName, float accountBalance, float interest, Integer monthsDuration){
        super(fullName, accountBalance);
        this.monthsDuration = monthsDuration;
        this.interest=interest;

        this.interestChanged = false;
        this.monthsDurationChanged = false;
    }

    public float getInterest() {
        return interest;
    }
    public void setInterest(float interest) {
        if(!interestChanged){
            this.interest = interest;
            this.interestChanged = true;
        }else{
            throw new IllegalArgumentException("Interest has already been changed once.");
        }

    }
    public Integer getMonthsDuration() {
        return monthsDuration;
    }
    public void setMonthsDuration(Integer monthsDuration) {
        if (!monthsDurationChanged){
            this.monthsDuration = monthsDuration;
            this.monthsDurationChanged = true;
        }else{
            throw new IllegalArgumentException("Duration has already been changed once.");
        }
    }

    public Boolean getInterestChanged() {
        return interestChanged;
    }

    //this should probably be removed as it allows you to set back to false and change interest again
    public void setInterestChanged(Boolean interestChanged) {
        this.interestChanged = interestChanged;
    }
    public Boolean getMonthsDurationChanged() {
        return monthsDurationChanged;
    }

    // this should probably be removed as it allows you to set back to false and change the months again
    public void setMonthsDurationChanged(Boolean monthsDurationChanged) {
        this.monthsDurationChanged = monthsDurationChanged;
    }
    public Float getAccountBalance() {
        return super.getAccountBalance()*(100+interest*monthsDuration/12)/100;
    }
    // commenting away the setAccountBalance so that it cannot be changed anymore once it is set?
    // public void setAccountBalance(float accountBalance) {
    //     this.accountBalance = accountBalance;
    // }

    @Override
    public void deposit(float amount) {
        super.deposit(amount);
        System.out.println("No Deposit Operation allowed.");
    }

    @Override
    public void withdraw(float withdrawalAmount) {
        super.withdraw(withdrawalAmount);
        System.out.println("No Withdrawal Operation allowed.");
    }
    

}
