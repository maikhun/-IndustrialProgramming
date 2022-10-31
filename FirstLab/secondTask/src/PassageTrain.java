import java.util.ArrayList;

public class PassageTrain extends Train {
    public PassageTrain(int countOfVagons) {
        super(countOfVagons);
    }

    protected PassageWagon[] passageWagons = new PassageWagon[countOfWagons];

    public int getSumPass() {
        int sum = 0;
        for (PassageWagon pass : passageWagons) {
            sum += pass.countOfPassengers;
        }
        return sum;
    }

    public int getSumLugg() {
        int sum = 0;
        for (PassageWagon lugg : passageWagons) {
            sum += lugg.countOfLuggage;
        }
        return sum;
    }
// TODO компоратор
    public void sort() {
        for (int out = passageWagons.length - 1; out >= 1; out--) {  //Внешний цикл
            for (int in = 0; in < out; in++) {       //Внутренний цикл
                if (passageWagons[in + 1].comfort)               //Если порядок элементов нарушен
                {
                    var temp = passageWagons[in + 1];
                    passageWagons[in + 1] = passageWagons[in];
                    passageWagons[in] = temp;
                }
            }
        }
    }
    public ArrayList<PassageWagon> findCountOfWagons(int countPassagers){
        ArrayList<PassageWagon> out = new ArrayList<PassageWagon>();
        for (int i = 0; i < passageWagons.length; i++){
            if(passageWagons[i].countOfPassengers == countPassagers)
                out.add(passageWagons[i]);
        }
        return out;
    }
}