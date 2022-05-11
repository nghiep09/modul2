import java.util.Scanner;

public class laixuat {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("số tiền gửi: ");
         double tiengui=sc.nextDouble();
        System.out.println("số tháng gửi: ");
        int sothang=sc.nextInt();
        System.out.println("lãi xuất");
        double laixuat=sc.nextDouble();
        double tongtienlai=0;
        for(int i=0;i<sothang;i++){
            tongtienlai+=tiengui*(laixuat/100)/12*sothang;
        }
        System.out.println("tổng tiền lãi là: "+tongtienlai);

    }
}
