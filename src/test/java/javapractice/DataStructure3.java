package javapractice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class DataStructure3 {

    @Test
    void getSum() {
        assertThat(getSum(List.of(1, 2, 3, 4))).isEqualTo(10);
        assertThat(getSum(List.of(7))).isEqualTo(7);
        assertThat(getSum(List.of())).isEqualTo(0); // 빈 리스트가 주어질 경우 0을 return
    }


    Integer getSum(List<Integer> list) {
        int sum = 0;
        for (Integer number : list) {
            sum = sum + number;
        }
        return sum;
    }

    @Test
    void getAverage() {
        assertThat(getAverage(List.of(1, 2, 3, 4))).isEqualTo(2.5);
        assertThat(getAverage(List.of(7))).isEqualTo(7.0);
        assertThat(getAverage(List.of())).isEqualTo(0.0); // 빈 리스트가 주어질 경우 0 return
    }

    double getAverage(List<Integer> list) {
        // double로 바꾸는 법???
        if (list.size() == 0) {
            return 0;
        } else {
            return (double) getSum(list) / list.size();
        }//getSum(list), list.size() 둘 중 하나만 double로 바꿔줘도 무방
        //return 타입을 선언하는 곳에선 반드시 double
    }

    @Test
    void findMax() {
        assertThat(findMax(List.of(3, 10, 5, 4, 7))).isEqualTo(10);
        assertThat(findMax(List.of(7))).isEqualTo(7);
    }

    Integer findMax(List<Integer> list) {
        int max = Integer.MIN_VALUE;

        for (Integer number : list) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }


    @Test
    void findMin() {
        assertThat(findMin(List.of(3, 10, 5, 4, 7))).isEqualTo(3);
        assertThat(findMin(List.of(7))).isEqualTo(7);
    }

    Integer findMin(List<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (Integer number : list) {
            if (min > number) {
                min = number;
            }
        }
        return min;
    }

    @DisplayName("시험 점수에 따라 합격 여부를 올바르게 판단해야 한다")
    @Test
    void isPassTest() {
        assertThat(isPass(List.of(60, 60))).isTrue();
        assertThat(isPass(List.of(40, 80))).isTrue();
        assertThat(isPass(List.of(39, 100, 100))).isFalse();
        assertThat(isPass(List.of(100, 0, 100))).isFalse();
    }

    boolean isPass(List<Integer> list) {
        for (Integer score : list) {
            if (score < 40) {
                return false;
            } else if (getAverage(list) < 60) {
                return false;
            }
        }
        return true;
    }

    //두 정수 사이의 정수들
    @Test
    void getIntegersBetween(){
        assertThat(getIntegersBetween(1, 5)).isEqualTo(List.of(1, 2, 3, 4, 5));
        assertThat(getIntegersBetween(-3, 1)).isEqualTo(List.of(-3, -2, -1, 0, 1));
        assertThat(getIntegersBetween(3, 3)).isEqualTo(List.of(3));
        assertThat(getIntegersBetween(5, 1)).containsExactlyInAnyOrder(5, 4, 3, 2, 1);
    }

    List<Integer> getIntegersBetween(int a, int b){
        ArrayList<Integer> number = new ArrayList<>();
        if(a > b){
            for (int i = 0; i < a; i++) { // 수식
                a = a - i;  // 수식
                number.add(a);
            }
        return number;
        }

        if(a < b){
            for (int i = 0; i < b; i++) {
                b = b - i;
                number.add(b);
            }
        }return number;
    }

    @Test
    void filterPositive (){
        assertThat(filterPositive(List.of(-1, 2, -3, 4, 0))).isEqualTo(List.of(2, 4));
        assertThat(filterPositive(List.of(-1, -2, -3))).isEqualTo(List.of());
        assertThat(filterPositive(List.of())).isEqualTo(List.of());
    }

    List<Integer> filterPositive(List<Integer> list){
        List<Integer> filterPositive = new ArrayList<>();
        for(Integer number : list){
            if(number > 0){
                filterPositive.add(number);
            }
        }return filterPositive;
    }

    @Test
    void findPassedStudents(){
        assertThat(findPassedStudents(List.of(70, 85, 90, 75, 80))).isEqualTo(List.of(85, 90, 80));
        assertThat(findPassedStudents(List.of(70, 75, 79))).isEqualTo(List.of());
        assertThat(findPassedStudents(List.of(80, 85, 90))).isEqualTo(List.of(80, 85, 90));
    }

    List<Integer> findPassedStudents(List<Integer> list){
        ArrayList<Integer> findPassedStudents = new ArrayList<>();
        for(Integer score : list){
            if(score >= 80){
                findPassedStudents.add(score);
            }
        }return findPassedStudents;

    }

    @Test
    void removeDuplicates(){
        assertThat(removeDuplicates(List.of(1, 2, 2, 3, 4, 4, 5))).isEqualTo(List.of(1, 2, 3, 4, 5));
        assertThat(removeDuplicates(List.of(1, 1, 1, 1))).isEqualTo(List.of(1));
        assertThat(removeDuplicates(List.of())).isEqualTo(List.of());
    }

    List<Integer> removeDuplicates(List<Integer> list){
        ArrayList<Integer> removeDuplicates = new ArrayList<>();
        for(Integer number : list){
            if(list.contains(number)){list.remove(number);}
            else {removeDuplicates.add(number);}

        }return removeDuplicates;
    }
/*
    @Test
    void calculateRanks(){
//        assertThat(calculateRanks(List.of(80, 90, 70, 85))).isEqualTo(List.of(3, 1, 4, 2));
//        assertThat(calculateRanks(List.of(100, 100, 80))).isEqualTo(List.of(1, 1, 3));
//        assertThat(calculateRanks(List.of())).isEqualTo(List.of());
        assertThat(calculateRanks(List.of(80, 90, 70, 85))).isEqualTo(3); //등수
        assertThat(calculateRanks(List.of(100, 100, 80))).isEqualTo(1);
    }

    Integer calculateRanks(List<Integer> list) {
        ArrayList<Integer> calculateRanks = new ArrayList<>();
        int 기준점수 = list.get(0);
        for (Integer 비교점수 : list) {
       */



    @Test
    void calculateTotalPrice (){
        assertThat(calculateTotalPrice(List.of(1000, 2000, 3000))).isEqualTo(6000);
        assertThat(calculateTotalPrice(List.of(5000))).isEqualTo(5000);
        assertThat(calculateTotalPrice(List.of())).isEqualTo(0);
    }

    Integer calculateTotalPrice(List<Integer> list){
        int sum = 0;
        if(list.isEmpty()){
            return 0;
        }
        for(Integer price : list){
            sum = price + sum;
    }return sum;
    }

/*
    @Test
    void applyDiscount(){
        assertThat(applyDiscount(List.of(1000, 2000, 3000), 10)).isEqualTo(List.of(900, 1800, 2700));
        assertThat(applyDiscount(List.of(5000), 50)).isEqualTo(List.of(2500));
        assertThat(applyDiscount(List.of(), 20)).isEqualTo(List.of());

    }

    long applyDiscount(List<Integer> list){
        ArrayList<Integer> applyDiscount = new ArrayList<>();

       int rate = 0;
       int sum = 0;
       double result = 0;
        for(Integer number : list) {
            if (number < 100) {
                number = rate;
            } else{applyDiscount.add(number);
            }

        }result = sum * rate * 0.01;
        return Math.round(result);



*/

}