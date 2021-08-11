public abstract class Location {
    private int times=0;
    private String name;

    public Location(String name){
        this.name = name;
    }

    abstract void welcoming();
    abstract void exit();
    public void init(){
        incrementTimes();
        welcoming();
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void incrementTimes(){
        this.times++;
    }
    public int getTimes(){
        return this.times;
    }

}
