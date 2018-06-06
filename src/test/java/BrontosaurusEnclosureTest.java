import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BrontosaurusEnclosureTest {

    Brontosaurus brontosaurus;
    BrontosaurusEnclosure brontosaurusEnclosure;

    @Before
    public void before(){
        brontosaurusEnclosure = new BrontosaurusEnclosure();
        brontosaurus = new Brontosaurus("Bobby", DietType.HERBIVORE);
        brontosaurusEnclosure.feedDinosaurInPaddock(brontosaurus);
    }

    //The one where a specific dinosaur can be accessed from paddock then fed.

    @Test
    public void specificDinosaurHasBeenFed(){

        brontosaurusEnclosure.feedDinosaurInPaddock(brontosaurus);
        assertEquals(true, brontosaurusEnclosure.dinosaurHasBeenFed(brontosaurus));
    }

    //The one where confimation that a specific dinosaur has been fed is given.
    @Test
    public void userSeesdinosaurHasBeenFed() {


        assertEquals("Dinosaur is already full.", brontosaurusEnclosure.feedDinosaurInPaddock(brontosaurus));

    }

    //The one where a specific fed dinosaur is placed back in appropriate paddock
    @Test
    public void fedDinosaurIsPlacedInPaddock(){

        brontosaurusEnclosure.addDinosaur(brontosaurus);
        assertEquals(true, brontosaurusEnclosure.dinosaurHasBeenFed(brontosaurus));

    }


}
