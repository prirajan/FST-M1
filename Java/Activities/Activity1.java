package Activities;

public class Activity1 {

    public static void main(String[] args)
    {
        Car myCarVenue = new Car();
        myCarVenue.make=2021;
        myCarVenue.color="Blue";
        myCarVenue.transmission="Manual";
        myCarVenue.displayCharacteristics();
        myCarVenue.accelarate();
        myCarVenue.brake();

    }
}
