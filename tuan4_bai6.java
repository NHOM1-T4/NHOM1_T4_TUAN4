import java.util.Scanner;

public class tuan4_bai6 {
public static void main(String[] args) {
	//Viết chương trình nhập vào một số nguyên và kiểm tra xem số đó có phải là số đối xứng hay không
	int n, soNguoc, tmp;
	soNguoc = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("nhap so n: ");
	n = sc.nextInt();
	int so = n;
	while(n!=0)
	{
		tmp = n%10;
		soNguoc = soNguoc*10+tmp;// viết ngược lại số lúc đầu;
		n = n/10;
	}
	if(soNguoc == so)
		System.out.println(so + " la so doi xung");
	else
		System.out.println(so + " khong phai la so doi xung");
		
}
}
