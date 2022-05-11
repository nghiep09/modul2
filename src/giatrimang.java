import java.util.Scanner;

public class giatrimang {
    public static void main(String[] args) {
        String[] tenmang={"huy","hoi","hung","tao","toan"};
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập tên hs: ");
        String nhap_ten=sc.nextLine();
        boolean xet=false;
        for (int i=0;i<tenmang.length;i++){
            if(tenmang[i].equals(nhap_ten)){
                System.out.println("tên sinh viên trong danh sách: "+nhap_ten+" ở vị trí "+i);
                xet = true;
                break;
            }

        }
        if(!xet){
            System.out.println(nhap_ten+" không có trong danh sách");
        }
    }
}