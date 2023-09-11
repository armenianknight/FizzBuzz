/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

   /*
   public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {

            // Find out which numbers divide i.
            // First parameter is an initialization of the counting variable and second parameter is the stop condition
            // Third parameter is the jumps
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            // && is the same as using and
            if (divisibleBy3 && divisibleBy5) {
                // println() is the same as print()
                System.out.println("Fizz Buzz");

            } else if (divisibleBy3) {

                System.out.println("Fizz");

            } else if (divisibleBy5) {

                System.out.println("Buzz");

            } else {

                System.out.println(i);

            }
        }
    }

    */

    public static void main(String[] args) {
        int a = 1;
        while (a <= 100) {
            a = doFizzBuzz(a);
        }
    }

    private static int doFizzBuzz(int a) {
        boolean divisible_by_3 = a % 3 == 0;
        boolean divisible_by_5 = a % 5 == 0;

        if (divisible_by_3 && divisible_by_5) {
            System.out.println("Fizz Buzz");
        }

        else if (divisible_by_3) {
            System.out.println("Fizz");
        }

        else if (divisible_by_5) {
            System.out.println("Buzz");
        }

        else {
            System.out.println(a);
        }
        a++;
        return a;
    }
}
