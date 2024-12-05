import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        int Bubblegum = 202;
        int Toffee = 118;
        int Ice_cream = 2250;
        int Milk_chocolate = 1680;
        int Doughnut = 1075;
        int Pancake = 80;
        int Coffee = 800;

        double Income = Bubblegum + Toffee + Ice_cream + Milk_chocolate + Doughnut + Pancake + Coffee;

//        System.out.println("Earned amount:");
//        System.out.println("Bubblegum: $" + Bubblegum);
//        System.out.println("Toffee: $" + Toffee);
//        System.out.println("Ice cream: $" + Ice_cream);
//        System.out.println("Milk chocolate: $" + Milk_chocolate);
//        System.out.println("Doughnut: $" + Doughnut);
//        System.out.println("Pancake: $" + Pancake);
//        System.out.println("Coffee: $" + Coffee);
        System.out.println("\nIncome: $" + Income);
        System.out.printf("Average per item: $" + "%.1f%n", Income/7);

        String hello = "Hello, world. How are you?";
        System.out.println(hello);

        System.out.println(Coffee*2);

//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Please enter your full name: ");
//        String fullName = scan.nextLine();
//
//        System.out.println("Please enter your address: ");
//        String address = scan.nextLine();
//        System.out.println();
//
//        System.out.println("Full name: " + fullName);
//        System.out.println("Address: " + address);
//
//
//        scan.close();
    }
}