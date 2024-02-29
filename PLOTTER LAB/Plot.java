import java.awt.*;
import java.util.LinkedList;

public class Plot implements Component {

    public final int MAX_NUMBER_OF_VALUES = 20;

    @Override
    public void draw(Graphics g) {
        Graphics2D graphics2D = (Graphics2D)g;
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setColor(Color.BLUE);
        for(int index = 0; index < Repository.getInstance().getSize(); index++){
            if(index == 0){
                g.fillRect(501/MAX_NUMBER_OF_VALUES*index+6, Repository.getInstance().getValue(index), 1, 1);
            }else{
                g.drawLine(501/MAX_NUMBER_OF_VALUES*(index-1)+6, Repository.getInstance().getValue(index-1),
                        501/MAX_NUMBER_OF_VALUES*index+6, Repository.getInstance().getValue(index));
            }
        }
        g.setColor(Color.RED);
        if(!Repository.getInstance().getValues().isEmpty()) {
            int sum = 0;
            for (int index = 0; index < Repository.getInstance().getValues().size(); index++) {
                sum += (int) Repository.getInstance().getValues().get(index);
            }
            g.drawLine(0, (sum / Repository.getInstance().getValues().size()), 501, (sum / Repository.getInstance().getValues().size()));
        }
    }
}
