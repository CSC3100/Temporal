import java.awt.*;

public class BarGray extends Decorator {
    private static final int BAR_WIDTH = 10;
    public final int MAX_NUMBER_OF_VALUES = 20;

    public void draw(Graphics g){
        g.setColor(Color.GRAY);
        for(int index = 0; index < Repository.getInstance().getValues().size(); index++){
            g.fillRect((501/MAX_NUMBER_OF_VALUES*index) - (BAR_WIDTH/2)+6, Repository.getInstance().getValue(index),
                    BAR_WIDTH, 190-Repository.getInstance().getValue(index));
        }
        super.draw(g);
    }

}
