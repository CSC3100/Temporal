import java.awt.*;

public class SquareBlue extends Decorator {
    private static final int POINT_HEIGHT = 10;
    private static final int POINT_WIDTH = 10;
    public final int MAX_NUMBER_OF_VALUES = 20;

    public void draw(Graphics g){
        g.setColor(Color.BLUE);
        for(int index = 0; index < Repository.getInstance().getValues().size(); index++){
            g.fillRect((501/MAX_NUMBER_OF_VALUES * index) - (POINT_WIDTH/2)+6,
              Repository.getInstance().getValue(index) - (POINT_HEIGHT/2), POINT_WIDTH, POINT_HEIGHT);
        }
        super.draw(g);
    }
}
