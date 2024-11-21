package javapractice;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MyTest4 {
    @Test
    void myTest() {
        assertThat(isValidEmail("doraemon@gmail.com")).isTrue();
        assertThat(isValidEmail("doraemon")).isFalse();
    }

    //### 유효한 이메일인지 판별
    //사용자가 입력한 이메일이 주어질 때,
    //이메일 형식(`@` 포함)이면 `true`를, 아니면 `false`를 return하는 함수
    boolean isValidEmail(String s) {
        return s.contains("@");
    }


    @Test
    void ifFemale() {
        assertThat(isFemale("1234567")).isFalse();
        assertThat(isFemale("2345678")).isTrue();
        assertThat(isFemale("3456789")).isFalse();
        assertThat(isFemale("4567890")).isTrue();
    }

    //### 주민등록번호로 성별 판별

    //주민등록번호 뒷자리가 주어질 때,
    //여성("2" 또는 "4"로 시작)이면 `true`를, 남성("1" 또는 "3"으로 시작)이면 `false`를 return하는 함수
    Boolean isFemale(String s) {
        return s.startsWith("2") || s.startsWith("4");
    }

    @Test
    void isDigitTest() {
        assertThat(Character.isDigit('7')).isTrue();
        assertThat(Character.isDigit('x')).isFalse();

        // assertThat(isValidIdNumber("1234567")).isTrue();
        //assertThat(isValidIdNumber("1abcd67")).isFalse();

    }

    //### 유효한 주민등록번호 판별
    //주민등록번호 뒷자리가 주어질 때,
    //전부 숫자이면 `true`를, 아니면 `false`를 return하는 함수

    boolean isDigitTest(String s) {
        for (int i = 0; i < 7; i++) {
            System.out.println(s.charAt(i));
            if (s.equals(s.charAt(i))) ;

        }
        return true;
    }


    @Test
    void toCameCase() {
        assertThat(toCameCase("snake_case")).isEqualTo("snakeCase");
        assertThat(toCameCase("product_name")).isEqualTo("productName");
        assertThat(toCameCase("created_at")).isEqualTo("createdAt");
    }

    //### [Snake case] → [Camel case]

    //- 문자를 대문자로 바꾸는 방법: `Character.toUpperCase()`
    //- `char` → `String` 변환 방법: `String.valueOf()`


    String toCameCase(String s) {
        return s.substring(s.indexOf("_"));

    }

    @Test
    void isValidPhoneNumber() {
        assertThat(isValidPhoneNumber("01012345678")).isTrue();
        assertThat(isValidPhoneNumber("010123456789")).isFalse();
        assertThat(isValidPhoneNumber("00012345678")).isFalse();
        assertThat(isValidPhoneNumber("010xxxx5678")).isFalse();
    }


    //### 유효한 휴대폰 번호인지 판별
    //사용자가 ‘-’ 없이 입력한 휴대폰 번호가 주어질 때,
    //유효한 휴대폰 번호이면 `true`를, 아니면 `false`를 return하는 함수
    //유효한 휴대폰 번호
    //- 길이가 11
    //- "010"으로 시작
    //- 구성 문자들이 전부 숫자

    boolean isValidPhoneNumber(String s) {
        if (s.length() != 11) {
            return false;
        }

        if (!s.startsWith("010")) {
            return false;
        }

        for (int i = 0; i < 11; i++) {
            System.out.println(s.charAt(i));
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;


    }
}


