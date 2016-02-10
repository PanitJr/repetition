/**
 * Created by waiti on 1/24/2016.
 */
public class LightSaber {
    String color;
    boolean state;

    public LightSaber() {
        this.color = "Blue";
        this.state = false;
    }

    public LightSaber(String color) {
        this.color = color;
    }

    public void turn(){
        if (!state){
            System.out.println("Lightsaber "+color+" is now on");
            state = true;
        }
        else{
            System.out.println("Lightsaber "+color+" is now off");
            state = false;
        }
    }
}
