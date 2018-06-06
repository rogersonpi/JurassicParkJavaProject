import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;
    Paddock trexEnclosure;
    Visitor visitor, visitor2, visitor3;
    DiplodicusEnclosure diplodicusEnclosure;
    Diplodicus diplodicus;
    TRex tRex;

    @Before
    public void before() {

        tRex = new TRex("Gwaar", DietType.CARNIVORE);
        diplodicus = new Diplodicus("bill", DietType.HERBIVORE);
        park = new Park();
        visitor = new Visitor("Jeff Goldblum");
        visitor2 = new Visitor("Sam Niel");
        visitor3= new Visitor("Laura Dern");
        diplodicusEnclosure = new DiplodicusEnclosure();
        trexEnclosure = new TRexEnclosure();
    }

    @Test
    public void canAddHerbivorePaddock() {

        //The one where a paddock is added to the park
        //The one where a new park is created

        park.addHerbivorePaddock(diplodicusEnclosure);

        assertEquals(1, park.numberOfPaddocks());
    }

    @Test
    //The one where a visitor can be added to the park
    public void canAddVisitorToThePark() {
        park.addVisitor(visitor);
        //assertEquals(1, this.park.numberOfVisitors());
        assertEquals(1, this.park.getNumberOfVisitors());
    }

    //The one where rampaging dinosaur means park is closed to new visitors.
    @Test
    public void dinosaurRampages() {
        diplodicusEnclosure.herbivoreRampages(tRex);
        park.addHerbivorePaddock(diplodicusEnclosure);
        assertEquals(false, park.parkOpen);
    }

    @Test
    //The one where rampaging dinosaur means park is closed to new visitors.
    public void parkIsClosed() {

        diplodicusEnclosure.herbivoreRampages(tRex);
        park.addHerbivorePaddock(diplodicusEnclosure);
        park.addVisitor(visitor);
        assertEquals(0, park.numberOfVisitors);
    }

    @Test
    //The one where a carnivore paddock is added
    public void addCarnivorePaddock() {
        park.addCarnivorePaddock(trexEnclosure);

    }

    @Test
    //The one where the park class adds a dinosaur to an existing carnivore paddock
    public void canAddDinosaurToCarnivorePaddock() {


        park.addCarnivorePaddock(trexEnclosure);
        park.addDinosaurToCarnivorePaddock(tRex, trexEnclosure);
        assertEquals(trexEnclosure, park.retrievedPaddock);
        assertEquals(1, trexEnclosure.getNumberOfDinosaurs());

    }

    @Test
    //The one where a herbivore is added to the herbivore enclosure
    public void canAddHerbivoreToHerbivorePaddock(){

        park.addHerbivorePaddock(diplodicusEnclosure);
        park.addDinosaurToHerbivorePaddock(diplodicus,diplodicusEnclosure);
        assertEquals(diplodicusEnclosure, park.retrievedPaddock);
        assertEquals(1, diplodicusEnclosure.getNumberOfDinosaurs());
    }


    @Test
//    //Adding Carnivore to Herbivore enclosure results in rampage.
    public void carnivoreInHerbivoreCausesRampage() {


        park.addHerbivorePaddock(diplodicusEnclosure);
        park.addDinosaurToHerbivorePaddock(tRex, diplodicusEnclosure);
        assertEquals(diplodicusEnclosure, park.retrievedPaddock);
        assertEquals(0, diplodicusEnclosure.getNumberOfDinosaurs());
    }

//    //Adding Herbivore to Carnivore enclosure results in rampage
    @Test

    public void herbivoreInCarnivorePaddockCausesRampage() {


    park.addCarnivorePaddock(trexEnclosure);
    park.addDinosaurToCarnivorePaddock(diplodicus, trexEnclosure);
    assertEquals(trexEnclosure, park.retrievedPaddock);
    assertEquals(0, trexEnclosure.getNumberOfDinosaurs());

}
    @Test
    public void canGetNumberOfVisitors(){

        park.addVisitor(visitor);
        park.addVisitor(visitor2);
        park.addVisitor(visitor3);
        assertEquals(3, park.getNumberOfVisitors());
    }

    @Test
    public void herbivoreInCarnivorePaddockClosedPark() {


    park.addCarnivorePaddock(trexEnclosure);
    park.addDinosaurToCarnivorePaddock(diplodicus, trexEnclosure);
    assertEquals(false, park.parkOpen);


    }
}
//
//
//
//    @Test
//    //Adding Carnivore to Herbivore enclosure results in rampage.
//
//
//    @Test
//    //Can return number of visitors.
//
//
//
//
//
//
//}
