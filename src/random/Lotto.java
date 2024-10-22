package random;

import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        System.out.println("로또번호 생성기");
        Random rand = new Random();

        int cnt = 1;

        while(cnt<=5){
            System.out.print(cnt+"회차 : ");
            int[] lotto = new int[6];

            for(int i=0; i<6;i++){
                lotto[i] = rand.nextInt(45)+1;
                for(int j=0;j<i;j++){
                    if(lotto[i] == lotto[j]){
                        i--;
                        continue;
                    }
                }
            }
            for(int i=0;i<6;i++){
                System.out.print(lotto[i]+"\t");
            }
            System.out.println("");
            cnt++;
        }

    }
}
