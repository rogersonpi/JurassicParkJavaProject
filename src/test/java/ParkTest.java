import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;
    Paddock trexEnclosure;



    @Test
    public void canAddPaddock(){

        //The one where a paddock is added to the park
        //The one where a new park is created

        trexEnclosure = new TRexEnclosure();
        park = new Park();
        park.addPaddocks(trexEnclosure);

        assertEquals(1, park.numberOfPaddocks());


    }




}
