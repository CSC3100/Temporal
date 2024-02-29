import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

public class Repository extends PropertyChangeSupport {

    private static Repository instance = null;
    private ArrayList<Integer> values = new ArrayList<Integer>();

    private Repository(){
      super(new Object());
    }

    public static Repository getInstance(){
        if (instance == null){
            instance = new Repository();
        }
        return instance;
    }
    public void create(){
        int value = 5 + (int) Math.ceil(Math.random() * 150);
        values.add(value);
        int MAX_NUMBER_OF_VALUES = 20;
        if(values.size() >MAX_NUMBER_OF_VALUES){
            values.remove(0);
        }
        firePropertyChange("value", null, value);
    }
    public int getValue(int position){
        return values.get(position);
    }

    public int getSize() {
        return values.size();
    }

    public ArrayList<Integer> getValues() {
        return values;
    }
}
