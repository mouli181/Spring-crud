package Exception;

public class ArrayException {
    public static void main(String[] args) {
        try {
            int[] a = {1, 2, 3, 4, 5};
            System.out.println(a[6]);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("the program completed");
        }

    }

}
