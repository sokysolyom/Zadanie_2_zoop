package actions;

import people.Coach;
import people.Adults;
import people.Kids;

import java.util.ArrayList;

public class Training implements Session{
    private double time;
    public String day;
    private String typeOfTraining;
    private  ArrayList<Adults> adults = new ArrayList<>();
    private  ArrayList<Coach> coaches = new ArrayList<>();
    private  ArrayList<Kids> kids = new ArrayList<>();

    public Training(String day, int time, String typeOfTraining) {
        this.day = day;
        this.time = time;
        this.typeOfTraining = typeOfTraining;
    }
    //pridavanie ludi na trening
    public void addPlayerToTraining(Adults adults){
        this.adults.add(adults);
    }

    public void addKidToTraining(Kids kids){
        this.kids.add(kids);
    }

    public void addCoachToTraining(Coach coach){
        coaches.add(coach);
    }
    //vypisovanie ludi na treningu
    public void showCoaches(){
        System.out.println("Coaches on the training are: ");
        for(Coach coach : coaches)
            System.out.println(coach.getName());
    }

    public void showPlayers(){
        System.out.println("Players on the training are: ");
        for(Adults adults : this.adults)
            System.out.println(adults.getName());
    }

    public void showKids(){
        System.out.println("Kids on the training are: ");
        for(Kids kids : this.kids)
            System.out.println(kids.getName());
    }
    //implements
    public void showInformation() {     //info a treningu dospeli
        System.out.println("Training information: ");
        System.out.println("It was on "+ this.day);
        System.out.println("It lasted "+ this.time);
        System.out.println("Type of training was "+ this.typeOfTraining);
        showCoaches();
        showPlayers();
        }

    public void showInformationKid() {      //info o treningu deti
        System.out.println("Training information: ");
        System.out.println("It was on "+ this.day);
        System.out.println("It lasted "+ this.time);
        System.out.println("Type of training was "+ this.typeOfTraining);
        showCoaches();
        showKids();
    }
}
