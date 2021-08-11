import javax.swing.*;
import java.util.Scanner;

public class Game {
    private static Player player;
    private static Location location;
    static final String GAME_NAME = "Game of The Adventure";
    static Scanner scanner = new Scanner(System.in);
    Warrior[] warriors = {new Samurai(),new Archer(),new Knight()};
    SafeLocation[] safeLocations = {new ToolStore(),new SafeHouse()};
    DangerLocation[] dangerLocations={new Cave(),new Forest(),new River()};

    void start(){
        welcoming();
        gameArea();
    }

    private void gameArea(){
        menu();
    }

    public void menu(){
        System.out.println("---------------------------"+GAME_NAME+"---------------------------------");
        while(true){
            if(getPlayer().getWarrior().getHealth()==0){
                gameOver();
                break;
            }
            if(getPlayer().getItem("Water")&&getPlayer().getItem("Firewood")&&getPlayer().getItem("Food")){
                win();
                break;
            }
            location = chooseLocation();
            location.init();

        }
    }

    public void win(){
        printDactilo(printTabbed("WİNNER WİNNER CHİCKEN DİNNER"));
    }

    private void welcoming(){
        System.out.println(GAME_NAME +" is starting !");
        player = new Player(askQuestion("What is your name sir?\nYour name:"));
        printDactilo("Dear "+player.getName()+",\nEverything in that island is real.Be careful and follow me !\n");
        player.setWarrior(chooseWarrior());
    }

    public static String askQuestion(String question){
        printDactilo(question+" ");
        return scanner.nextLine();
    }

    public static void printDactilo(String text){
        printDactilo(text,30);
    }

    public static void printDactilo(String text,int time){
        System.out.println();
        for(int i=0;i<text.length();i++){

            try{
                if(text.charAt(i)!='\t'){
                    Thread.sleep(time);
                }
            }catch (Exception e){

            }
            System.out.print(text.charAt(i));
        }
    }
    private Warrior chooseWarrior(){
        System.out.println("------------------------------Select Your Warrior----------------------");

        System.out.println("\tID\t|\tName\t|\tDamage\t|\tHealth\t|\tMoney");
        int counter = 0;
        for(Warrior warrior:warriors){
            counter++;
            System.out.println("\t"+counter+"-\t|\t"+warrior.getName()+"\t|\t  "+warrior.getDamage()+"  \t|\t  "+warrior.getHealth()+"  \t|\t  "+warrior.getMoney());
        }
        int selection = Integer.parseInt(askQuestion("Your prefer: "));

        while(selection>0 && selection>warriors.length){
           System.out.println("There is no any warrior that has id "+selection);
           selection = Integer.parseInt(askQuestion("Your prefer: "))-1;
        }
        return warriors[selection-1];
    }
    private Location chooseLocation(){

        System.out.println("***********Locations*********\n\tID\t|\tName\t|\tType");
        int counter = 0;
        for(SafeLocation location: safeLocations){
            counter++;
            System.out.println("\t"+counter+"\t|\t"+location.getName()+"\t|\tSAFE AREA");
        }
        for(DangerLocation location: dangerLocations){
            counter++;
            System.out.println("\t"+counter+"\t|\t"+location.getName()+"\t|\tDANGER AREA");
        }

        int selection = Integer.parseInt(askQuestion("Your prefer: "));

        while(selection>0 && selection>safeLocations.length+dangerLocations.length){
            printDactilo("There is no any location that has id "+selection);
            selection = Integer.parseInt(askQuestion("Your prefer: "))-1;
        }
        if(selection<=safeLocations.length){
            return safeLocations[selection-1];
        }else{
            return dangerLocations[selection-safeLocations.length-1];
        }
    }

    public static String printTabbed(String text){
        return "\t\t\t\t"+text+"\n";
    }
    public static Player getPlayer(){
        return player;
    }
    public static void gameOver(){
        printDactilo(printTabbed("Game Over"),140);
    }
}