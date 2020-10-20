package Exercise;//Account类模拟账户

public class Object_3 {
    public static void main(String args[]){
        Account a1 = new Account("JaneSmith",1000,2000, (float) 0.0123);
        a1.deposit(100);
        a1.withdraw(960);
        a1.withdraw(2000);
        System.out.println("Account:"+a1.getId()+" Balance:"+a1.getBalance()+" AnnualInterestRate:"+a1.getBalance());
    }
}
class Account{
    private String name;
    private int id;//id
    private float balance;//余额
    private float annualInterestRate;//年利率
    int getId(){
        return id;
    }
    void setId(int a){
        System.out.println("The current id is "+id);
        id=a;
        System.out.println("The id after the change is "+id);
    }
    float getBalance(){
        return balance;
    }
    void setBalance(float a){
        System.out.println("The current balance is "+balance);
        balance = a;
        System.out.println("The balance after the change is "+id);
    }
    float getAnnualInterestRate(){
        return annualInterestRate;
    }
    void setAnnualInterestRate(float a){
        System.out.println("The current annual interest rate is "+annualInterestRate);
        annualInterestRate=a;
        System.out.println("The annual interest rate after the change is "+annualInterestRate);
    }
    public Account(){
    }
    public Account(String d,int a,float b,float c){
        name=d;
        id=a;
        balance=b;
        annualInterestRate=c;
    }
    void withdraw(float a){
        if (a>balance){
            System.out.println("error");
            return;
        }
        System.out.println("The current balance is "+balance);
        balance-=a;
        System.out.println("The current balance is "+balance+",Withdrawal amount:"+a);
    }
    void deposit(float a){
        System.out.println("The current balance is "+balance);
        balance+=a;
        System.out.println("The current balance is "+balance+",Deposit amount:"+a);
    }

}