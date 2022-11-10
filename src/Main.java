import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write radius:");
        double radius = scanner.nextDouble();
        System.out.println("area:  --> " + Circle.area(radius));
        System.out.print("circumference:  --> " + Circle.circumference(radius));
    }
}