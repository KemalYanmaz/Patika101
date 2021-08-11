public class River extends DangerLocation{
    public River() {
        super("River", "Water");
    }

    @Override
    public String getObstacleName() {
        return "bear";
    }
}
