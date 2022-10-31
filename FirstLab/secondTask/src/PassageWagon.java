public class PassageWagon extends Wagon {
    protected boolean comfort;
    protected int countOfPassengers;

    protected int countOfLuggage;

    public PassageWagon(int weight, boolean comfort) {
        super(weight);
        if (comfort) {
            countOfPassengers = 36;
        } else {
            countOfPassengers = 54;
        }
    }
}
