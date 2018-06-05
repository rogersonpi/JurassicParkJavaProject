import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TRexEnclosureTest {
    TRexEnclosure tRexEnclosure1;
    TRex trex1;

    @Before
    public void before(){

        tRexEnclosure1 = new TRexEnclosure();
        trex1 = new TRex ("Bitey", DietType.CARNIVORE);
        tRexEnclosure1.feedDinosaurInPaddock(trex1);
        assertEquals(true, tRexEnclosure1.dinosaurHasBeenFed(trex1));

    }

    //The one where a specific dinosaur can be accessed from paddock then fed.

    @Test
    public void specificDinosaurHasBeenFed(){

        TRexEnclosure tRexEnclosure1 = new TRexEnclosure();
        TRex trex1 = new TRex ("Bitey", DietType.CARNIVORE);
        tRexEnclosure1.feedDinosaurInPaddock(trex1);
        assertEquals(true, tRexEnclosure1.dinosaurHasBeenFed(trex1));

    }

    //The one where confimation that a specific dinosaur has been fed is given.
    @Test
    public void userSeesdinosaurHasBeenFed() {

        TRexEnclosure tRexEnclosure1 = new TRexEnclosure();
        TRex trex1 = new TRex ("Bitey", DietType.CARNIVORE);
        assertEquals("Bitey has been fed.", tRexEnclosure1.feedDinosaurInPaddock(trex1));

    }

    //The one where a specific fed dinosaur is placed back in appropriate paddock
    @Test
    public void fedDinosaurIsPlacedInPaddock(){

        assertEquals(true, tRexEnclosure1.dinosaurHasBeenFed(trex1));

    }


}
