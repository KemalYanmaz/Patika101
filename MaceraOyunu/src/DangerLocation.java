import java.util.Random;

public abstract class DangerLocation extends Location{
    private String item;
    private Obstacle[] obstacles;


    public DangerLocation(String name,String item) {
        super(name);
        this.item = item;
    }

    public void setItem(String item){
        this.item = item;
    }

    public String getItem(){
        return this.item;
    }
    public abstract String getObstacleName();
    void welcoming() {
        String info = "******************YOU ARE IN DANGER*********************\n" +
                "\t\t\t\tHere is "+this.getName().toUpperCase();
        System.out.println(info);
        Game.printDactilo("Are you ready to deal with "+getObstacleName()+"s? As i hear they are powerful obstacles.\n" +
                "I am not sure you can deal with them. Look at yourself once. Just the hope is that you would be unseem to them.\n" +
                "But let me tell you that at least you will see one. So.. Good luck !");
        if(chooseOptionMenu()){
            initObstacles();
            if(chooseOptionBattle()){
                for(Obstacle obstacle:obstacles){
                    while(true){
                        if(Game.getPlayer().getWarrior().getHealth()>0&&obstacle.getHealth()>0){
                            Game.getPlayer().getWarrior().attack(obstacle);
                            obstacle.attack(Game.getPlayer().getWarrior());
                        }
                        if(obstacle.getHealth()<=0||Game.getPlayer().getWarrior().getHealth()<=0){
                            break;
                        }
                    }
                }
                if(Game.getPlayer().getWarrior().getHealth()>0){
                    if(!Game.getPlayer().getItem(this.getItem())){
                        Game.getPlayer().setItem(this.getItem(),true);
                        Game.printDactilo(Game.printTabbed("Congratulations ! you won "+this.getItem()));
                    }
                 }
            }else{
                exitFromBattle();
            }
        }else{
            exit();
        }
    }

    @Override
    void exit() {
        Game.printDactilo(Game.printTabbed("Please come back sir. We are afraid."));
    }

    void exitFromBattle() {
        Game.printDactilo(Game.printTabbed("You escaped from Battle"));

    }
    boolean chooseOptionMenu(){
        Game.printDactilo("You are in front of the "+this.getName()+"! Are you going to go inside?");
        Game.printDactilo("Yes or Not");
        if(Game.scanner.nextLine().equals("Yes")){
            return true;
        }
        return false;
    }

    boolean chooseOptionBattle(){
        Game.printDactilo("What will you do now? That choice is irrevocable ! ");
        Game.printDactilo("Attack or Not");
        if(Game.scanner.nextLine().equals("Attack")){
            return true;
        }
        return false;
    }

    void initObstacles(){
        obstacles = new Obstacle[1+new Random().nextInt(3)];
        if(obstacles.length==1){
            Game.printDactilo("I took a look to inside ! There is just one "+this.getObstacleName()+". Mann you're so lucky.");
        }else {
            Game.printDactilo("I took a look to inside ! There are "+obstacles.length+" "+this.getObstacleName()+"s. God bless you . Good luck" );
        }
        for(int i=0;i<obstacles.length;i++){
            switch (this.getClass().getName()) {
                case "Cave": obstacles[i] = new Zombie(); break;
                case "Forest": obstacles[i] = new Vampire();break;
                case "River" :obstacles[i] = new Bear();break;
            }
        }
    }
}
