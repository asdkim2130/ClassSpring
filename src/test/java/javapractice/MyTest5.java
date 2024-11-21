package javapractice;


import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MyTest5 {


    @Test
    void isValidEmail() {
        assertThat(isValidEmail("doraemon@gmail.com")).isTrue(); // @가 있음. true
        assertThat(isValidEmail("doraemon")).isFalse();          // @가 없음. false
    }

    boolean isValidEmail(String email) {
        return email.contains("@");  //contains 함수 자체가 ture/false의 값을 낸다.
    }

    @Test
    void isFemale() {
        assertThat(isFemale("1234567")).isFalse(); // 1로 시작. 여성이 아님. false
        assertThat(isFemale("2345678")).isTrue();  // 2로 시작. 여성임. true
        assertThat(isFemale("3456789")).isFalse(); // 3으로 시작. 여성이 아님. false
        assertThat(isFemale("4567890")).isTrue();  // 4로 시작. 여성임. true
    }

    boolean isFemale(String idNumber) {
        return idNumber.startsWith("2") || idNumber.startsWith(("4"));
    }

    @Test
    void isValidIdNumber() {
        assertThat(Character.isDigit('7')).isTrue();  // 숫자이면 true
        assertThat(Character.isDigit('x')).isFalse(); // 숫자가 아니면 false

    }

    boolean isValidIdNumber(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
            if(!Character.isDigit(s.charAt(i)));
            {return false;
            }
        }return true;
    }



    @Test
    void isValidPhoneNumber() {
        assertThat(isValidPhoneNumber("01012345678")).isTrue();
        assertThat(isValidPhoneNumber("010123456789")).isFalse();
        assertThat(isValidPhoneNumber("00012345678")).isFalse();
        assertThat(isValidPhoneNumber("010xxxx5678")).isFalse();
    }

    boolean isValidPhoneNumber(String idNumber) {
        if (idNumber.length() != 11) {
            return false;
        }
        if (!idNumber.startsWith("010")) {
            return false;
        }
        for (int i = 0; i < idNumber.length(); i++) {
            System.out.println(idNumber.charAt(i));  //없어도 됨
            if (!Character.isDigit((idNumber.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    @Test
    void specialChars() {
        String specialChars = "!@#$%^&*()";
        assertThat(specialChars.contains("@")).isTrue();
        assertThat(specialChars.contains("$")).isTrue();
        assertThat(specialChars.contains("A")).isFalse();
        assertThat(specialChars.contains("X")).isFalse();
    }





    boolean isValidPassword(String s) {
        String specialChars = "!@#$%^&*()";
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(8));
            if (s.length() >= 8) {
                return true;
            }
            if (Character.isDigit(s.charAt(i))) {

            } else if (Character.isUpperCase(s.charAt(i))) {

            } else if (Character.isLowerCase(s.charAt(i))) {

            } else if (specialChars.contains(String.valueOf(s.charAt(i)))) {

            }
        }return false;
    }



    @Test
    void toCamelCase (){
        assertThat(toCamelCase("snake_case")).isEqualTo("snakeCase");
        assertThat(toCamelCase("product_name")).isEqualTo("productName");
        assertThat(toCamelCase("created_at")).isEqualTo("createdAt");
    }

    String toCamelCase(String snake){
        int indexOfUnderScore = snake.indexOf("_");
        String firstPart = snake.substring(0, indexOfUnderScore);
        String secondPart = snake.substring(indexOfUnderScore + 1);
        String firstLetterOfSecondPart = secondPart.substring(0, 1).toUpperCase();
        String restOfSecondPart = secondPart.substring(1);
        return firstPart.concat(firstLetterOfSecondPart).concat(restOfSecondPart);
        // or return firstPart + firstLetterOfSecondPart + restOfSecondPart;

    }





    @Test
    void extractDomain (){
        assertThat(extractDomain("https://git-scm.com/book/en/v2")).isEqualTo("git-scm.com");
        assertThat(extractDomain("https://www.google.com/search?q=java")).isEqualTo("www.google.com");
        assertThat(extractDomain("https://www.op.gg/modes/aram/teemo/build?region=global&tier=all")).isEqualTo("www.op.gg");
    }

    String extractDomain(String url){
       return url.substring(8, url.indexOf("/", 8));

    }

    String s = "abcd"; //String도 Objcet지만 워낙 많이 쓰기 때문에 new를 생략
    String s2 = new String("abcd");
    // new, random 등 상단에 import가 필요한 object는 새롭게 정의할 때 new가 필요하다

}











