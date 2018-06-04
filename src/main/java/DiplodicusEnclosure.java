import java.util.ArrayList;

public class DiplodicusEnclosure extends Paddock {


    ArrayList<Dinosaur> dinosaurs;

    public DiplodicusEnclosure() {
        this.dinosaurs = new ArrayList<>();
    }


    public void addDinosaur(Dinosaur dinosaur) {

        this.dinosaurs.add(dinosaur);


    }

    public int getNumberOfDinosaurs() {
        return dinosaurs.size();


    }
}
