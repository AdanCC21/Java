public class Account extends Bank{
    int id;
    int balance;

    // date of last transaction
    int day=0;
    int month=0;
    int year=0;

    // Constructor
    public Account(int id, int balance){
        this.id = id;
        this.balance = balance;
    }

    // Deposit
    public void deposit(int amount){
        this.balance +=amount;
    }

    // retirar, intentar un throw catch
    public boolean withdraw(int amount){
        if(this.balance >= amount){
            this.balance-=amount;
            return true;
        }else{
            return false;
        }
    }

    //Trasnferir
    public void transfer(Account target, int amount){
        if(this.balance >= amount){
            target.deposit(amount);
        }else{
            System.out.println("Fondos insuficiente");
        }
    }

    public void print(){
        System.out.println("Id : "+this.id+" Balance : "+this.balance);
        System.out.println("Last transaction "+this.day + this.month + this.year);
    }

}
