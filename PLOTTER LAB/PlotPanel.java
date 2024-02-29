import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PlotPanel extends JPanel implements PropertyChangeListener {

    private Component component;

    public PlotPanel(Component component){
        this.component = component;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if(component !=null)
            component.draw(g);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        repaint();
    }
}