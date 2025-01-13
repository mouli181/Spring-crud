public class SimpleArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(arr[0]);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int[] a = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;
        System.out.println(a[4]);
        for(int b : a){
            System.out.print(b + " ");
        }


    }
}
