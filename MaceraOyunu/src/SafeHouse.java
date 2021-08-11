public class SafeHouse extends SafeLocation{
    private int health;
    private int maxhealth;
    public SafeHouse() {
        super("Safe House");
    }

    private void healWarrior(){
        Game.getPlayer().getWarrior().setHealth(maxhealth);
        Game.printDactilo(Game.printTabbed("You're healed."));

    }
    @Override
    void welcoming() {
        String info = "******************YOU ARE IN SAFE*********************\n" +
                "\t\t\t\tWelcome to "+this.getName().toUpperCase();
        System.out.println(info);
        if(getTimes()!=1){
            health = Game.getPlayer().getWarrior().getHealth();
            maxhealth = Game.getPlayer().getWarrior().getMaxHealth();
            if(health!=maxhealth){
                if(health<0.60*maxhealth){
                    Game.printDactilo("Mann you are almost die. Do not risk your life!");
                    healWarrior();
                }else{
                    Game.printDactilo("Did you come here to dressing? That is just a knife cut. Go and fight like MAN!!");
                    healWarrior();
                }
            }else{
                Game.printDactilo("Hey what are you doing here ! Are you a warrior or whatt?? Go and FİGHT!!");
            }
        }else{
            Game.printDactilo(Game.printTabbed("Here is Safe House !")+
                    Game.printTabbed("You can come here when you need health.")+
                    Game.printTabbed("We do not want to lose you !")+
                    Game.printTabbed("Keep in mind !"));
        }
    }

    @Override
    void exit() {
        System.out.println("Exiting from "+this.getName());
        Game.printDactilo("See you warrior.");
    }

}
