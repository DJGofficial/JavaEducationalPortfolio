
public class Student extends Person {

    private int credits;

    public Student(String name, String addy) {
        super(name, addy);
      
    }
/*
    public Student(int credits) {
        this.credits = credits;
    }
*/
    public void study() {
    credits = credits+1;
    }

    public int credits() {
        return this.credits;
    }

    @Override
    public String toString() {
        return super.toString()+"\n  Study credits " +credits ;
    }

}
