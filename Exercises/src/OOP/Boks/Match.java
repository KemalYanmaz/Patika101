package OOP.Boks;

import java.util.Random;

public class Match {
    Fighter f1,f2;
    int minWeight,maxWeight;
    Random random;

    Match(Fighter f1,Fighter f2,int minWeight,int maxWeight){
        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;
        this.random = new Random();
    }

    public void run(){
        Fighter fighter;
        Fighter foe;
        if(isCheck()){
            while(f1.health>0&&f2.health>0){
                if(random.nextBoolean()){
                    fighter=f1;
                    foe=f2;
                }else{
                    fighter=f2;
                    foe=f1;
                }

                fighter.hit(foe);
            }
        }else{
            System.out.println("Dövüşçülerin sikletleri uygun değil");
        }
    }

    boolean isCheck(){
        return ((f1.weight>=minWeight&&f1.weight<=maxWeight)&&(f2.weight>=minWeight&&f2.weight<=maxWeight));
    }


}
