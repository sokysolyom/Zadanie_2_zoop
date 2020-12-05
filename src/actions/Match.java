package actions;

import people.Coach;
import people.Headcoach;
import people.Manager;
import people.Adults;

import java.util.ArrayList;
import java.util.Random;

public class Match implements Session{
    private String enemy;
    private String day;
    private int start;
    private ArrayList<Adults> adults = new ArrayList<>();
    private ArrayList<Coach> coaches = new ArrayList<>();
    private static Manager matchManager;
    private static Headcoach matchHeadcoach;

    public Match(String enemy, String day, int start) {
        this.enemy = enemy;
        this.day = day;
        this.start = start;
    }
    // pridavanie ludi do zapasu
    public void addPlayer(Adults adults){
        this.adults.add(adults);
    }

    public void addCoach(Coach coach){
        coaches.add(coach);
    }

    public void addHeadCoach(Headcoach headcoach){
        matchHeadcoach= headcoach;
    }

    public void addManager(Manager manager){
        matchManager = manager;
    }
    //vypis ludi zo zapasu
    public void showManager(){
        System.out.println("Manager on the match is: ");
        System.out.println(matchManager.getName());
    }

    public void showHeadcoach(){
        System.out.println("Headcoach on the match is: ");
        System.out.println(matchHeadcoach.getName());
    }

    public void showCoaches(){
        System.out.println("Coaches on the match are: ");
        for(Coach coach : coaches)
            System.out.println(coach.getName());
    }

    public void showPlayers(){
        System.out.println("Players on the match are: ");
        for(Adults adults : this.adults)
            System.out.println(adults.getName());
    }

    public void showInformation(){ //vypis informacie
        showManager();
        showHeadcoach();
        showCoaches();
        showPlayers();
    }

    public void getResult(){ //funkcia na generovanie vysledku
        Random r = new Random();
        int low = 1;
        int high = 11;
        int result1 = r.nextInt(high-low) + low;
        int result2 = r.nextInt(high-low) + low;

        System.out.println("The result was: " + result1 + ":" + result2);
        if(result1>result2) System.out.println("It was a win.");
        if(result1<result2) System.out.println("It was a loose.");
        if(result1==result2) System.out.println("It was a tie.");
    }


}
