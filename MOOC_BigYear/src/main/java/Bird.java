import java.util.ArrayList;

public class Bird {

    private String name;
    private String latin;
    private int ob;
    
    public Bird(String name, String latin,int ob){
     
        this.name = name;
        this.latin = latin;
        this.ob = 0;
    }
 public String getName(){
       return this.name;
   }
   public boolean nameContains(String check){
       return this.name.contains(check);
   }
    public String getLatin(String latin){
       return this.latin;
   }
     public void setOb(int ob){
       this.ob=this.ob+1;
   }
      public int getOb(){
       return this.ob;
   }
      @Override
    public String toString() {
          if (this.ob == 1) {
            return name + " (" + latin + "): " + ob + " observation";
        } else{
            return name + " (" + latin + "): " + ob + " observations";
        }
       
}    
}
