package enums;

import java.util.EnumSet;

public class TestEnum {
    public enum Day{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday,Sunday;
    }

    public static void main(String[] args) {
        EnumSet<Day> weenkend = EnumSet.of(Day.Saturday,Day.Sunday);

        for(Day d : weenkend){
            System.out.println(d);
        }
    }
}
