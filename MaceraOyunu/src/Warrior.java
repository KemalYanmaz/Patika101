public abstract class Warrior extends Character {

    private Armor armor;
    public Warrior(String name, int damage, int health, int money) {
        super(name, damage, health, money);
    }


    public Armor getArmor(){

        if(this.armor!=null){
            return this.armor;
        }
        return new Armor("No equipped",0,0);
    }
    public void attack(Obstacle obstacle){
        Game.printDactilo(this.getName() + " attacked to " + obstacle.getName() + " with " + this.getWeapon().getName());
        obstacle.decreaseHealth(this.getDamage());
        this.getWeapon().attack(obstacle);
        String[] text = {
                this.getName()+this.getWeapon().onBattle()+" to "+obstacle.getName(),
                "\t\t\t---"+this.getName()+"---\t|\t---"+obstacle.getName()+"---",
                "Health:\t\t\t"+this.getHealth()+"  \t\t|\t\t"+obstacle.getHealth(),
                "Armor:\t\t\t"+this.getArmor().getName()+"   \t\t|\t\t"+0
        };

        for(String info:text){
            Game.printDactilo(Game.printTabbed(info),30);
        }
        if(this.getWeapon() instanceof FirearmWeapon){
            Game.printDactilo("Bullet:\t\t\t"+((FirearmWeapon) this.getWeapon()).getBullet()+"   \t\t|\t\t0",30);
        }
        if(obstacle.getHealth()==0){
            this.increaseMoney(obstacle.getMoney());
        }
    }



    public void buy(Product product){
        if(product!=null){
            if(product.getPrice()<=this.getMoney()){
                this.decreaseMoney(product.getPrice());
                Game.printDactilo(Game.printTabbed(this.getName()+" have boughted "+product.getName()));
                Game.printDactilo("Do you want to equip: "+ product.getName());
                Game.printDactilo("Yes or Not");
                if(Game.scanner.nextLine().equals("Yes")){
                    this.equip(product);
                }
            }else{
                Game.printDactilo(Game.printTabbed("Unsufficient money."));
            }
            Game.printDactilo(Game.printTabbed("Wallet: "+this.getMoney()));
        }
    }

    @Override
    public void equip(Product product) {
        super.equip(product);
        if(product instanceof Armor){
            this.armor = armor;
        }
        if(product!=null){
            Game.printDactilo(Game.printTabbed(product.getName()+" equipped"));
        }
    }
}
