package javapractice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;

import static org.assertj.core.api.Assertions.assertThat;

public class MyTest2 {


    @Test
    void typeTest() {
        String s = "Hello";
        assertThat(s.length()).isEqualTo(5);
        System.out.println(s.length());
        //assertThat("".isEmpty()).isEqualTo();

    }

    @Test
    void empty() {
        String s = "Hello";
        assertThat(s.isEmpty()).isEqualTo(false);
    }

    @Test
    void equals() {
        String s = "Hello";
        assertThat(s.equals("Hello")).isEqualTo(true);
    }

    @Test
    void charAt() {
        String s = "Hello";
        assertThat(s.charAt(0)).isEqualTo('H');

    }

    @Test
    void toLowerCase() {
        String s = "Hello";
        assertThat(s.toLowerCase()).isEqualTo("hello");

    }

    @Test
    void toUpperCase() {
        String s = "Hello";
        assertThat(s.toUpperCase()).isEqualTo("HELLO");
    }

    @Test
    void contains() {
        String s = "Hello";
        assertThat(s.contains("H")).isEqualTo(true);
    }

    @Test
    void startsWith() {
        String s = "Hello";
        assertThat(s.startsWith("H")).isEqualTo(true);
    }

    @Test
    void endWith() {
        String s = "Hello";
        assertThat(s.endsWith("o")).isEqualTo(true);
    }


    @Test
    void repeat() {
        String s = "Hello";
        assertThat(s.repeat(2)).isEqualTo("HelloHello");
      }



    @Test
    void concat(){
        String s = "Hello";
        assertThat(s.concat("Hello")).isEqualTo("HelloHello");
    }

    @Test
    void substring(){  //String 타입 자체가 가지고 있는 함수. 데이터가 없어도 됨(타입에 보관된 걸 가져와 씀)
        String s = "HelloWorld";
        assertThat(s.substring(5)).isEqualTo("World");
    }

    @Test
    void replace(){
        String s = "Hello";
        assertThat(s.replace("Hello", "hola" )).isEqualTo("hola");
    }

    @Test
    void trim(){
        String s = "  Hello";
        assertThat(s.trim()).isEqualTo("Hello");

    }

    @Test
    void formatted(){
        String formatted = String.format("안녕하세요. %d년생 %s입니다.", 71, "마동석");
        assertThat(formatted).isEqualTo("안녕하세요. 71년생 마동석입니다.");
        // String.formatted(){}
        // 함수형태에 변수s.formatted가 아니라 String.formatted
    }

    @Test
    void join(){
        String join = String.join("Hello", "World");
        assertThat(join).isEqualTo("World");
    }  // String.join(){}

    @Test
    void indexOf(){
        String s = "Hello";
        assertThat(s.indexOf(0)).isEqualTo("H");
    }







}






