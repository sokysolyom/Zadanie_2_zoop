package people;

import DB.Instances;

import java.util.ArrayList;

public class Coach {

    protected String name, lastName, typOfTrainer;
    protected int age;
    private  ArrayList<Adults> adults = new ArrayList<>();
    private  ArrayList<Kids> kids = new ArrayList<>();

    public Coach(String name, String lastName, int age, String typOfTrainer) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.typOfTrainer = typOfTrainer;
    }
    //pridavanie hracov ku trenerovy
    public void addPlayer(Adults adults){
        this.adults.add(adults);
        Instances.addGlobalPlayer(adults);
    }
    //pridavanie deti ku trenerovy
    public void addKids(Kids kids){
        this.kids.add(kids);
        Instances.addGlobalKid(kids);
    }

    public void showPlayers(){ //funckia na vypis hracov, ktori patria ku trenerovy
        System.out.println("Coach "+this.name+" has these players: ");
        for(Adults adults : this.adults)
        System.out.println(adults.getName());
    }

    public void getInfoTraining(){
        System.out.println("Coach: " + this.name + " " + this.lastName + " has players: " + adults.size());
    }

    public String getName(){
        return this.name;
    } // getter
}
