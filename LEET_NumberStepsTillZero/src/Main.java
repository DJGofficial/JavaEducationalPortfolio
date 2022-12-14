public class Main {

    public static int num = 14;
public static Solution sol=new Solution();


    public static void main(String[] args) {
       Solution.numberOfSteps(num);
       // numberOfSteps(num);
    }

    public static int numberOfSteps(int num) {
int x=num;
        while (num != 0) {
            if (num % 2 == 0 && x != 0) {
                num = (num / 2);
                System.out.println("Even " + x);
            } else if (num % 2 != 0) {
                num = num - 1;
                System.out.println("Uneven " + num);
                //  System.out.println("Num "+num);


                //System.out.println("X " + x);
            }
            System.out.println("X " + x);
        }
        return x;

    }
}


