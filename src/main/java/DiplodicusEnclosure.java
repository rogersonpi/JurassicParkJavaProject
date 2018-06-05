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

