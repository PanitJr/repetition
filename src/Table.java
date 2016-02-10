/**
 * Created by waiti on 1/24/2016.
 */
public class Table {
    String shape = "Rectangle";
    String color = "yellow";
    int numberOfLegs = 4;

    public Table() {
        shape = "Round";
    }

    public Table(String color) {
        this.color = color;
    }

    public void place(String object){
        System.out.println("Place "+object+" on "+shape+" table");
    }
}
