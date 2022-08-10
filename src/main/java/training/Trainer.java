package training;

public class Trainer {

    String name;

    int yearOfBirth;

    public String getName(){
        return name;
    }

    public String getNameAndAge(){
        return name + ":" + yearOfBirth;
    }

    public int getAge(int year){
        return year - yearOfBirth;
    }
}
