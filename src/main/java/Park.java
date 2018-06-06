import java.util.ArrayList;

public class Park extends Paddock {


    ArrayList<Paddock> herbivores;
    ArrayList<Paddock> carnivores;
    Dinosaur dinosaur;
    ArrayList<Visitor> visitors;
    int numberOfVisitors;
    boolean parkOpen;
    Paddock paddock;
    Paddock retrievedPaddock;


    public Park() {
        visitors = new ArrayList<>();
        herbivores = new ArrayList<>();
        carnivores = new ArrayList<>();
        this.numberOfVisitors = 0;

    }

    public void addHerbivorePaddock(Paddock paddock) {

        if (!paddock.dinosaurRampages) {

            herbivores.add(paddock);

        } else {
            this.parkOpen = false;
        }

    }

    public int numberOfPaddocks() {

        return herbivores.size() + carnivores.size();
    }

    public int getNumberOfVisitors() {

        return visitors.size();
    }

    public void addVisitor(Visitor visitor) {

        if (parkOpen) {

            this.visitors.add(visitor);
            this.numberOfVisitors += 1;
        }
    }

    public void addCarnivorePaddock(Paddock trexEnclosure) {
        carnivores.add(trexEnclosure);
    }

    public void addDinosaurToHerbivorePaddock(Dinosaur dinosaur, Paddock paddock) {

        for (int i = 0; i < herbivores.size(); i++) {

            Paddock result = herbivores.get(i);
            retrievedPaddock = result;

            if (retrievedPaddock == paddock && dinosaur.diet == DietType.HERBIVORE) {
                retrievedPaddock.addDinosaur(dinosaur);

            } else
                System.out.println("Dinsosaur is Rampaging");
            this.parkOpen = false;
        }
    }


        public void addDinosaurToCarnivorePaddock(Dinosaur dinosaur, Paddock paddock){

            for (int i = 0; i < carnivores.size(); i++) {

                Paddock result = carnivores.get(i);
                retrievedPaddock = result;

                if (retrievedPaddock == paddock && dinosaur.diet == DietType.CARNIVORE){
                    retrievedPaddock.addDinosaur(dinosaur);

                }

                else
                    System.out.println ("Dinsosaur is Rampaging");
                this.parkOpen = false;
            }

        }

    }



//    public void diplodocusRampaging (DiplodicusEnclosure diplodicusEnclosure){
//
//        for (int i = 0; i < paddocks.size(); i++){
//
//            if (diplodicusEnclosure.dinosaurRampages)
//
//                this.parkOpen = false;
//            }
//        }





