package actions;

import people.Coach;
import people.Player;

public class Training {
    Coach main;
    Player p[];
    double time;
    String typeOfTraining, day;

    public Training(Coach main, Player p[], String typeOfTraining, String day, double time) {
        this.main = main;
        this.p = p;
        this.typeOfTraining = typeOfTraining;
        this.day = day;
        this.time = time;
        System.out.println("Training was made...");
    }
/*
    public void Information() {
        System.out.println("-------------------");
        System.out.println("This training was about: " + typeOfTraining);
        System.out.println("It was on " + day);
        System.out.println("It lasted: " + time +" hours");
        System.out.println("The trainer was: " + super.name + " " + main.lastName);
        System.out.println("His profession is: " + main.typOfTrainer);
        System.out.println("PLAYERS INFORMATION(Was/Was NOT on training)");
        for(int i=0; i<11; i++){
            if(p[i].moodForTraining)
                System.out.println(p[i].name + " " + p[i].name + " was on training!");
            else System.out.println(p[i].name + " " + p[i].name + " was NOT on training!");
        }
    }

 */
}
