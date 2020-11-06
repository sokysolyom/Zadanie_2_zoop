package people;

import java.util.Random;

public class Player extends Person {

    private String position;
    private boolean moodForTraining;

    public Player(String name, String lastName, int age, String position, boolean moodForTraining) {
        super(name, lastName, age);
        this.position = position;
        this.moodForTraining = moodForTraining;

        Random r = new Random();
        int low = 1;
        int high = 11;
        int result = r.nextInt(high-low) + low;

        if(result==10) this.moodForTraining=false;
    }
    public String getName(){
        return super.name;
    }

}
