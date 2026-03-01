package com.vishwas.java.oops.staticKeyword;

class Human{
    String name;
    int age;
    float salary;
    // static variable is
    static long population;

    // static block runs only once as soon as the object is created, and it runs before the constructor as well.
    static {
        System.out.println("Static block invoked");
        Human.population = 10000;
    }

    public Human(String name, int age, float salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;

        // manipulating static variable
        Human.population += 1;
    }

    public String getName() {
        return name;
    }

    public static void validateAge(int age){
        if(age > 18){
            System.out.println("Adult");
        }else System.out.println("Minor");
    }
}
public class StaticVariablesMethods {
    public static void main(String[] args) {
        Human vishwas = new Human("Vishwas", 28, 70000);
        Human sonika = new Human("Sonika", 24, 75000);
        System.out.println(vishwas.getName());
        System.out.println(sonika.getName());

        // invoking static variable
        System.out.println("Total Population: "+Human.population);

        Human akash = new Human("Akash", 27, 67000);
        System.out.println(akash.getName());
        System.out.println("Total Population: "+Human.population);

        // invoking static method
        Human.validateAge(vishwas.age);

        // cannot call Greeting function from a static function as a non-static function needs object
        // Greeting();

        // using instance of the class to access the non-static functions
        StaticVariablesMethods obj = new StaticVariablesMethods();
        obj.Greeting();
    }

    void Greeting(){
        System.out.println("!!!Greeting function invoked!!!");
    }
}
