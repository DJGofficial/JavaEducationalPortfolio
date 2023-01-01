
public class Teacher extends Person {

    private int salary;
    
    public Teacher(String name, String addy, int salary) {
        super(name, addy);
        this.salary=salary;
    }
    public int getSalary(){
        return salary;
    }

    @Override
    public String toString() {
        return super.toString()+"\n  "+"salary "+ salary+" euro/month";
    }
    
}
