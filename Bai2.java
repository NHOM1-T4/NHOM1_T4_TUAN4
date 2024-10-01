public class Bai2 {

    public static void main(String[] args) {

        // In bảng cửu chương từ 1 đến 10 bằng vòng lặp for
        for (int i = 1; i <= 10; i++) {
            System.out.println("Bảng cửu chương " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();  // Dòng trống để ngăn cách giữa các bảng
        }
    }
}