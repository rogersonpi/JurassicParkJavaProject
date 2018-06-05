public class Runner {

    public static void main(String[] args) {

        TRex rex = new TRex ("Billy", DietType.CARNIVORE);

        TRexEnclosure kingclosure = new TRexEnclosure();
        kingclosure.addDinosaur(rex);
        kingclosure.feedDinosaurInPaddock(rex);

    }
}
