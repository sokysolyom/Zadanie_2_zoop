package people;

public class Person {
    protected String name, lastName;
    protected int age;

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public void Introduce(){
        System.out.println(this.name + " " + this.lastName);
    }
}
