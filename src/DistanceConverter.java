import java.util.InputMismatchException;
import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите единицы измерения: ");
        System.out.println("1. Километры");
        System.out.println("2. Мили");

        int choice = 0;
        boolean validChoice = false;

        while (!validChoice) {
            try {
                choice = scanner.nextInt();
                validChoice = true;
            } catch (InputMismatchException e) {
                System.out.println("Некорректный выбор. Попробуйте снова.");
                scanner.nextLine(); // Очищаем буфер после некорректного ввода
            }
        }

        double result;
        String unit;

        if (choice == 1) {
            System.out.print("Введите расстояние в километрах: ");
            double kilometers = getValidDoubleInput(scanner);
            result = kilometersToMiles(kilometers);
            unit = "милях";
        } else if (choice == 2) {
            System.out.print("Введите расстояние в милях: ");
            double miles = getValidDoubleInput(scanner);
            result = milesToKilometers(miles);
            unit = "километрах";
        } else {
            System.out.println("Недопустимый выбор.");
            scanner.close();
            return;
        }

        System.out.println("Расстояние в " + unit + ": " + result);
        scanner.close();
    }

    public static double kilometersToMiles(double kilometers) {
        return kilometers * 0.621371;
    }

    public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }

    public static double getValidDoubleInput(Scanner scanner) {
        double input = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                input = scanner.nextDouble();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Некорректный ввод. Попробуйте снова.");
                scanner.nextLine(); // Очищаем буфер после некорректного ввода
            }
        }

        return input;
    }
}
