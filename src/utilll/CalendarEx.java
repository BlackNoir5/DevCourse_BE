package utilll;

import java.util.Calendar;

public class CalendarEx {
    public static void main(String[] args){
        Calendar calendar = Calendar.getInstance();

        String[] yoil = {"일","월","화","수","목","금","토"};
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

        int day = 1;
        int yo = 0;

        calendar.set(2024,2-1,1);

        System.out.print(calendar.get(Calendar.YEAR)+".");
        System.out.print(calendar.get(Calendar.MONTH)+1+".");
        System.out.print(calendar.get(Calendar.DATE)+" ");
        System.out.println(yoil[calendar.get(Calendar.DAY_OF_WEEK)-1]);

        System.out.println("\t\t\t"+(1+calendar.get(Calendar.MONTH)));

        for(String s : yoil){
            System.out.print(s+"\t");
        }
        System.out.println("");

        while(day<=days[calendar.get(Calendar.MONTH)]){
            if(day==1&&calendar.get(Calendar.DAY_OF_WEEK)-1>yo){
                System.out.print(" \t");
                yo++;
                continue;
            }
            System.out.print(day++ +"\t");
            yo++;
            if(yo%7==0) {
                System.out.println("");
            }
        }

    }
}
