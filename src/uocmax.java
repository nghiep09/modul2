import java.util.Scanner;

public class uocmax {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập số a: ");
        a=sc.nextInt();
        System.out.println("nhập số b: ");
        b=sc.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);
        if(a==0||b==0){
            System.out.println("không là ước");
            while (a!=b){
                if(a>b)
                    a=a-b;
                else
                    b=b-a;
            }
            System.out.println("là ước lớn nhất: "+ a);
        }
    }
}
