public class Runner {

    public static void main(String[] args) {

        TRex rex = new TRex ("Satan", DietType.CARNIVORE);

        TRexEnclosure kingclosure = new TRexEnclosure();
        kingclosure.addDinosaur(rex);
        kingclosure.feedDinosaurInPaddock(rex);

    }
}
