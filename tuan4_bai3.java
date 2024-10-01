import java.util.Scanner;

public class tuan4_bai3 {
	public static long giaiThua(int n) {
		if(n == 1 || n == 0)
			return 1;
		else
			return n*giaiThua(n-1);
	}
	public static void main(String[] args) {
		int n;
		long kq;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap n: ");
		n = sc.nextInt();
		if(n <= 0)
		{
			do {
				System.out.println("n phai la so nguyen duong: ");
				n= sc.nextInt();
			}while(n <= 0);
		}
		kq  = giaiThua(n);
		System.out.println(n +"! = "+kq);
		}
}
