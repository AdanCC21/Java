public class Main {
    public static void main(String[] args) {
        Bank CimaBank = new Bank();
        CimaBank.createAccountHolder(1,"Adan","GOCA041018HBCNSDA4");
        CimaBank.createAccountHolder(2, "Antonio", "RMGO041003HBCNSDT2");

        CimaBank.deposit(1,500);
        CimaBank.deposit(2,700);

        CimaBank.transfer(1,2,200);

        CimaBank.withdraw(2,500);

        CimaBank.printReport();

    }
}