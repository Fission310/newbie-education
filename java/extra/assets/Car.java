public class Car {

    public int speed;  // visibility modifiers can be attached to attributes!
    private int size;

    public Car(int a, int b) { // constructors should always be public--why?
        speed = a;
        size = b;
    }

    // method of the Car class
    public void drive() {
        speed++;
    }

    // this is the code that runs
    public static void main( String[] args ) {
        Car toyota = new Car(3, 5);
        toyota.drive();
        System.out.println(toyota.speed);
    }

}
