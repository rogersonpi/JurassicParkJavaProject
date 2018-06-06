import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PaddockTest {

    TRexEnclosure tRexEnclosure;
    TRex tRex, tRex4;
    TRex tRex2;
    TRex tRex3;

    @Before
    public void before(){

        ////The one where a paddock is created.
        //    //*Given there is a paddock class
        //    //*And with a paddock identifier
        //    //*When a new paddock is needed
        //    //*Then a paddock with the appropriate values can be created

        tRex = new TRex("KingBoy", DietType.CARNIVORE);
        tRex2 = new TRex("Billy", DietType.CARNIVORE);
        tRex3 = new TRex ("Raaaar", DietType.CARNIVORE);
        tRex4 = new TRex ("Trevor", DietType.CARNIVORE);
        tRexEnclosure = new TRexEnclosure();
        tRexEnclosure.addDinosaur(tRex);
        tRexEnclosure.addDinosaur(tRex2);
        tRexEnclosure.addDinosaur(tRex3);
        tRexEnclosure.addDinosaur(tRex4);
        }

        @Test
    public void canAddDinosaur(){
     //The one where a dinosaur is added to a paddock
            // The one where several dinosaurs can be added to a paddock.

    assertEquals(4,tRexEnclosure.getNumberOfDinosaurs());
    }

    @Test
    public void canRemoveDinosaur(){
        //The one where a dinosaur is removed from a paddock
        //The one where a specific dinosaur is removed from a paddock.
        tRexEnclosure.removeDinosaur(tRex2);
        assertEquals(3, tRexEnclosure.getNumberOfDinosaurs());

    }
    @Test
    public void canAddRemovedDinosaurtoNewPaddock(){

        //The one where a dinosaur is removed then added to a paddock.

        TRexEnclosure agingTrexEnclosure = new TRexEnclosure();
        tRexEnclosure.removeDinosaur(tRex);
        agingTrexEnclosure.addDinosaur(tRex);
        assertEquals(1,agingTrexEnclosure.getNumberOfDinosaurs());

    }

    //The one where a specific dinosaur is accessed from a paddock
    @Test
    public void canAccessDinosaur(){


        tRexEnclosure.findDinosaur(tRex);

        assertEquals("KingBoy", tRexEnclosure.findDinosaur(tRex));

    }

    //The one where only like animals can enter paddock
    @Test
    public void willOnlyAdmitLikeDinosaurs(){

        assertEquals(0, tRexEnclosure.getNumberOfDinosaurs());
    }

}
