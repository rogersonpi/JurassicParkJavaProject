import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;
    Paddock trexEnclosure;
    Visitor visitor;
    DiplodicusEnclosure diplodicusEnclosure;
    TRex tRex;

    @Before
    public void before(){
        tRex = new TRex("Gwaar", DietType.CARNIVORE);
        park = new Park();
        visitor = new Visitor("Jeff Goldblum");
        diplodicusEnclosure = new DiplodicusEnclosure();
        diplodicusEnclosure.herbivoreRampages(tRex);
    }

    @Test
    public void canAddPaddock(){

        //The one where a paddock is added to the park
        //The one where a new park is created

        trexEnclosure = new TRexEnclosure();
        park = new Park();
        park.addPaddocks(trexEnclosure);

        assertEquals(1, park.numberOfPaddocks());
    }

    @Test
    //The one where a visitor can be added to the park
    public void canAddVisitorToThePark(){
        park.addVisitor(visitor);
        //assertEquals(1, this.park.numberOfVisitors());
        assertEquals(1, this.park.getNumberOfVisitors());
    }

    //The one where rampaging dinosaur means park is closed to new visitors.
    @Test
    public void dinosaurRampages(){
        diplodicusEnclosure.herbivoreRampages(tRex);
        park.addPaddocks(diplodicusEnclosure);
        assertEquals(false, park.parkOpen);
    }

    @Test
    //The one where rampaging dinosaur means park is closed to new visitors.
    public void parkIsClosed(){

        diplodicusEnclosure.herbivoreRampages(tRex);
        park.addPaddocks(diplodicusEnclosure);
        park.addVisitor(visitor);
        assertEquals(0, park.numberOfVisitors);
    }

}
