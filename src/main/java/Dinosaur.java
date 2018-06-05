public abstract class Dinosaur {

    String name;
    boolean fed;
    DietType diet;


    public Dinosaur(String name, DietType diet){

        this.name = name;
        this.diet = diet;
    }

    public String getName() {
        return this.name;
    }

    public boolean feedDinosaur() {

            return this.fed = true;

    }
    public DietType getDietType() {

        return this.diet;
    }
}
