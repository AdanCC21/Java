abstract public class Account extends Bank{
    int id;
    int balance;

    String date_of_last_transaction;

    // Deposit
    abstract public void deposit(int amount);

    // retirar, intentar un throw catch
    abstract public boolean withdraw(int amount);

    //Trasnferir
    abstract public void transfer(Account target, int amount);


}
