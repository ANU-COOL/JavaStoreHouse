/*
    Problem Statement:
    Min interest rate - 4% per annum(for savings) set br rbi.
    WAP to implement bank functionality having the following classes:
    customer, account, rbi class
    derived classes: sbi, kotak.
    getInterestRate and getWithdrawalLimit
 */
class Customer{
    private String name;
    private int age;
    //constructor of class customer
    public Customer(String name, int age){
        this.name = name;
        this.age = age;
    }
    //getters

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
class Account{
    private String accountType;
    private int accountNo;
    //constructor of class account
    public Account(String accountType, int accountNo){
        this.accountType = accountType;
        this.accountNo = accountNo;
    }

    //getters

    public String getAccountType() {
        return accountType;
    }

    public int getAccountNo() {
        return accountNo;
    }
}
class Rbi{
    private int interestRate;
}
class Sbi extends Rbi{

}
class Kotak extends Rbi{

}
public class BankManagement {
    public static void main(String[] args) {

    }
}
