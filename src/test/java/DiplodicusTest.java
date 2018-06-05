import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiplodicusTest {

        Diplodicus diplodicus;

        public DiplodicusTest(){
        this.diplodicus = new Diplodicus("Jeff", DietType.HERBIVORE);}

        //The one where a diplodicus is created.
        //The one where a specific species of dinosaur is created.
        //The one where a Herbivore type is created.
        @Test
        public void canGetName() {

            assertEquals("Jeff", diplodicus.getName());

        }

        @Test
        public void isAbleToEat(){

            assertEquals(true, diplodicus.feedDinosaur());
        }


        //t is possible to get enum type from instance of a dinosaur
        @Test
        public void canGetDiet(){


            assertEquals(DietType.HERBIVORE, diplodicus.getDietType());
        }



    }


