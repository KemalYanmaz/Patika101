import javax.print.attribute.standard.JobImpressionsSupported;

public abstract class Character {

    private String name;
    private int damage;
    private int health;
    private int maxHealth;
    private int money;
    private Weapon weapon;

    public Character(String name,int damage,int health,int money){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.maxHealth = health;
        this.money = money;
        this.weapon = new Hand();
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }



    public void equip(Product product)
    {
        if(product instanceof Weapon)
        this.weapon = weapon;
    }




    public Weapon getWeapon(){
        return this.weapon;
    }

    public void decreaseMoney(int money){
        this.money -= money;
    }
    public void increaseMoney(int money){
        this.money += money;
    }
    public void increaseDamage(){
        this.damage += damage;
    }
    public void decraseDamage(int damage){
        this.damage -= damage;
    }
    public void increaseHealth(int health){
        this.health += health;
    }
    public void decreaseHealth(int health){
        setHealth(this.getHealth()-health);
        if(getHealth()==0){
            Game.printDactilo(this.getName()+" died.");
        }

    }


    public void setDamage(int damage){
        this.damage = damage;
    }
    public void setHealth(int health){
        if(health<0){
            health=0;
        }
        this.health = health;
    }
    public void setMoney(int money){
        this.money = money;
    }
    public int getDamage(){
        return this.damage;
    }
    public int getHealth(){
        return this.health;
    }
    public int getMoney(){
        return this.money;
    }
    public int getMaxHealth(){return this.maxHealth;}

}
