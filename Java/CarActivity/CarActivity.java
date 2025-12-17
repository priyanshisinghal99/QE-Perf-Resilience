public class Activity {
    public static void main(String[] args) {
        Car toyota = new Car();
        toyota.make = 2014;
        toyota.color = "Black";
        toyota.transmission = "Manual";

        toyota.displayCharacteristics();
        toyota.accelerate();
        toyota.broke();
    }
}
