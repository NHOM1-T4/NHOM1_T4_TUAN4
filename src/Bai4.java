
import java.util.Scanner;

public class Bai4 {

    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhận đầu vào từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên từ người dùng
        System.out.print("Nhập vào một số nguyên: ");
        int so = scanner.nextInt();

        // Kiểm tra số nguyên tố bằng vòng lặp for
        if (kiemTraSoNguyenTo(so)) {
            System.out.println(so + " là số nguyên tố.");
        } else {
            System.out.println(so + " không phải là số nguyên tố.");
        }

        // Đóng đối tượng Scanner
        scanner.close();
    }

    // Hàm kiểm tra số nguyên tố bằng vòng lặp for
    public static boolean kiemTraSoNguyenTo(int n) {
        // Nếu số nhỏ hơn hoặc bằng 1 thì không phải là số nguyên tố
        if (n <= 1) {
            return false;
        }

        // Sử dụng vòng lặp for để kiểm tra số nguyên tố
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Nếu tìm thấy ước số thì n không phải là số nguyên tố
            }
        }

        return true; // Nếu không tìm thấy ước số nào thì n là số nguyên tố
    }
}
