package day25oop_abstraction;

public class Runner {

    public static void main(String[] args) {

        Civic car1 = new Civic();
        car1.music();
        car1.engine();


        Accord car2 = new Accord();
        car2.music();
        car2.engine();

    }

}
