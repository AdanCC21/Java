import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SavingAccount extends Account {
    double interest_rate = 0.16;

    public void calculateMonthlyIntereat(){
        double total= this.balance * interest_rate;
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

}
