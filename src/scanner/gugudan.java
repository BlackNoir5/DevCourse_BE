package scanner;

import java.util.Scanner;

public class gugudan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("단수를 입력해주세요 : ");
        int dan = Integer.parseInt(sc.next());

        for(int i=1; i<=9;i++){
            System.out.println(dan+"\tX\t"+i+"\t=  "+dan*i);
        }

    }
}
