import java.util.Scanner;

public class bai1 {
	public static int S = 0;
	public static int n;
    public static void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số n: ");
        n=scanner.nextInt();
    }

    public static int TinhTong() {
        for (int i = 1; i <= n; i++)
            S = S+ i;
        return S;
    }

    public static void Xuat() {
        System.out.println("Tổng các số từ 1 đến " + n + " là: " + TinhTong());
    }

    public static void main(String[] args) {
        Nhap();
        Xuat();
    }
}