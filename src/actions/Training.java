package actions;

import DB.Instances;
import people.Coach;
import people.Player;

import java.util.ArrayList;

public class Training implements Session{
    private double time;
    public String day;
    private String typeOfTraining;
    private  ArrayList<Player> players = new ArrayList<>();
    private  ArrayList<Coach> coaches = new ArrayList<>();

    public Training(String day, int time, String typeOfTraining) {
        this.day = day;
        this.time = time;
        this.typeOfTraining = typeOfTraining;
    }

    public void addPlayerToTraining(Player player){
        players.add(player);
    }

    public void addCoachToTraining(Coach coach){
        coaches.add(coach);
    }

    public void showCoaches(){
        System.out.println("Coaches on the training are: ");
        for(Coach coach : coaches)
            System.out.println(coach.getName());
    }

    public void showPlayers(){
        System.out.println("Players on the training are: ");
        for(Player player : players)
            System.out.println(player.getName());
    }

    public void showInformation() {
        System.out.println("Training information: ");
        System.out.println("It was on "+ this.day);
        System.out.println("It lasted "+ this.time);
        System.out.println("Type of training was "+ this.typeOfTraining);
        showCoaches();
        showPlayers();
        }
}
