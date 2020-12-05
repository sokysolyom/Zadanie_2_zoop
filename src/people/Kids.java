package people;

import java.util.Random;

public class Kids extends Person{
    private String position;


    public Kids(String name, String lastName, int age, String position) {
        super(name, lastName, age);
        this.position = position;

    }
    public String getName(){
        return super.name;
    } //getter
    //override
    public void Introduce(){                      //vypis informacie
        System.out.println("I am a player in kids team");
        System.out.println("My name is " + this.name + " " + this.lastName + " and I am " + this.age + "y old");
    }
}
