import java.util.ArrayList;

    public class BrontosaurusEnclosure extends Paddock {

        ArrayList<Dinosaur> dinosaurs;

        public BrontosaurusEnclosure() {
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


