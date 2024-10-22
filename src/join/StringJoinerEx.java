package join;

import java.util.StringJoiner;

public class StringJoinerEx {
    public static void main(String[] args){
        String str1 = "사과"+",수박"+",딸기"+",참외";
        String str2 = "사과".concat(",수박").concat(",딸기").concat(",참외");
        String str3 = String.format("%s%s%s%s","사과","수박","딸기","침외");

        String[] arr = {"사과","수박","딸기","참외"};
        String str4 = String.join(",",arr);

        StringJoiner joiner = new StringJoiner(",");
        joiner.add("사과");
        joiner.add("수박");
        joiner.add("딸기");
        joiner.add("참외");

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(joiner);
    }
}
