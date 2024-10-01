import java.util.Scanner;

public class bai6 {
	public static int n;
	public static int chuso;
	public static int daonguoc = 0;
	public static void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số n: ");
        n=scanner.nextInt();
    }
    public static int DaoNguocSo() {
        while (n != 0) {
            chuso = n % 10;
            daonguoc = daonguoc * 10 + chuso;
            n = n/ 10;
        }
        return daonguoc;
    }
    
    public static boolean KiemTraSoDoiXung() {
        return n == DaoNguocSo();
    }

    public static void Xuat() {
    	if (KiemTraSoDoiXung())
            System.out.println("Là số đối xứng.");
        else
            System.out.println("Không phải là số đối xứng.");
    }
    public static void main(String[] args) {
        Nhap();
        Xuat();
    }
}