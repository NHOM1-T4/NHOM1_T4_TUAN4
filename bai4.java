import java.util.Scanner;
public class bai4 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap vao mot so ");
        int n=sc.nextInt();
        if(snt(n))
            System.out.println(n +" la snt ");
        else
            System.out.println(n +" k phai la snt");
    }
        public static boolean snt(int n)
        {
            if(n<2)
                return false;
            for(int i=2;i<=Math.sqrt(n);i++)
                if(n%i==0)
                    return false;
            return true;
        }
}
