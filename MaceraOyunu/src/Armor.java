public class Armor extends Product {
    private int defence;

    public Armor(String name, int price,int defence) {
        super(name, price);
        this.defence = defence;
    }

    public void setDefence(int defence){
        this.defence = defence;
    }

    public int getDefence(){
        return this.defence;
    }
}
