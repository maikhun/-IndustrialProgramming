public class Program {
    public static void main(String[] args) {
        PassageTrain trainP = new PassageTrain(14);
        FreightTrain trainF = new FreightTrain(15);
        PassageWagon firstPW = new PassageWagon(189, true);
        PassageWagon secondPW = new PassageWagon(189, false);
        FreightWagon firstFW = new FreightWagon(189, 500);
        trainF.getCountOfWagons();
    }
}
