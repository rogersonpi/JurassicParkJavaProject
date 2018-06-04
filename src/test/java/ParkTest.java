import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;
    Paddock trexEnclosure;



    @Test
    public void canAddPaddock(){

        trexEnclosure = new TRexEnclosure();
        park = new Park();
        park.addPaddocks(trexEnclosure);

        assertEquals(1, park.numberOfPaddocks());


    }


}
