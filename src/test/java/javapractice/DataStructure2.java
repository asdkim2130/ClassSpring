package javapractice;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;



public class DataStructure2 {

    @Test
    void name() {
        ArrayList<Integer> ctrlAltV = new ArrayList<>();//int 대신 object인 Integer를 넣는다(단순 정수가 아니라 기능을 추가 해 놓은 정수)
        //new ArrayList<>() 상태에서 ctrl + Alt + v 단축키 -> 앞에 리스트 완성, 이름만 넣기

          /*  ctrlAltV.add(김씨);

            ctrlAltV.get(0);

            ctrlAltV.set(0, '박씨');

            ctrlAltV.remove(0);
*/
    }

    @Test
    void name2() {
        int sum = 0;
        int average = 0;

        ArrayList<Integer> score = new ArrayList<>();
        score.add(80);
        score.add(60);
        score.add(70);
        score.add(100);
        score.add(90);

        for (Integer s : score) {
            sum = sum + s;
        }
        System.out.println("총점" + sum);

        for (Integer s : score) {
            average = sum / score.size();

        }
        System.out.println("평균" + average);


        int max = 0;
        for (Integer s : score) {
            if (max < s) {
                max = s;
            }
        }System.out.println("Max" + max);

        int min = 100;
        for (Integer s : score){
            if(min > s){
                min = s;
            }
        }
        System.out.println("Min" + min);


    }




}



