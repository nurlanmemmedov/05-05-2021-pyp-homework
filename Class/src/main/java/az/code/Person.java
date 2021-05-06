package az.code;

public class Person {
    public static int countInstances = 0;
    private long id;
    private String name = "";
    private String surname;
    private int age;

    public Person() {
        System.out.println("Constructor");
    }

    public Person(String name) {
       this(name, "Ahmadov");
    }

    public Person(String name, String surname) {
        this(name, surname, 18);
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        countInstances++;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        Person p1 = new Person("Asiman");
    }
    static  class Country{

    }
}
