import java.util.ArrayList;

public class Box implements Packable{

    private double maxCap;
    private ArrayList<Packable> items;
    private double kilo;
  //private int itemCount;

    public Box(double maxCap) {
        this.maxCap = maxCap;
        this.items=new ArrayList<>();
    }



    public void add(Packable item) {
        if (!(item.weight()+kilo>maxCap)) {
            this.items.add(item);
            kilo=kilo+item.weight();
        }


     //   System.out.println(this.items+"From ADD");
       //weight()=weight()+item.weight();
       // this.maxCap++;
                //this.maxCap-packable.weight();
    }

    @Override
    public String toString() {
        return "Box: " +
               items.size()+" items, total weight " +weight()+" kg";
    }

    @Override
    public double weight() {
        //double weight=this.maxCap-maxCap;
        double weight=0;
        for(Packable packWeight:this.items){
       weight=weight+ packWeight.weight();
    }
      //  items.get(0).weight()
        return weight;
    }
}
