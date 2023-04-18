package sg.edu.nus.iss;

import java.util.Date;
import java.util.List;

public class FixedDepositAccount extends BankAccount{
    private float interest;
    private Integer monthsDuration;
    private Boolean interestChanged;
    private Boolean monthsDurationChanged;
    private float accountBalance;

    

    public FixedDepositAccount(String fullName, String accountNumber, Float accountBalance, List<String> transactions,
            Boolean closed, Date createdDate, Date closedDate, float interest, Integer monthsDuration,
            Boolean interestChanged, Boolean monthsDurationChanged, float accountBalance2) {
        super(fullName, accountNumber, accountBalance, transactions, closed, createdDate, closedDate);
        this.interest = interest;
        this.monthsDuration = monthsDuration;
        this.interestChanged = interestChanged;
        this.monthsDurationChanged = monthsDurationChanged;
        accountBalance = accountBalance2;
    }

    public FixedDepositAccount(String fullName, String accountNumber, float interest, Integer monthsDuration,
            Boolean interestChanged, Boolean monthsDurationChanged, float accountBalance) {
        super(fullName, accountNumber);
        this.interest = interest;
        this.monthsDuration = monthsDuration;
        this.interestChanged = interestChanged;
        this.monthsDurationChanged = monthsDurationChanged;
        this.accountBalance = accountBalance;
    }

    public FixedDepositAccount(String fullName, String accountNumber, Float accountBalance, float interest,
            Integer monthsDuration, Boolean interestChanged, Boolean monthsDurationChanged, float accountBalance2) {
        super(fullName, accountNumber, accountBalance);
        this.interest = interest;
        this.monthsDuration = monthsDuration;
        this.interestChanged = interestChanged;
        this.monthsDurationChanged = monthsDurationChanged;
        accountBalance = accountBalance2;
    }

    public float getInterest() {
        return interest;
    }
    public void setInterest(float interest) {
        this.interest = interest;
    }
    public Integer getMonthsDuration() {
        return monthsDuration;
    }
    public void setMonthsDuration(Integer monthsDuration) {
        this.monthsDuration = monthsDuration;
    }
    public Boolean getInterestChanged() {
        return interestChanged;
    }
    public void setInterestChanged(Boolean interestChanged) {
        this.interestChanged = interestChanged;
    }
    public Boolean getMonthsDurationChanged() {
        return monthsDurationChanged;
    }
    public void setMonthsDurationChanged(Boolean monthsDurationChanged) {
        this.monthsDurationChanged = monthsDurationChanged;
    }
    public Float getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    

}
