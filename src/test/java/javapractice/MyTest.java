package javapractice;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MyTest {

    @Test
    void max함수_테스트() {
        assertThat(square(4)).isEqualTo(16);
        assertThat(square(-4)).isEqualTo(16);

        assertThat(add(3, 4)).isEqualTo(7);
        assertThat(add(10, -5)).isEqualTo(5);

        assertThat(getAverage(100, 100, 70)).isEqualTo(90);
        assertThat(getAverage(0, 100, 50)).isEqualTo(50);

        assertThat(calculateBirthYear(1)).isEqualTo(2024);
        assertThat(calculateBirthYear(2)).isEqualTo(2023);
        assertThat(calculateBirthYear(20)).isEqualTo(2005);

        assertThat(isPositive(3)).isEqualTo(true);
        assertThat(isPositive(9)).isTrue();
        assertThat(isPositive(0)).isFalse();
        assertThat(isPositive(-5)).isFalse();

        assertThat(isNegative(3)).isEqualTo(false);
        assertThat(isNegative(9)).isFalse();
        assertThat(isNegative(0)).isFalse();
        assertThat(isNegative(-5)).isTrue();

        assertThat(getBigger(3, 7)).isEqualTo(7);
        assertThat(getBigger(7, 3)).isEqualTo(7);
        assertThat(getBigger(-9, -1)).isEqualTo(-1);

        assertThat(getBiggest(1, 2, 3)).isEqualTo(3);
        assertThat(getBiggest(3, 2, 1)).isEqualTo(3);
        assertThat(getBiggest(-3, -2, -1)).isEqualTo(-1);
        assertThat(getBiggest(-1, -2, -3)).isEqualTo(-1);


        assertThat(abs(3)).isEqualTo(3);
        assertThat(abs(-3)).isEqualTo(3);
        assertThat(abs(0)).isEqualTo(0);


    }

    int square(int n) {
        return n * n;

    }

    int add(int a, int b) {
        return a + b;
    }

    int getAverage(int a, int b, int c) {
        return (a + b + c) / 3;

    }


    int calculateBirthYear(int age) {
        return  (2024 - age + 1);
    }

    boolean isPositive(int a) {
        return (a >0);
    }

    boolean isNegative(int a) {
        return (a < 0);
    }

    int getBigger(int a, int b) {
        int result = a;
        if (a > b) {
            result = a;
        } else {
            result = b;
        }
        return result;
    }

    int getBiggest(int a, int b, int c){
        //int bigger = getBigger(a, b);
        //return getBigger(bigger, c);
        return getBigger(getBigger(a, b), c);
    }






    int abs(int a) {

        if (a < 0) {
            return -a;
        }
        return a;
    }
}





























