public abstract class Weapon extends Product{
    private int damage;

    public Weapon(String name, int price,int damage) {
        super(name, price);
        this.damage = damage;
    }

    public void attack(Character character){
        character.decreaseHealth(this.damage);
    }
    public void setDamage(int damage){
        this.damage = damage;
    }

    public int getDamage(){
        return this.damage;
    }

    public String onBattle(){
        return " hitted with "+this.getName();
    }
}
