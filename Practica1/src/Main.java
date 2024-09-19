//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {
    public static void main(String[] args) {
        Bank CimaBank = new Bank();
        CimaBank.createAccountHolder(1,"Adan","GOCA041018HBCNSDA4");
        CimaBank.createAccountHolder(2, "Antonio", "RMGO041003HBCNSDT2");

        // Depositar la cuenta id 5
        CimaBank.acc_cont.get(0).deposit(1000);
        // Depositar la cuenta id 2
        CimaBank.acc_cont.get(1).deposit(500);

        CimaBank.acc_cont.get(0).print();
        CimaBank.acc_cont.get(1).print();

        System.out.println("");

        CimaBank.acc_cont.get(0).transfer(CimaBank.acc_cont.get(1),500);

        CimaBank.acc_cont.get(0).print();
        CimaBank.acc_cont.get(1).print();

        System.out.println("");

        CimaBank.acc_cont.get(0).withdraw(250);

        CimaBank.acc_cont.get(0).print();

        if(CimaBank.acc_cont.get(0).withdraw(400)){
            System.out.println("Retiro exitoso");
        }else{
            System.out.println("Fallo, fondos insuficientes");
        }

    }
}