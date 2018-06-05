import java.util.ArrayList;

public class Park extends Paddock{


    ArrayList <Paddock> paddocks;
    ArrayList<Dinosaur>dinosaurs;
    ArrayList<Visitor> visitors;
    int numberOfVisitors;
    boolean parkOpen;
    Paddock paddock;


    public Park(){
        visitors = new ArrayList<>();
        paddocks = new ArrayList<>();
        this.numberOfVisitors = 0;

    }

    public void addPaddocks(Paddock paddock) {

        if (!paddock.dinosaurRampages) {

            paddocks.add(paddock);

        } else {
            this.parkOpen = false;
        }

    }

        public int numberOfPaddocks(){

        return paddocks.size();
        }

        public int getNumberOfVisitors(){

        return visitors.size();
        }

    public void addVisitor(Visitor visitor) {

        if (parkOpen){

        this.visitors.add(visitor);
        this.numberOfVisitors +=1;}
    }

//    public void diplodocusRampaging (DiplodicusEnclosure diplodicusEnclosure){
//
//        for (int i = 0; i < paddocks.size(); i++){
//
//            if (diplodicusEnclosure.dinosaurRampages)
//
//                this.parkOpen = false;
//            }
//        }



    }

