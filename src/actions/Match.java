package actions;

import people.Manager;
import people.Player;

public class Match {
    Manager main;
    Player p[];

    public Match(Manager main, Player p[]) {
        super();
        this.main = main;
        this.p = p;
        System.out.println("------------------");
        System.out.println("Match day is here!");
    }
/*
    public void Information(){
        Random r = new Random();
        int low = 1;
        int high = 11;
        int result1 = r.nextInt(high-low) + low;
        int result2 = r.nextInt(high-low) + low;

        System.out.println("The result was: " + result1 + ":" + result2);
        if(result1<result2){
            main.mood=false;
        }
        if(main.mood) System.out.println("The manager is happy about the result");
        else System.out.println("The manager is NOT happy about the result");
    }

 */
}
