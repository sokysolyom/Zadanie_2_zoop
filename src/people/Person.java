package people;

public abstract class Person {
    protected final String name, lastName;
    protected int age;
    public int rating;

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
    //override
    public void Introduce(){
        System.out.println("Hello I am" + this.name + " " + this.lastName);
    }
    //override
    void method()
    {
        System.out.println("Method from Parent");
    }
}
