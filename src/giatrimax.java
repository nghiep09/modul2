import java.util.Scanner;

public class giatrimax {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("nhập size của mảng: ");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("quá giới hạn của mảng");


        } while (size > 20);
        array=new int[size];
        int i=0;
        while (i<array.length){
            System.out.println("nhập số "+(i+1)+" :");
            array[i]=sc.nextInt();
            i++;
        }
        System.out.println("mảng: ");
        for(int j=0;j<array.length;j++){
            System.out.println(array[j]+"\t");
        }
        int max =array[0];
        int index = 1;
        for (int j=0;j<array.length;j++){
            if(array[j]>max){
                max=array[j];
                index=j;
            }
        }
        System.out.println("giá trị lớn nhất: "+max+"vị trí: "+index);
    }
}
