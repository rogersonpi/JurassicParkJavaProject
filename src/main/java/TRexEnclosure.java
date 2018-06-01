import java.util.ArrayList;

public class TRexEnclosure extends Paddock{


    ArrayList<Dinosaur> dinosaurs;

    public TRexEnclosure() {
        this.dinosaurs = new ArrayList<>();
    }


    public void addDinosaur(Dinosaur dinosaur){

        this.dinosaurs.add(dinosaur);


    }

    public int getNumberOfDinosaurs() {
        return dinosaurs.size();
    }


    }


