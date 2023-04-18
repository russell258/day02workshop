package sg.edu.nus.iss;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankAccount {
    private final String fullName;
    private String accountNumber;
    private Float accountBalance;
    private List<String> transactions;
    private Boolean closed;
    private Date createdDate;
    private Date closedDate;
    
    public BankAccount(String fullName, String accountNumber) {
        this.fullName = fullName;
        this.accountNumber = accountNumber;
        this.accountBalance = 0.0f;

        this.createdDate = new Date();
        transactions = new ArrayList<>();
    }

    public BankAccount(String fullName, Float accountBalance) {
        this.fullName = fullName;
        this.accountBalance = accountBalance;
    }

    public BankAccount(String fullName, String accountNumber, Float accountBalance) {
        this.fullName = fullName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.closed = false;

        this.createdDate = new Date();
        transactions = new ArrayList<>();
    }

    public BankAccount(String fullName, String accountNumber, Float accountBalance, List<String> transactions,
            Boolean closed, Date createdDate, Date closedDate) {
        this.fullName = fullName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.transactions = transactions;
        this.closed = closed;
        this.createdDate = createdDate;
        this.closedDate = closedDate;
        this.closed = false;
    }


    public String getFullName() {
        return fullName;
    }


    public String getAccountNumber() {
        return accountNumber;
    }


    public Float getAccountBalance() {
        return accountBalance;
    }


    public void setAccountBalance(Float accountBalance) {
        this.accountBalance = accountBalance;
    }


    public List<String> getTransactions() {
        return transactions;
    }


    public void setTransactions(List<String> transactions) {
        this.transactions = transactions;
    }


    public Boolean getClosed() {
        return closed;
    }


    public void setClosed(Boolean closed) {
        this.closed = closed;

        this.closedDate = new Date();
    }


    public Date getCreatedDate() {
        return createdDate;
    }


    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }


    public Date getClosedDate() {
        return closedDate;
    }


    public void setClosedDate(Date closedDate) {
        this.closedDate = closedDate;
    }


    public void deposit(float amount){
        if (closed){
            throw new IllegalArgumentException("Account is closed");
        }

        if (amount <0) {
            throw new IllegalArgumentException("Please enter a valid amount");
        }else{
            accountBalance = accountBalance + amount;
            Date dt = new Date();
            this.transactions.add(amount + " SGD was deposited to account " + accountNumber + " on " + dt.toString());
        }
    }

    public void withdraw(float withdrawalAmount){
        if (closed){
            throw new IllegalArgumentException("Account is closed");
        }
        if (withdrawalAmount > accountBalance){
            throw new IllegalArgumentException("Withdrawal limit exceeded / Account Balance is inadequete");
        }else{
            accountBalance = accountBalance - withdrawalAmount;
            Date dt = new Date();
            this.transactions.add(withdrawalAmount + " SGD was withdrawn from account "+ accountNumber + " on " + dt.toString());
        }
    }

    @Override
    public String toString() {
        return "BankAccount [fullName=" + fullName + ", accountNumber=" + accountNumber + ", accountBalance="
                + accountBalance + ", transactions=" + transactions + ", closed=" + closed + ", createdDate="
                + createdDate + ", closedDate=" + closedDate + "]";
    }

    public void showAccount(){
        System.out.println("Account fullname :"+ fullName);
        System.out.println("Account No. "+ accountNumber);
        System.out.println("Balance: " + accountBalance);
    }

}
