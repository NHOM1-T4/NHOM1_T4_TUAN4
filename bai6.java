import java.util.Scanner;

public class bai6 {
	public static int n;
	public static int N;
	public static void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số n: ");
        n=scanner.nextInt();
    }
    public static int DaoNguocSo() {
    	int daonguoc = 0;
    	N=n;
        while (N != 0) {
            int chuso = N % 10;
            daonguoc = daonguoc * 10 + chuso;
            N = N/ 10;
        }
        return daonguoc;
    }
    public static boolean KiemTraSoDoiXung() {
        return n == DaoNguocSo();
    }
    public static void Xuat() {
    	if (KiemTraSoDoiXung())
            System.out.println(n+" là số đối xứng.");
        else
            System.out.println(n+" không phải là số đối xứng.");
    }
    public static void main(String[] args) {
        Nhap();
        Xuat();
    }
}