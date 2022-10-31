import java.util.Scanner;

abstract class Train {
    public Train(int countOfWagons) {
        this.countOfWagons = countOfWagons;
    }

    protected int countOfWagons;


    public void getCountOfWagons() {
        System.out.println("Count of wagons: " + countOfWagons);
    }

}
