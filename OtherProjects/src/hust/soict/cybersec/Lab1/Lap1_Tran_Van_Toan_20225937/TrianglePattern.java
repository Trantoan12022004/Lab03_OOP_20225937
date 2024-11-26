import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chiều cao tam giác từ người dùng
        System.out.print("Nhập chiều cao của tam giác (n): ");
        int n = scanner.nextInt();

        // Vòng lặp để in tam giác
        for (int i = 1; i <= n; i++) {
            // In khoảng trắng để căn giữa tam giác
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // In sao, 2*i - 1 sao cho mỗi dòng
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            // Xuống dòng sau khi in xong một hàng
            System.out.println();
        }

        scanner.close();
    }
}