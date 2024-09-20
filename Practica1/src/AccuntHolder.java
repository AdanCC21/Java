public class AccuntHolder extends Bank{
    int id;
    String name;
    String curp;

    public AccuntHolder(int id, String name, String curp){
        this.id = id;
        this.name = name;
        this.curp = curp;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCurp() {
        return curp;
    }
}
