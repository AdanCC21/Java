public class Person {
    private int age;
    private String name;

    // Functions
    void greet(){
        System.out.println("Hello, my name is "+this.name+" and i have "+this.age+" Years\nNice to meet you.");
    }
    // Setters and getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
