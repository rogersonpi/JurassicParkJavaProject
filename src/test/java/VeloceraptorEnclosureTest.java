import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VeloceraptorEnclosureTest {


    Veloceraptor veloceraptor;
    VeloceraptorEnclosure veloceraptorEnclosure;



    @Before
    public void before(){
        veloceraptorEnclosure = new VeloceraptorEnclosure();
        veloceraptor = new Veloceraptor("Bobby", DietType.HERBIVORE);
        veloceraptorEnclosure.feedDinosaurInPaddock(veloceraptor);

    }

    //The one where a specific dinosaur can be accessed from paddock then fed.

    @Test
    public void specificDinosaurHasBeenFed(){


        veloceraptorEnclosure.feedDinosaurInPaddock(veloceraptor);
        assertEquals(true, veloceraptorEnclosure.dinosaurHasBeenFed(veloceraptor));

    }

    //The one where confimation that a specific dinosaur has been fed is given.
    @Test
    public void userSeesdinosaurHasBeenFed() {


        assertEquals("Dinosaur is already full.", veloceraptorEnclosure.feedDinosaurInPaddock(veloceraptor));

    }

    //The one where a specific fed dinosaur is placed back in appropriate paddock
    @Test
    public void fedDinosaurIsPlacedInPaddock(){

        veloceraptorEnclosure.addDinosaur(veloceraptor);
        assertEquals(true, veloceraptorEnclosure.dinosaurHasBeenFed(veloceraptor));

    }

}
