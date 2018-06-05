import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BrontsarusTest {

    Brontosaurus brontosaurus;
    public BrontsarusTest() {


        this.brontosaurus = new Brontosaurus("Brutus", DietType.HERBIVORE);
        //The one where a Brontosuarus is created.
        //The one where a specific species of dinosaur is created.
        //The one where a Herbivore type is created.
    }
        @Test
        public void canGetName(){

            assertEquals("Brutus", brontosaurus.getName());

        }

        //The one where a dipolodicus is able to eat
        @Test
        public void isAbleToEat(){

            assertEquals(true, brontosaurus.feedDinosaur());
        }


        //It is possible to get enum type from instance of a dinosaur
        @Test
        public void canGetDiet(){


            assertEquals(DietType.HERBIVORE, brontosaurus.getDietType());
        }

    }

