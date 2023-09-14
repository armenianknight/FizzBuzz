import java.util.Scanner;

public class Reduce {
    public static void main(String[] args) {
        //This is how you get an variable from a user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a number.");
        int n = scanner.nextInt();
        scanner.close();
        //Here I just print out how many steps it took to get to zero from the method in the Reduce class
        int steps = doReduce(n);
        System.out.println("Number of iterations: " + steps);
    }
    public static int doReduce(int n) {
        int steps = 0;
        while (n != 0) {
            if (n % 2 != 0) {
                n = n - 1;
            }
            else {
                n = n / 2;
            }
            steps++;
        }
        return steps;
    }
}
