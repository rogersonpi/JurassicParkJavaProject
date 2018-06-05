import java.util.ArrayList;

public class DiplodicusEnclosure extends Paddock implements IRampage{


    ArrayList<Dinosaur> dinosaurs;
    boolean dinosaurRampages;


    public DiplodicusEnclosure() {
        this.dinosaurs = new ArrayList<>();

    }

    public void herbivoreRampages(Dinosaur dinosaur) {
        if (dinosaur.diet == DietType.HERBIVORE){
        this.dinosaurs.add(dinosaur);}

        else {
            System.out.println("Dinosaur is rampaging, park is closed");
            this.dinosaurRampages = true;
        }
    }

    public int getNumberOfDinosaurs() {
        return dinosaurs.size();

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

    public boolean dinosaurHasBeenFed(Dinosaur diplodicus) {

        return diplodicus.fed;
    }
}

