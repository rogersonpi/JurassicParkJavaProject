import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiplodocusEnclosure {

    Diplodicus diplodicus;
    DiplodicusEnclosure diplodicusEnclosure;
    TRex trex;


    @Before
    public void before(){
        diplodicusEnclosure = new DiplodicusEnclosure();
        diplodicus = new Diplodicus("Bobby", DietType.HERBIVORE);
        diplodicusEnclosure.feedDinosaurInPaddock(diplodicus);
        trex = new TRex("Rex", DietType.CARNIVORE);
    }

    //The one where a specific dinosaur can be accessed from paddock then fed.

    @Test
    public void specificDinosaurHasBeenFed(){


        diplodicusEnclosure.feedDinosaurInPaddock(diplodicus);
        assertEquals(true, diplodicusEnclosure.dinosaurHasBeenFed(diplodicus));

    }

    //The one where confimation that a specific dinosaur has been fed is given.
    @Test
    public void userSeesdinosaurHasBeenFed() {


        assertEquals("Dinosaur is already full.", diplodicusEnclosure.feedDinosaurInPaddock(diplodicus));

    }

    //The one where a specific fed dinosaur is placed back in appropriate paddock
    @Test
    public void fedDinosaurIsPlacedInPaddock(){

        diplodicusEnclosure.addDinosaur(diplodicus);
        assertEquals(true, diplodicusEnclosure.dinosaurHasBeenFed(diplodicus));

    }
    @Test
    public void dinosaurIsAdded(){

        diplodicusEnclosure.addDinosaur(diplodicus);
        assertEquals(1, diplodicusEnclosure.getNumberOfDinosaurs());
    }

    //The one where a dinosaur rampages
    @Test
    public void aHerbivoreRampagesWhenCarnivoreIsAdded(){

        diplodicusEnclosure.herbivoreRampages(trex);
        assertEquals(true, diplodicusEnclosure.dinosaurRampages);
    }


}
