import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {


        Park park;

        DiplodicusEnclosure diplodicusEnclosure;
        VeloceraptorEnclosure veloceraptorEnclosure;
        BrontosaurusEnclosure brontosaurusEnclosure;
        TRexEnclosure tRexEnclosure;
        Scanner sc = new Scanner(System.in);
        diplodicusEnclosure = new DiplodicusEnclosure();
        tRexEnclosure = new TRexEnclosure();
        veloceraptorEnclosure = new VeloceraptorEnclosure();
        brontosaurusEnclosure = new BrontosaurusEnclosure();
        Brontosaurus brontosaurus;
        TRex trex;
        Veloceraptor veloceraptor;

        System.out.println("Would you like to create a new park, Y/N");
        String answer = sc.next();
        if (answer.equals("Y")) {
            park = new Park();

            System.out.println("Which action would you like to perform?");
            System.out.println("1: add enclsore to park");
            System.out.println("2: add dinosaure to enclosure");
            System.out.println("3: Sign in visitors to park");
            System.out.println("4: Find a dinosaur");
            System.out.println("5: feed a dinosaur");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Which enclosure would you like to create?");
                System.out.println("1: Diplodicus Enclosure");
                System.out.println("2: Veloceraptor Enclosure");
                System.out.println("3: TRex Enclosure");
                System.out.println("4: Brontausarus Enclosure");
                int choice2 = sc.nextInt();

                if (choice2 == 1) {
                    park.addHerbivorePaddock(diplodicusEnclosure);
                    System.out.println("Diplodocus enclosure added to park.");
                    System.out.println("Type in the species of dinosaur you would like to add to the enclosure");
                    String dinosaur = sc.next();
                    System.out.println("Enter it's name");
                    String name = sc.next();
                    if (dinosaur.equals("diplodocus")) {
                        veloceraptor = new Veloceraptor(name, DietType.CARNIVORE);
                        tRexEnclosure.addDinosaur(veloceraptor);
                        System.out.println(name + " added to enclosure");
                    }
                } else if (choice2 == 2) {
                    park.addCarnivorePaddock(veloceraptorEnclosure);
                    System.out.println("Veloceraptor enclosure added to park.");
                    System.out.println("Type in the species of dinosaur you would like to add to the enclosure");
                    String dinosaur = sc.next();
                    System.out.println("Enter it's name");
                    String name = sc.next();
                    if (dinosaur.equals("veloceraptor")) {
                        veloceraptor = new Veloceraptor(name, DietType.CARNIVORE);
                        tRexEnclosure.addDinosaur(veloceraptor);
                        System.out.println(name + " added to enclosure");
                    }
                } else if (choice2 == 3) {
                    park.addCarnivorePaddock(tRexEnclosure);
                    System.out.println("TRex enclosure added to park.");
                    System.out.println("Type in the species dinosaur you would like to add to the enclosure");
                    String dinosaur = sc.next();
                    System.out.println("Enter it's name");
                    String name = sc.next();
                    if (dinosaur.equals("TRex")) {
                        trex = new TRex(name, DietType.CARNIVORE);
                        tRexEnclosure.addDinosaur(trex);
                        System.out.println(name + " added to enclosure");
                    }
                } else if (choice2 == 4) {
                    park.addHerbivorePaddock(brontosaurusEnclosure);
                    System.out.println("Brontosaurus Enclosure added to park");
                    System.out.println("Type in the species of dinosaur you would like to add to the enclosure");
                    String dinosaur = sc.next();
                    System.out.println("Enter it's name");
                    String name = sc.next();
                    if (dinosaur.equals("brontosaurus")) {
                        brontosaurus = new Brontosaurus(name, DietType.HERBIVORE);
                        brontosaurusEnclosure.addDinosaur(brontosaurus);
                        System.out.println(name + " added to enclosure");
                    }

                }
            }
            if (choice == 2) {

                System.out.println("Type in the species of dinosaur you would like to add to the enclosure");
                String dinosaur = sc.next();
                System.out.println("Enter it's name");
                String name = sc.next();
                if (dinosaur.equals("brontosaurus")) {
                    brontosaurus = new Brontosaurus(name, DietType.HERBIVORE);
                    brontosaurusEnclosure.addDinosaur(brontosaurus);
                    System.out.println(name + " added to enclosure");
                } else if (dinosaur.equals("TRex")) {
                    trex = new TRex(name, DietType.CARNIVORE);
                    tRexEnclosure.addDinosaur(trex);
                    System.out.println(name + " added to enclosure");
                } else if (dinosaur.equals("veloceraptor")) {
                    veloceraptor = new Veloceraptor(name, DietType.CARNIVORE);
                    tRexEnclosure.addDinosaur(veloceraptor);
                    System.out.println(name + " added to enclosure");
                } else if (dinosaur.equals("diplodocus")) {
                    veloceraptor = new Veloceraptor(name, DietType.CARNIVORE);
                    tRexEnclosure.addDinosaur(veloceraptor);
                    System.out.println(name + " added to enclosure");
                }

            }
            if (choice == 3) {

                System.out.println("Please enter the name of the visitor");
                String name = sc.next();
                Visitor visitor = new Visitor(name);
                park.addVisitor(visitor);
                System.out.println(name + " has been added to the park");
            }

            if (choice == 4) {

                System.out.println("Which dinosaur would you like to find.");
                String name = sc.next();
                tRexEnclosure.addDinosaur(trex = new TRex(name, DietType.CARNIVORE));
                String founddinosaur = tRexEnclosure.findDinosaur(trex) + (" is waiting for you.");

                System.out.println(founddinosaur);


            }
            if (choice == 5) {

                System.out.println("Which dinosaur would you like to feed");
                String name = sc.next();
                tRexEnclosure.addDinosaur(trex = new TRex(name, DietType.CARNIVORE));
                tRexEnclosure.findDinosaur(trex);
                tRexEnclosure.feedDinosaurInPaddock(trex);



            }

        }
    }
}

