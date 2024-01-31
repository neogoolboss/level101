package com.ohgiraffers.section01.conditional.level101.basic;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        /* Basic */
        /* 정수를 하나 입력 받아 그 수가 양수이면 "양수다." 라고 출력하고,
         * 양수가 아닌 경우 "양수가 아니다." 라고 출력하세요
         *
         * -- 입력 예시 --
         * 정수를 하나 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 양수다.
         * */

        Method1 method1 = new Method1();

//        method1.checkPlusMinusNumber();

//        method1.checkEvenNumber();

        /* Normal */
        /* 1~10 사이의 정수 한개를 입력받아 홀수인지 짝수인지 인지 확인하고,
         * 홀수이면 "홀수다.", 홀수가 아니면 "짝수다." 라고 출력하세요.
         * 단, 1~10 사이의 정수가 아닌 경우 "반드시 1~10 사이의 정수를 입력해야 합니다." 를 출력하세요.
         * */

        Method2 method2 = new Method2();

//        method2.checkEvenNumber2();

//        method2.checkBmi();

        Method3 method3 = new Method3();

//        method3.calculator();

        method3.fruitSales();
    }



}
