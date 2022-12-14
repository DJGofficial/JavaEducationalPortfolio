
 public   class Solution {
        public static int num = 14;
        public static int x;

        public static int numberOfSteps(int num) {
            x = num;
            while (x != 0) {
                if (x % 2 == 0) {
                    x = x / 2;

                } else if (x % 2 != 0) {
                    x = x - 1;

                      System.out.println("Num "+num);


                     System.out.println("X " + x);

                }
            }
            return x;
        }
    }

