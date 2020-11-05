package people;

public class Manager extends Headcoach {
    boolean mood;

    public Manager(String name, String lastName, int age, String typOfTrainer, boolean mood, int ID) {
        super(name, lastName, age, typOfTrainer, ID);
        this.mood = mood;
    }

    public void Introduce(){
        System.out.println("Hello I am "+this.name + " " + this.lastName+". I am the manager.");
    }

}
