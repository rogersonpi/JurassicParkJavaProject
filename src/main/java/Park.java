import java.util.ArrayList;

public class Park {


    ArrayList <Paddock> paddocks;


    public Park(){

        paddocks = new ArrayList<>();
    }

    public void addPaddocks(Paddock paddock){

        paddocks.add(paddock);

        }


        public int numberOfPaddocks(){

        return paddocks.size();
        }
}
