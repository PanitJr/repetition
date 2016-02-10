/**
 * Created by waiti on 1/23/2016.
 */
public class Animal {
    String name;
    String color;

    public Animal() {
        this.name = "Martyr";
    }

    public Animal(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }
}
