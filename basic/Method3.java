package com.ohgiraffers.section01.conditional.level101.basic;

import java.util.Scanner;

public class Method3 {

    /* 두 개의 정수를 입력 받아 변수에 저장하고,
     * 연산기호(+, -, *, /, %)를 입력 받아 해당 연산의 수행 결과를 출력하세요.
     * 단, 준비된 연산기호 외의 문자를 입력하는 경우 "입력하신 연산은 없습니다. 프로그램을 종료합니다." 출력 후 프로그램 종료
     *
     * -- 입력 예시 --
     * 첫 번째 정수 : 4
     * 두 번쨰 정수 : 3
     * 연산 기호를 입력하세요 : +
     *
     * -- 출력 예시 --
     * 4 + 3 = 7
     */

    public void calculator() {

        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 정수 : ");
        int firstNumber = sc.nextInt();

        System.out.print("두 번째 정수 : ");
        int secondNumber = sc.nextInt();

        System.out.print("연산 기호를 입력하세요 : ");
        char op = sc.next().charAt(0);

        int result = 0;

        switch (op){

            case '+' :
                result = firstNumber + secondNumber;
                System.out.println(firstNumber + " " + op + " " + secondNumber + " = " + result );
            break;

            case '-' :
                result = firstNumber - secondNumber;
                System.out.println(firstNumber + " " + op + " " + secondNumber + " = " + result );
            break;

            case '*' :
                result = firstNumber * secondNumber;
                System.out.println(firstNumber + " " + op + " " + secondNumber + " = " + result );
            break;

            case '/' :
                result = firstNumber / secondNumber;
                System.out.println(firstNumber + " " + op + " " + secondNumber + " = " + result );
            break;

            case '%' :
                result = firstNumber % secondNumber;
                System.out.println(firstNumber + " " + op + " " + secondNumber + " = " + result );
            break;

            default :
                System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다.");
        }

    }


    /* 과일 이름("사과", "바나나", "복숭아", "키위") 중 한 가지를 문자열로 입려하면
     * 해당하는 가격에 맞게 상품명과 가격이 출력되게 하세요.
     * 단, 목록에 없는 과일을 입력 시 "준비된 상품이 없습니다." 출력 후 프로그램 종료
     *
     * -- 상품 가격 --
     * 사과 :  1000원
     * 바나나 : 3000원
     * 복숭아 : 2000원
     * 키위 : 5000원
     *
     * -- 입력 예시 --
     * 과일 이름을 입력하세요 : 바나나
     *
     * -- 출력 예시 --
     * 바나나의 가격은 3000원 입니다.
     * */
    public void fruitSales() {

        Scanner sc = new Scanner(System.in);

        String fruitName = "";
        int price = 0;

        System.out.println("-- 상품 가격 --");
        System.out.println("사과 : 1,000원");
        System.out.println("바나나 : 3,000원");
        System.out.println("복숭아 : 2,000원");
        System.out.println("키위 : 5,000원");

        System.out.print("과일 이름을 입력하세요 : ");

        String selectFruitName = sc.nextLine();

        switch (selectFruitName) {

            case "사과" :
                fruitName = "사과";
                price = 1000;
                System.out.println(fruitName + "의 가격은 " + price + "입니다.");

                break;

            case "바나나" :
                fruitName = "바나나";
                price = 3000;
                System.out.println(fruitName + "의 가격은 " + price + "입니다.");

                break;

            case "복숭아" :
                fruitName = "복숭아";
                price = 2000;
                System.out.println(fruitName + "의 가격은 " + price + "입니다.");

                break;

                case "키위" :
                fruitName = "키위";
                price = 5000;
                    System.out.println(fruitName + "의 가격은 " + price + "입니다.");

                    break;

            default:
                System.out.println("준비된 상품이 없습니다.");
        }


    }


}
