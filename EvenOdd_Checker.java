import java.util.Scanner;
public class EvenOdd_Checker {
    public static void checkAndPrint(int number) {
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(number + " is " + result);
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        // Static input
        int no = 27;
        System.out.println("Static Check:");
        checkAndPrint(no);
        // Dynamic input
        System.out.print("\nEnter an integer: ");
        if (sc.hasNextInt()) {
            int inputNo = sc.nextInt();
            checkAndPrint(inputNo);
        } else {
            System.out.println("Invalid input! Please enter an integer.");
        }
    }
}
