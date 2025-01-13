public class Strings {
    public static void main(String[] args) {
        String str = "mouli";
        System.out.println(str);
        String str1 = new String("mouli");
        System.out.println(str1);
        if(str == str1){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
    }
}
