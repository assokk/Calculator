package org.example.lv2;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer = "";

        while (!answer.equals("exit")) {
            // ==========================
            // 1. 사용자 입력 받기
            // ==========================

            // 숫자 입력
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();

            while (num1 < 0) {
                System.out.println("양수만 입력해야 합니다. 다시 입력하세요.");
                System.out.print("첫 번째 숫자를 입력하세요: ");
                num1 = sc.nextInt();
            }

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            while (num2 < 0) {
                System.out.println("양수만 입력해야 합니다. 다시 입력하세요.");
                System.out.print("두 번째 숫자를 입력하세요: ");
                num2 = sc.nextInt();
            }

            System.out.println("첫 번째 숫자: " + num1);
            System.out.println("두 번째 숫자: " + num2);

            // 연산자 입력
            System.out.print("사칙연산 기호를 입력하세요.(＋,－,×,÷): ");
            char operator = sc.next().charAt(0);


            // ==========================
            // 2. 계산 후 결과 출력
            // ==========================

            Calculator calc = new Calculator();
            int result = calc.calculate(num1, num2, operator);

            sc.nextLine();
            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) ");
            answer = sc.nextLine();
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
