import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите единицы измерения: ");
        System.out.println("1. Километры");
        System.out.println("2. Мили");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Введите расстояние в километрах: ");
            double kilometers = scanner.nextDouble();

            double miles = kilometersToMiles(kilometers);
            System.out.println("Расстояние в милях: " + miles);
        } else if (choice == 2) {
            System.out.print("Введите расстояние в милях: ");
            double miles = scanner.nextDouble();

            double kilometers = milesToKilometers(miles);
            System.out.println("Расстояние в километрах: " + kilometers);
        } else {
            System.out.println("Недопустимый выбор.");
        }

        scanner.close();
    }

    public static double kilometersToMiles(double kilometers) {
        return kilometers * 0.621371;
    }

    public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }
}