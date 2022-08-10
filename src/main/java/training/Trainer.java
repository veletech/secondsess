package training;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Trainer {

    private String name;

    private int yearOfBirth;

    public String getName(){
        return name;
    }

    public String getNameAndAge(){
        return name + ":" + yearOfBirth;
    }

    public int getAge(int year){
        return year - yearOfBirth;
    }

    public void changeName(String name){
        this.name = name;

    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }
}
