
public class Person {

    private String name;
    private String addy;

    public Person(String name, String addy) {
        this.name = name;
        this.addy = addy;
    }

    @Override
    public String toString() {
        return name + "\n  " + addy;
    }

}
