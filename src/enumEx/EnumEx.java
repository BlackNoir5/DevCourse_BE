package enumEx;

public class EnumEx {
    public static void main(String[] args) {
        Week mon = Week.MONDAY;

        // 열거형의 이름
        System.out.println(mon);
        System.out.println(Week.MONDAY); // 객체

        // 메서드
        String name = mon.name();
        System.out.println(name);        // 문자열

        // 순서 (index)
        int weekNum = mon.ordinal();
        System.out.println(weekNum);

        Week fri = Week.FRIDAY;
        weekNum = fri.ordinal();
        System.out.println(weekNum);

        // compareTo
        Week day1 = Week.MONDAY;
        Week day2 = Week.FRIDAY;

        int result1 = day1.compareTo(day2);
        int result2 = day2.compareTo(day1);

        System.out.println( result1 );
        System.out.println( result2 );

        // valueOf
        Week day = Week.valueOf("SUNDAY");
        System.out.println(day);

        // values
        Week[] days = Week.values();
        for(Week week : days){
            System.out.println(week);
        }

        //getSeason = 맵핑 데이터
        Season season = Season.SPRING;
        System.out.println(season.name());
        System.out.println(season.getSeason());
    }
}
