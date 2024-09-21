import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CheckingAccount extends Account {
    // Constructor
    public CheckingAccount(int id, int balance){
        this.id = id;
        this.balance = balance;
        this.date_of_last_transaction="Without any transaction";
    }

    // Constructor
    public CheckingAccount(){
        this.id = -1;
        this.balance = -1;
        this.date_of_last_transaction="Without any transaction";
    }

    @Override
    public void deposit(int amount){
        this.balance +=amount;
    }

    @Override
    public boolean withdraw(int amount){
        if(this.balance >= amount){
            this.balance-=amount;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void transfer(Account target, int amount){

        if(this.balance >= amount){
            target.deposit(amount);
            this.balance-=amount;
            LocalDateTime temp_date = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            this.date_of_last_transaction = temp_date.format(formatter);
        }else{
            System.out.println("Fondos insuficiente");
        }
    }
}
