import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Account extends Bank{
    int id;
    int balance;

    String date_of_last_transaction;



    // Constructor
    public Account(int id, int balance){
        this.id = id;
        this.balance = balance;
        this.date_of_last_transaction="Without any transaction";
    }

    // Constructor
    public Account(){
        this.id = -1;
        this.balance = -1;
        this.date_of_last_transaction="Without any transaction";
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
            this.balance-=amount;
            LocalDateTime temp_date = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            this.date_of_last_transaction = temp_date.format(formatter);
        }else{
            System.out.println("Fondos insuficiente");
        }
    }

}
