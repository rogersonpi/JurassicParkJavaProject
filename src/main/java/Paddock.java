import java.util.ArrayList;

public abstract class Paddock {

    ArrayList<Dinosaur>dinosaur;

    public Paddock(){

         dinosaur = new ArrayList<>();
    }

    public void addDinosaur(Dinosaur dinosaur){

        this.dinosaur.add(dinosaur);


    }

    public int getNumberOfDinosaurs() {
        return dinosaur.size();
    }
}
