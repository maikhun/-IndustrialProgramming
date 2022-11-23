import java.util.*;

public class Parking {
    public int n;
    public LinkedList<Car> places;

    public Parking(int number){
        this.n = number;
        places = new LinkedList<>();// TODO: доработать.
    }
    public void addCar(Car addedCar){
        for (Car car : places){
            if (car == null){
                car = addedCar;
                System.out.println("Машина добавлена");
            } else {
                System.out.println("Вся парковка заполнена");
            }
        }
    }
    public String print(){
        return "Размер парковки:\n" + parking.size();
    }

}
