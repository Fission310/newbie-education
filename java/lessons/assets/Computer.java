public class Computer {

    private int size; //unless there's a good reason for it, attributes should always be private (accessible by only this class)
    private double weight;
    private String model;
    private boolean isFast;

    public Computer(int _size, double _weight, String _model, boolean _isFast) {
        size = _size;
        weight = _weight;
        model = _model;
        isFast = _isFast;
    }

    public void upgrade(int x) {
        size += x;
        weight += x; //adding ints to doubles is allowed--what about the other way around?
    }

    public void downgrade(int x) {
        size -= x;
        weight -= x;
    }

    public void toggleQuantumState() {
        isFast = !isFast;
    }

    public static void main( String[] args ) {

        Computer machine = new Computer(2, 3.5, "dell", false);
        machine.upgrade(5);
        machine.toggleQuantumState();

        System.out.println(machine.size);
        System.out.println(machine.weight);
        System.out.println(machine.model);
        System.out.println(machine.isFast);

    }
}
