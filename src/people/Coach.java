package people;

import DB.Instances;

import java.util.ArrayList;

public class Coach {

    protected String name, lastName, typOfTrainer;
    protected int age;
    private  ArrayList<Player> players = new ArrayList<>();

    public Coach(String name, String lastName, int age, String typOfTrainer) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.typOfTrainer = typOfTrainer;
    }

    public void addPlayer(Player player){
        players.add(player);
        Instances.addGlobalPlayer(player);
    }

    public void showPlayers(){
        System.out.println("Coach "+this.name+" has these players: ");
        for(Player player : players)
        System.out.println(player.getName());
    }

    public String getName(){
        return this.name;
    }
}
