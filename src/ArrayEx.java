import java.util.Scanner;

public class ArrayEx {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        System.out.println(a[3]);

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
//        System.out.println(arr[4]);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = s.nextInt();
        int[] arr1 = new int[size];

        System.out.println("enter the array values");

        for(int i=0;i<arr1.length;i++){
            arr[i] = s.nextInt();
        }

        for(int i=0;i<arr1.length;i++){
            System.out.print(arr[i] + " ");
        }


    }
}
