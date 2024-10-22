package scanner;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        String mag = sc.next();

        System.out.println("출력 : "+mag);
    }
}
