package javapractice;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class DataStructure {

    @Test
    void name(){
        ArrayList<String> 과일목록 = new ArrayList<>();

        과일목록.add("사과");
        과일목록.add("바나나");
        과일목록.add("딸기");
    }

    @Test
    void largeCity(){
        ArrayList<String> 광역시목록 = new ArrayList<>();

        광역시목록.add("대전");
        광역시목록.add("일산");
        광역시목록.add("광주");
        광역시목록.add("울산");

        System.out.println(광역시목록.size());


        for (String 광역시 : 광역시목록){
            System.out.println("광역시 = " + 광역시);

        }

        광역시목록.set(2, "전라도 광주");
        System.out.println("수정된 광역시" + 광역시목록);


        광역시목록.remove(1);
        System.out.println("일산 제거" + 광역시목록);


        ArrayList<String> 광역시목록2 = new ArrayList<>();

        for(String 광역시 : 광역시목록){
            광역시목록2.add(광역시 + "광역시");
            System.out.println("광역시목록2" + 광역시목록2);
       }




        /*
        1. Constructor(생성자) 이용
        ArrayList<String> 광역시목록2 = new ArrayList<>(광역시목록);


        2. addAll() 메서드를 이용
        ArrayList<String> 광역시목록2 = new ArrayList<>();
        광역시목록2.addAll(광역시목록);


*/









    }





}
