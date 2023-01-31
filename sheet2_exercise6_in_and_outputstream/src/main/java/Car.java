import java.io.Serializable;


public class Car implements Display, Serializable {

    private String colour;
    private double horsepower;
    private double weight;

    public Car(String colour, double horsepower, double weight) {
        this.colour = colour;
        this.horsepower = horsepower;
        this.weight = weight;
    }

    public void print(){
        System.out.print("\ncolour = " + colour + ", horsepower = "+ horsepower + ", weight = " + weight);
    }
}
