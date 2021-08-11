public class FirearmWeapon extends Weapon{
    private int bullet;

    public FirearmWeapon(String name, int price, int damage,int bullet) {
        super(name, price, damage);
        this.bullet = bullet;
    }

    public int getBullet(){
        return this.bullet;
    }

    public void setBullet(int bullet){
        this.bullet = bullet;
    }

    private void decreaseBullet(){
        this.bullet--;
    }

    @Override
    public String onBattle(){
        return "shooted with "+this.getName();
    }
    @Override
    public void attack(Character character){
        super.attack(character);
        decreaseBullet();
    }

}
