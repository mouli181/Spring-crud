import java.util.Scanner;

public class TwoDimentional {
    public static void main(String[] args) {
//        int[][] arr = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}};
//        System.out.println(arr[0][2]);
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr.length;j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        Scanner s = new Scanner(System.in);
        int[][] arr = new int[2][2];

        System.out.println("enter the array values");
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j] = s.nextInt();
            }
        }
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
