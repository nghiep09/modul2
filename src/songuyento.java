import java.util.Scanner;

public class songuyento {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("nhập vào số: ");
        int P=sc.nextInt();
        if(P<2){
            System.out.println("không phải số nguyên tố");
        }
        else {
            int i=2;
            boolean check=true;
            while (i<=Math.sqrt(P)){
                if(P%i==0){
                    check=false;
                    break;
                }
                i++;
            }
            if(check){
                System.out.println(P+" là số nguyên tố");
            }
            else {
                System.out.println(P+" không là số nguyên tố");
            }
        }

    }
}
