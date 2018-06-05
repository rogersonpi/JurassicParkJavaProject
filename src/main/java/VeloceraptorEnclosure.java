import java.util.ArrayList;

public class VeloceraptorEnclosure extends Paddock {



    ArrayList<Dinosaur> dinosaurs;

    public VeloceraptorEnclosure() {
        this.dinosaurs = new ArrayList<>();
    }


    public void addDinosaur(Dinosaur dinosaur) {

        this.dinosaurs.add(dinosaur);


    }

    public int getNumberOfDinosaurs() {
        return dinosaurs.size();


    }

    public boolean dinosaurHasBeenFed(Dinosaur dinosaur){

        return dinosaur.fed;
    }


}
