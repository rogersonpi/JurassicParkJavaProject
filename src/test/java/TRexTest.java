import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TRexTest {

    TRex trex;

    public TRexTest(){
    this.trex = new TRex("Bill", DietType.CARNIVORE);}

    //The one where a dinosaur is created.
    //The one where a specific species of dinosaur is created.
    //The one where a CARNIVORE type is created.
    @Test
    public void canGetName() {

        assertEquals("Bill", trex.getName());

    }

    @Test
    public void isAbleToEat(){

        assertEquals(true, trex.feedDinosaur());
    }

    //t is possible to get enum type from instance of a dinosaur
    @Test
    public void canGetDiet(){


    assertEquals(DietType.CARNIVORE, trex.getDietType());
    }



}
