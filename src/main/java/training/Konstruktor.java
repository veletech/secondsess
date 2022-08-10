package training;

public class Konstruktor {
    private String name;

    private int yearOfBirth;

    public Konstruktor(String name,int yearOfBirth){
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
