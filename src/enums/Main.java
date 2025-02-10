package enums;

public class Main {
    public static void main(String[] args) {
        Day d = Day.SUNDAY;

        System.out.println(d);

        for(Day day:Day.values()){
            System.out.print(day+" ");
        }
    }
}
