public class Forest extends DangerLocation{

    public Forest() {
        super("Forest", "Firewood");
    }

    @Override
    public String getObstacleName() {
        return "vampire";
    }



    @Override
    void exit() {

    }
}
