import java.util.Scanner;
public class QuadraticRoots
 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coefficients a, b, and c:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        double discriminant = (b * b) - (4 * a * c);

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots are real and distinct: " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            double root1 = (-b) / (2 * a);
            System.out.println("Roots are real and equal: " + root1);
        } else {
            double rp = -b / (2 * a);
            double ip = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Roots are complex: " + rp + " + " + ip + "i and " + rp + " - " + ip + "i");
        }
    }
}