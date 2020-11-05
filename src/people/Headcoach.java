package people;

import DB.Instances;

import java.util.ArrayList;

public class Headcoach extends Coach {
    private int ID;
    private ArrayList<Coach> coaches = new ArrayList<>();

    public Headcoach(String name, String lastName, int age, String typOfTrainer, int ID){
        super(name, lastName, age, typOfTrainer);
        this.ID=ID;
    }

    public void addCoach(Coach coach){
            coaches.add(coach);
            Instances.addGlobalCoaches(coach);
    }

    public void showCoaches(){
        System.out.println("Headcoach "+this.name+" has these coaches: ");
        for(Coach coach : coaches)
            System.out.println(coach.getName());
    }
}
