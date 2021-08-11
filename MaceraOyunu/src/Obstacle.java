public class Obstacle extends Character {
    public Obstacle(String name, int damage, int health, int money) {
        super(name, damage, health, money);
    }

    public void attack(Warrior warrior){
        Game.printDactilo(this.getName() + " attacked to " + warrior.getName() + " with " + this.getWeapon().getName());
        warrior.decreaseHealth(this.getDamage()+this.getWeapon().getDamage());
    }
}
