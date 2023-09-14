public class Multiples {
    public static void main(String[] args) {
        System.out.println(domultiples(1000));
        //System.out.println(whilemultiple(1000)); This was just for the while loop
    }

    public static int domultiples(int n) {
        //for loop
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                count++;
            }
        }
        return count;
    }
    /* Finished while loop version
    public static int whilemultiple(int m) {
        int count = 0;
        int number = 1;

        while (number < m) {
            if (number % 3 == 0 || number % 5 == 0) {
                count++;
            }
            number++;
        }

        return count;
    }

    */
}

