import java.awt.*;

public abstract class Decorator implements Component {

    protected Component component;

    public void add(Component d){
        component = d;
    }

    @Override
    public void draw(Graphics g) {
        component.draw(g);
    }

}
