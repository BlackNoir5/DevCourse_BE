package stringToken;

import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String[] args){
        String strData = "사과 참외 수박 딸기";
        String strData2 = "사과&참외&&수박&&&딸기";
        StringTokenizer st = new StringTokenizer(strData);
        StringTokenizer st2 = new StringTokenizer(strData2,"&");

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

        //요소를 모두 제거한다.
        while(st2.hasMoreTokens()){
            System.out.println(st2.nextToken());
        }

        //만날때마다 자른다.
        String[] strArr = strData2.split("&");
        for(String s : strArr){
            System.out.println(s);
        }
    }
}
