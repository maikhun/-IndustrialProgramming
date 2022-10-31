public class FreightWagon extends Wagon {

    public FreightWagon(int weight, int loadCapacity) {
        super(weight);
        this.loadCapacity = loadCapacity;
    }

    protected int loadCapacity;
}
