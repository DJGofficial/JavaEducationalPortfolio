
import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {

   private ArrayList<Double> entries= new ArrayList<>(); 
    //  public double status;

    public ChangeHistory() {
    //  this.entries= new ArrayList<>();
    }

    public void add(double status) {
        this.entries.add(status);
    

    }

    public void clear() {
        this.entries.clear();
    }

    public double maxValue() {

        Double max = Collections.max(entries);

        return max;

    }

    public ArrayList<Double> getEntries() {
        return entries;
    }

    public double minValue() {
        Double min = Collections.min(entries);
        return min;

    }

    public double average() {
        double total = 0;
        double avg = 0;
        for (int i = 0; i < entries.size(); i++) {
            total = total + entries.get(i);
        }
        avg = total / entries.size();

        return avg;
    }

    @Override
    public String toString() {
        return  entries.toString();
    }


}
