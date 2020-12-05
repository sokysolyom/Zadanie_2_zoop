package people;

import java.util.Random;

public class Adults extends Person {

    private String position;
    private boolean moodForTraining;


    public Adults(String name, String lastName, int age, String position, boolean moodForTraining) {
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
    } // getter
    //override
    void method()
    {
        System.out.println("Method from Child");
    }
    //override
    public void Introduce(){
        System.out.println("I am a player in adult team");
        System.out.println("My name is " + this.name + " " + this.lastName + " and I am " + this.age + " old");
    }

}
