public class ToolStore extends SafeLocation{
    private Weapon[] weapons;
    private Armor[] armors;
    private String info;
    public ToolStore() {
        super("ToolStore");
    }
    @Override
    void welcoming() {
        info = "******************-TOOLSTORE-*********************\n" +
                "\t\t\tWelcome to "+this.getName().toUpperCase();
        System.out.println(info);
        Game.printDactilo(Game.printTabbed(getInfo()));
        Game.getPlayer().getWarrior().buy(shop());
        exit();
    }

    @Override
    void exit() {
        Game.printDactilo(Game.printTabbed("See you warrior."));
    }

    public String getInfo(){
        info = Game.printTabbed("You can buy the equipments you needed.\nHere speaks money. Let's take a look to your wallet !\n");
        int money = Game.getPlayer().getWarrior().getMoney();
        info+=Game.printTabbed((money>=40)?"Woaa mann you are rich!!":"Oh poor man..");
        info+=Game.printTabbed("Hey guys he has $"+money);
        return info;
    }

    public Product shop(){
        weapons= new Weapon[]{new Sword(), new Pistol(), new Rifle()};
        armors= new Armor[]{new LightArmor(),new MediumArmor(),new HeavyArmor()};
        Game.printDactilo(Game.printTabbed("**********SHOPPING*********"));
        int counter = 0;
        System.out.println("\tID\t|\tName\t|\tDamage\t|\tPrice");
        for(Weapon weapon:weapons){
            counter++;
            System.out.println("\t"+counter+"-\t|\t"+weapon.getName()+"\t|\t  "+weapon.getDamage()+"  \t|\t  "+weapon.getPrice());
        }

        System.out.println("------------------------------------");
        System.out.println("\tID\t|\t\tName\t\t|\tDefence\t|\tPrice");
        for(Armor armor:armors){
            counter++;
            System.out.println("\t"+counter+"-\t|\t"+armor.getName()+"   \t|\t  "+armor.getDefence()+"  \t|\t  "+armor.getPrice());
        }
        int selection = Integer.parseInt(Game.askQuestion("Your prefer: -1 to exit\n"));
        if(selection==-1){
            return null;
        }

        while(selection>0 && selection>weapons.length+armors.length){
            Game.printDactilo("There is no any location that has id "+selection);
            selection = Integer.parseInt(Game.askQuestion("Your prefer: "))-1;
        }
        if(selection<=weapons.length){
            return weapons[selection-1];
        }else{
            return armors[selection-weapons.length-1];
        }
    }

}
