package people;

import DB.Instances;

public class Manager extends Headcoach {
    boolean mood;
    private static Headcoach managerHeadcoach;

    public Manager(String name, String lastName, int age, String typOfTrainer, boolean mood, int ID) {
        super(name, lastName, age, typOfTrainer, ID);
        this.mood = mood;
    }



    public void addHeadCoach(Headcoach headcoach){
        managerHeadcoach = headcoach;
    }

    public void showHeadcoach(){        //funckia na vypisovanie headcoachov, ktori patria k menezerovy
        System.out.println("Manager "+this.name+" has this headcoach: ");
            System.out.println(managerHeadcoach.getName());
    }

    public void Introduce(){
        System.out.println("Hello I am "+this.name + " " + this.lastName+". I am the manager.");
    }

}
