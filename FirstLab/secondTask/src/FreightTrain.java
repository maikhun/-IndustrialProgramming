public class FreightTrain extends Train {
    public FreightTrain(int countOfWagons) {
        super(countOfWagons);
    }
    protected FreightWagon[] freightWagons= new FreightWagon[countOfWagons];
}
