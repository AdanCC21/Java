//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {
    public static void main(String[] args) {
        Bank CimaBank = new Bank();
        CimaBank.createAccountHolder(5,"Adan","GOCA041018HBCNSDA4");

        CimaBank.ah_cont.get(0).print();
        CimaBank.acc_cont.get(0).print();

    }
}