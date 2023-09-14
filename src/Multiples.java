public class Multiples {
    public static void main(String[] args) {
        System.out.println(domultiples(1000));
    }

    public static int domultiples(int n) {
        //attempt at a while loop
        /*
        int i = 1;
        boolean multiple_of_3 = i % 3 == 0;
        boolean multiple_of_5 = i % 5 == 0;
        int count = 0;
        while (i <= n) {
            if (multiple_of_3 || multiple_of_5) {
                count++;
            }
        }
        return count;
    }

         */
        //for loop
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                count++;
            }
        }
        return count;
    }
}
