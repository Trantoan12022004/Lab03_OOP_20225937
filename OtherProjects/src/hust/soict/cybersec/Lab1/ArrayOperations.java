import java.util.Arrays;
import java.util.Scanner;
public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Yêu cầu người dùng nhập kích thước của mảng
        System.out.print("Nhập kích thước của mảng: ");
        int size = scanner.nextInt();
        // Khởi tạo mảng với kích thước người dùng nhập
        int[] array = new int[size];
        // Nhập các phần tử của mảng
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < size; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        // Sắp xếp mảng
        Arrays.sort(array);
        // Hiển thị mảng đã sắp xếp
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(array));
        // Tính tổng của các phần tử trong mảng
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }
        // Tính giá trị trung bình
        double average = (double) sum / size;
        // Hiển thị kết quả
        System.out.println("Tổng của các phần tử trong mảng: " + sum);
        System.out.println("Giá trị trung bình của các phần tử trong mảng: " + average);
        scanner.close();
    }
}