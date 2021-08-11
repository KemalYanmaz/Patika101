import java.util.HashMap;
import java.util.Map;

public class Player {
    private String name;
    private Warrior warrior;
    private Map<String, Boolean> items = new HashMap<>();


    public Player(String name){
        this.name = name;
        items.put("Food",false);
        items.put("Water",false);
        items.put("Firewood",false);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setWarrior(Warrior warrior){
        this.warrior =warrior;
    }

    public Warrior getWarrior(){
        return this.warrior;
    }

    public Boolean getItem(String key){
        return this.items.get(key);
    }
    public void setItem(String key,boolean value){
        if(this.items.containsKey(key)){
            this.items.replace(key,value);
        }else{
            this.items.put(key,value);
        }
    }
}
