
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory cH;
    // private double initialBalance;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.cH = new ChangeHistory();
        setInitialBalance(initialBalance);

    }

    private void setInitialBalance(double initialBalance) {
        cH.add(initialBalance);
        super.addToWarehouse(initialBalance);
    }
    public String history() {
        return cH.toString();
    }
public void printAnalysis(){
    System.out.println("Product: "+super.getName()+"\nHistory: "+this.cH.toString()+"\nLargest amount of product: "+this.cH.maxValue()+"\nSmallest amount of product: "+this.cH.minValue()+"\nAverage: "+this.cH.average());
}
    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        cH.add(super.getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double amountTaken = super.takeFromWarehouse(amount);
         cH.add(super.getBalance());
          return amountTaken;
    }


    @Override
    public String toString() {
        return cH.toString();
    }

}
