import java.sql.Array;
import java.util.Scanner;

public class daongcmang {
    public static void main(String[] args) {
        int a;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("kích thước của mảng: ");
            a = sc.nextInt();
            if (a > 20)
                System.out.println("quá kích thước mảng");
        }
        while (a > 20);
        array = new int[a];
        int i = 0;
        while (i < array.length) {
            System.out.print("thành phần " + (i + 1) + " : ");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.print("mảng ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[a - 1 - j];
            array[a - 1 - j] = temp;
        }
        System.out.print("mảng mới: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }


    }
}
