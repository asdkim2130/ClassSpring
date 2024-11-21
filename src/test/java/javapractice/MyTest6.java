package javapractice;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MyTest6 {

    @Test
    void calculateArea(){
        System.out.println(calculateArea(10));
        System.out.println(calculateArea(10, 10));
        System.out.println(calculateArea(10, true));

        assertThat(calculateArea(10)).isEqualTo(100);
        assertThat(calculateArea(10, 10)).isEqualTo(100);
        assertThat(calculateArea(10, true)).isEqualTo(314.1592653589793);
    }


    double calculateArea(double side) {
        // TODO: 정사각형 면적 계산 로직을 구현하세요.
        return side * side;

    }


    double calculateArea(double length, double width) {
        // TODO: 직사각형 면적 계산 로직을 구현하세요.

        return length * width;


    }

    double calculateArea(double radius, boolean isCircle) {
        // TODO: 원의 면적 계산 로직을 구현하세요. isCircle 매개변수는 오버로딩을 위해 사용됩니다.
        return  Math.PI * radius * radius;
    }



}