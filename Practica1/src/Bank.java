import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Bank {
    String name;
    List<AccuntHolder> ah_cont = new ArrayList<>();
    List<Account> acc_cont = new ArrayList<>();

    HashMap <Integer, AccuntHolder> ahCont = new HashMap<>();
    HashMap <Integer, Account> acCont = new HashMap<>();

    public Bank (){
        this.name = "CimaBank";
        this.ah_cont = new ArrayList<>();
    }

    public void createAccountHolder(int id, String name, String curp){
        AccuntHolder tempAch = new AccuntHolder(id,name,curp);
//        ah_cont.add(tempAch);
        ahCont.put(id,tempAch);
        createAccount(id,0);
    }

    public void createAccount(int id, int balance){
        Account tempAccount = new CheckingAccount(id,balance);
//        acc_cont.add(tempAccount);
        acCont.put(id,tempAccount);

    }

    public Account getAccount(int id){
//        for(int i =0;i<= acCont.size();i++){
//            Account temp = acCont.get(i);
//            if(temp != null){
//                if(temp.id == id){
//                    return temp ;
//                }
//            }
//        }
//        return  null;
        for(Account temp : acCont.values()){
            if(temp.id == id){
                return temp;
            }
        }
        return null;
    }

    public AccuntHolder getAccountHolder(int id){
//        for(int i =0; i<= acc_cont.size();i++){
//            AccuntHolder temp = ah_cont.get(i);
//
//            if(temp.id == id){
//                return temp;
//            }
//        }
//        return  null;
        for(AccuntHolder temp : ahCont.values()){
            if(temp.id == id){
                return temp;
            }
        }
        return  null;
    }

    public void printReport(){
        System.out.println("These are all the transactions ");

        for(Account temp : acCont.values()){
            System.out.println("id : "+temp.id+" Balance : "+temp.balance+" Last transaction : "+temp.date_of_last_transaction);
        }

//        for(int i =0;i < acc_cont.size() ; i++){
//            Account temp = acCont.get(i);
//            System.out.println("id : "+temp.id+" Balance : "+temp.balance+" Last transaction : "+temp.date_of_last_transaction);
//        }
    }

    public void deposit(int source_id,int amount){
        Account source = getAccount(source_id);
        if(source != null){
            source.deposit(amount);
        }
    }

    public void withdraw(int source_id,int amount){
        Account source = getAccount(source_id);
        if(source != null){
            if(source.balance < amount){
                System.out.println("insufficient balance");
            }else{
                source.withdraw(amount);
            }
        }
    }

    public void transfer(int source_id ,int target_id, int amount){
        Account source = getAccount(source_id);
        Account target = getAccount(target_id);

        if(source != null && target != null){
            source.transfer(target,amount);
        }
    }

}
