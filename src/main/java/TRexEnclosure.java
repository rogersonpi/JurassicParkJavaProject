import java.util.ArrayList;

public class TRexEnclosure extends Paddock{

    Dinosaur dinoInTransit;

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


    }


