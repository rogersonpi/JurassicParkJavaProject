import java.util.ArrayList;

public abstract class Paddock {

    ArrayList<Dinosaur>dinosaur;
    boolean dinosaurRampages;

    public Paddock(){
         dinosaur = new ArrayList<>();
         this.dinosaurRampages = false;
    }

    public void addDinosaur(Dinosaur dinosaur){

        this.dinosaur.add(dinosaur);
    }

    public int getNumberOfDinosaurs() {
        return dinosaur.size();
    }

    public String feedDinosaurInPaddock (Dinosaur dinosaur){

        if (dinosaur.fed == false) {

            dinosaur.fed = true;
            String fedDino = dinosaur.name + " has been fed.";
            System.out.println(fedDino);
            return fedDino;

        }
        else {
            String fullDino = "Dinosaur is already full.";
            System.out.println(fullDino);
            return fullDino;

        }
    }

}
