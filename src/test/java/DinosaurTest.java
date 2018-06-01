import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DinosaurTest {

    TRex trex;

    public DinosaurTest(){
    this.trex = new TRex("Bill", DietType.HERBIVORE);}
    @Test
    public void canGetName(){

        assertEquals("Bill", trex.getName());
    }

    @Test
    public void isAbleToEat(){

        assertEquals(true, trex.feedDinosaur());
    }

    @Test
    public void canGetDiet(){


        assertEquals(DietType.HERBIVORE, trex.getDietType());
    }
}
