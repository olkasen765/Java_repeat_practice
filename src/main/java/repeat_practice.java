import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Read the integer
        int age = sc.nextInt();

        // Write your code here to determine the life stage based on the input age
        // You should use if...else if...else statement
        // Then, print out the appropriate message

        if (age < 13) {
            System.out.println("Child");
        } else if (age > 12 && age < 18) {
            System.out.println("Teenager");
        } else if (age > 17 && age < 60) {
            System.out.println("Adult");
        } else {
            System.out.println("Citizen");
        }

        sc.close();
    }
}