import java.util.Scanner;
public class EquationSolver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Chọn loại phương trình:");
        System.out.println("1. Phương trình bậc nhất một ẩn (ax + b = 0)");
        System.out.println("2. Hệ phương trình bậc nhất hai ẩn");
        System.out.println("3. Phương trình bậc hai (ax^2 + bx + c = 0)");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                solveLinearEquation(input);
                break;
            case 2:
                solveLinearSystem(input);
                break;
            case 3:
                solveQuadraticEquation(input);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
        }
    }
    // Giải phương trình bậc nhất ax + b = 0
    public static void solveLinearEquation(Scanner input) {
        System.out.println("Giải phương trình bậc nhất: ax + b = 0");
        System.out.print("Nhập hệ số a: ");
        double a = input.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = input.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiệm của phương trình là: x = " + x);
        }
    }
    // Giải hệ phương trình bậc nhất hai ẩn
    public static void solveLinearSystem(Scanner input) {
        System.out.println("Giải hệ phương trình bậc nhất hai ẩn:");
        System.out.println("a11*x1 + a12*x2 = b1");
        System.out.println("a21*x1 + a22*x2 = b2");
        System.out.print("Nhập a11: ");
        double a11 = input.nextDouble();
        System.out.print("Nhập a12: ");
        double a12 = input.nextDouble();
        System.out.print("Nhập b1: ");
        double b1 = input.nextDouble();
        System.out.print("Nhập a21: ");
        double a21 = input.nextDouble();
        System.out.print("Nhập a22: ");
        double a22 = input.nextDouble();
        System.out.print("Nhập b2: ");
        double b2 = input.nextDouble();
        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;
        if (D != 0) {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("Hệ có nghiệm duy nhất: x1 = " + x1 + ", x2 = " + x2);
        } else {
            if (D1 == 0 && D2 == 0) {
                System.out.println("Hệ có vô số nghiệm.");
            } else {
                System.out.println("Hệ vô nghiệm.");
            }
        }
    }
    // Giải phương trình bậc hai ax^2 + bx + c = 0
    public static void solveQuadraticEquation(Scanner input) {
        System.out.println("Giải phương trình bậc hai: ax^2 + bx + c = 0");
        System.out.print("Nhập hệ số a: ");
        double a = input.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = input.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = input.nextDouble();
        if (a == 0) {
            System.out.println("Đây không phải là phương trình bậc hai.");
        } else {
            double delta = b * b - 4 * a * c;
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có 2 nghiệm phân biệt: x1 = " + x1 + ", x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép: x = " + x);
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        }
    }
}
