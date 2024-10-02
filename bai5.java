import java.util.Scanner;
public class bai5 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap vao so thu nhat ");
        int a =sc.nextInt();
        System.out.print("nhap vao so thu hai ");
        int b = sc.nextInt();

        int ucln = tim_ucln(a,b);
        int bcnn = tim_bcnn(a,b,ucln);

        System.out.println("UCLN cua "+ a +" va "+ b +" la: "+ucln);
        System.out.println("BCNN cua "+ a +" va "+ b +" la: "+bcnn);
    }
    public static int tim_ucln(int a,int b)
    {
        while(a!=b)
            if(a>b)
			    a=a-b;                   
		    else
			    b=b-a;
	    return a;
    }
    public static int tim_bcnn(int a,int b,int ucln)
    {
        return (a*b)/ucln;
    }
}
