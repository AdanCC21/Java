import java.util.ArrayList;
import java.util.List;

public class Bank {
    String name;
    List<AccuntHolder> ah_cont = new ArrayList<>();
    List<Account> acc_cont = new ArrayList<>();

    public Bank (){
        this.name = "CimaBank";
        this.ah_cont = new ArrayList<>();
    }

    public void createAccountHolder(int id, String name, String curp){
        AccuntHolder tempAch = new AccuntHolder(id,name,curp);
        ah_cont.add(tempAch);
        createAccount(id,0);
    }

    public void createAccount(int id, int balance){
        Account tempAccount = new Account(id,balance);
        acc_cont.add(tempAccount);

    }

}
