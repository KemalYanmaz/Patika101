package OOP.Boks;

public class Main {

    public static void main(String[] args) {

        Fighter fighter = new Fighter("Kemal",10,100,80);
        Fighter fighter2 = new Fighter("Ulas",10,100,80);
        new Match(fighter,fighter2,10,130).run();

    }

}
