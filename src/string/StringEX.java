package string;

public class StringEX {
    public static void main(String[] args){
        String str1 = "Hello world";

        String str2 = new String("Hello World");

        char[] charArray={'H','e','l','l','o'};

        String str3 = new String(charArray) + " World";

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        System.out.println(str2.charAt(str2.length()-1));

        String pstr = str1.substring(2,str2.length());
        System.out.println(pstr);

        System.out.println(str1.indexOf('H'));
        System.out.println( str1.indexOf('h'));
        System.out.println(str1.indexOf('o',5));

        //.startsWith(), .contains(), .endWith() -> boolean
        //문자열 치환 -> .replace()
        //문자열 연결 -> .concat()
        //대소문자 변환 -> .toUpperCase(), .toLowerCase()
        //공백 제거 -> .trim()
        //단어 구분하기 .split(), .split(",", 2(2개))

        //static
        //문자열 배열을 묶어는 메소드 -> **String**.join(",",arr)
        //String.format("%s,%s,%s",arr,arr,arr)

        String p = "hong gil dong";
        String temp ="";
        String[] arr = p.split(" ");

        for(String s : arr){
            String st = s.substring(0,1).toUpperCase()+s.substring(1);
            temp += st+ " ";
        }

        System.out.println(temp);

    }
}
