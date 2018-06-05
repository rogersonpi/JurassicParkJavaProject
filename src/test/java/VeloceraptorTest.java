import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VeloceraptorTest {

    Veloceraptor veloceraptor;

    public VeloceraptorTest(){

    this.veloceraptor = new Veloceraptor("Bill", DietType.CARNIVORE);}

    //The one where a veloceraptor is created.
    //The one where a specific species of dinosaur is created.
    //The one where a CARNIVORE type is created.
    @Test
    public void canGetName() {

        assertEquals("Bill", veloceraptor.getName());

    }

    @Test
    public void isAbleToEat(){

        assertEquals(true, veloceraptor.feedDinosaur());
    }


    //t is possible to get enum type from instance of a veloceraptor
    @Test
    public void canGetDiet(){


        assertEquals(DietType.CARNIVORE, veloceraptor.getDietType());
    }



}

