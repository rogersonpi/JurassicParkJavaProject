import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PaddockTest {

    TRexEnclosure tRexEnclosure;
    TRex tRex;

    @Before
    public void before(){

        tRex = new TRex("KingBoy", DietType.HERBIVORE);
        tRexEnclosure = new TRexEnclosure();

        }

        @Test
    public void canAddDinosaur(){

    tRexEnclosure.addDinosaur(tRex);
    assertEquals(1,tRexEnclosure.getNumberOfDinosaurs());
    }




}
