package guru.springframework.spring5webapp;

public class Person {

    private String name;
    private String lName;
    private double weight;

    public Person(String name, String lName) {
        this.name = name;
        this.lName = lName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
