package utilll;

import java.util.Date;

public class UtilEx {
    public static void main(String[] args){
        //Date 객체생성
        java.util.Date date1 = new java.util.Date();
        Date date2 = new Date();

        // toString() 오버라이딩
        System.out.println(date1);
        System.out.println(date2.toString());
        System.out.println(date2.toLocaleString());

        String strDate = date2.toString();
        System.out.println(strDate);

        int len = strDate.length();
        System.out.print(strDate.substring(len-4,len)+" ");
        System.out.print(strDate.substring(4,7)+" ");
        System.out.println(strDate.substring(8,10)+" ");

        System.out.println(date2.getYear()+1900);
        System.out.println(date2.getMonth()+1);
        //일
        System.out.println(date2.getDate());
        //요일(0:일요일)
        System.out.println(date1.getDay());
        //밀리세컨드 단위 환산된 시간
        System.out.println(date2.getTime());
        System.out.println(System.currentTimeMillis());

        //date = 0 은 전달 마지막 날
        Date date3 = new Date(2024-1900,10-1,22);
        System.out.println(date3.toLocaleString());
    }
}
