import java.util.Scanner;

public class DaysInMonth {

    // Hàm kiểm tra năm nhuận
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Hàm trả về số ngày của một tháng
    public static int getDaysInMonth(String month, int year) {
        // Chuyển đổi tháng nhập vào về dạng chuẩn (số nguyên)
        int monthNumber = -1;
        switch (month.toLowerCase()) {
            case "january": case "jan.": case "jan": case "1": monthNumber = 1; break;
            case "february": case "feb.": case "feb": case "2": monthNumber = 2; break;
            case "march": case "mar.": case "mar": case "3": monthNumber = 3; break;
            case "april": case "apr.": case "apr": case "4": monthNumber = 4; break;
            case "may": case "5": monthNumber = 5; break;
            case "june": case "jun.": case "jun": case "6": monthNumber = 6; break;
            case "july": case "jul.": case "jul": case "7": monthNumber = 7; break;
            case "august": case "aug.": case "aug": case "8": monthNumber = 8; break;
            case "september": case "sep.": case "sep": case "9": monthNumber = 9; break;
            case "october": case "oct.": case "oct": case "10": monthNumber = 10; break;
            case "november": case "nov.": case "nov": case "11": monthNumber = 11; break;
            case "december": case "dec.": case "dec": case "12": monthNumber = 12; break;
            default:
                monthNumber = -1; // Tháng không hợp lệ
        }

        // Kiểm tra số ngày của từng tháng
        if (monthNumber == 1 || monthNumber == 3 || monthNumber == 5 || monthNumber == 7 ||
                monthNumber == 8 || monthNumber == 10 || monthNumber == 12) {
            return 31;
        } else if (monthNumber == 4 || monthNumber == 6 || monthNumber == 9 || monthNumber == 11) {
            return 30;
        } else if (monthNumber == 2) {
            if (isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        } else {
            return -1; // Tháng không hợp lệ
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month;
        int year;

        while (true) {
            // Yêu cầu người dùng nhập tháng
            System.out.print("Nhập tháng (tên đầy đủ, viết tắt, hoặc số): ");
            month = scanner.nextLine();

            // Yêu cầu người dùng nhập năm
            System.out.print("Nhập năm (số nguyên dương): ");
            year = scanner.nextInt();
            scanner.nextLine();  // Đọc bỏ dòng thừa

            // Kiểm tra tính hợp lệ của năm
            if (year < 0) {
                System.out.println("Năm không hợp lệ, vui lòng nhập lại.");
                continue;
            }

            // Lấy số ngày của tháng
            int days = getDaysInMonth(month, year);

            // Kiểm tra tháng hợp lệ
            if (days == -1) {
                System.out.println("Tháng không hợp lệ, vui lòng nhập lại.");
            } else {
                System.out.println("Số ngày trong tháng " + month + " năm " + year + " là: " + days + " ngày.");
                break; // Thoát khỏi vòng lặp khi nhập đúng
            }
        }

        scanner.close();
    }
}