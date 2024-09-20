public class SavingAccount extends Account {
    double interest_rate = 0.16;

    public void calculateMonthlyIntereat(){
        double total= this.balance * interest_rate;
    }

}
