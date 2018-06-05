import java.util.ArrayList;

public class TRexEnclosure extends Paddock {

    Dinosaur dinoInTransit;
    Boolean fed;

    ArrayList<Dinosaur> dinosaurs;

    public TRexEnclosure() {
        this.dinosaurs = new ArrayList<>();
    }


    public  void addDinosaur(Dinosaur dinosaur){


if (dinosaur.diet == DietType.CARNIVORE)

        this.dinosaurs.add(dinosaur);

    else
        System.out.println("You cannot place veggies with meateaters: they will be gobbled up");


    }

    public int getNumberOfDinosaurs() {
        return dinosaurs.size();
    }

    public String findDinosaur(Dinosaur dinosaur){

        if (
        dinosaurs.contains(dinosaur)){

            System.out.println(dinosaur.name);
        }

        return dinosaur.name;

    }

    public void removeDinosaur(Dinosaur dino){


        dinosaurs.remove(dino);

       //return  this.dinoInTransit = dino;
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

    public boolean dinosaurHasBeenFed (Dinosaur dinosaur){

        return dinosaur.fed;
    }

    }


