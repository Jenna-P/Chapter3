import java.util.Scanner;

public class QuadricEquations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = Math.pow(b,2) - (4 * a * c) ;
        double r1 = (-b + Math.sqrt(Math.pow(b,2) - 4 * a * c)) / 2 * a;
        double r2 = (-b - Math.sqrt(Math.pow(b,2) - 4 * a * c)) / 2 * a;


        if (discriminant > 0) {
            System.out.println("The equation has twq roots : " + r1 + " and " + r2);

        }
        if (discriminant == 0) {
            System.out.println("The equation has one root : " + r1);

        }
        if (discriminant < 0){
            System.out.println("The equation has no real roots");
        }
    }
}
