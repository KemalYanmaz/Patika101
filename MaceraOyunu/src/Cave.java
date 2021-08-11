import java.util.Random;

public class Cave extends DangerLocation{
    public Cave() {
        super("Cave","Food");
    }


    @Override
    public String getObstacleName() {
        return "zombie";
    }
}
