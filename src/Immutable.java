public class Immutable {
    public static void main(String[] args) {
        String str = "hello";
        String str1 = str.concat("world");
        System.out.println(str1);
        String s = "Hello";
        String s1 = " world";
        System.out.println(s.concat(s1));
        System.out.println(s1.length());
        char ch = s1.charAt(4);
        System.out.println(ch);

        //substring
        String string = "    Welcome to strings     ";
        System.out.println(string.substring(11,18));
        System.out.println(string.replace('s','W'));
        System.out.println(string.trim());
    }
}
