import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    double money = scanner.nextDouble();

    public static void main(String[] args) {
        System.out.println("Select your item");
    }

    private static double menu() {
        double price = 0;
        System.out.println("A     100 руб     Чипсы с крабом");
        System.out.println("B     45 руб     Сухарики с сыром");
        System.out.println("C     90  руб     Вода");
        System.out.println("D     80  руб     Шоколад c орехами");
        System.out.println("Что вы хотите купить?");
        String choice = scanner.next().toUpperCase();
        if (choice.equals("A")) {
            price = 100;
            return 100;
        }
        if (choice.equals("B")) {
            price = 45;
            return 45;
        }
        if (choice.equals("C")) {
            price = 90;
            return 90;
        }
        if (choice.equals("D")) {
            price = 80;
            return 80;
        }

        return price;
    }
    double itemCost = menu();
    public void dispence(double money, double itemCost){
        if(money>itemCost){

        }

    }
}
