package OOP.Boks;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;

    public Fighter(String name, int damage, int health, int weight) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
    }

    public int hit(Fighter foe){
        System.out.println(name + " hitted "+foe.name+" "+damage);
        return 1;
    }
}
