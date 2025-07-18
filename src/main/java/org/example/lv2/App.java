package org.example.lv2;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer = "";
        Calculator calc = new Calculator();

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
            sc.nextLine();


            // ==========================
            // 2. 계산 후 결과 출력
            // ==========================

            int result = calc.calculate(num1, num2, operator);

            System.out.print("방금 계산한 결과값을 수정하시겠습니까? ");
            String edit = sc.nextLine();

            if (edit.equals("Y")) {
                System.out.print("수정할 값을 입력하세요: ");
                int editResult = sc.nextInt();
                sc.nextLine();
                calc.setResults(editResult);
            }
            System.out.println("계산 결과 목록: " + calc.getResults());

            System.out.println("과거 계산 기록을 삭제하시겠습니까?");
            System.out.print("Y 입력 시 가장 오래된 기록이 삭제됩니다: ");
            String remove = sc.nextLine();
            if (remove.equals("Y")) {
                calc.removeResult();
            }
            System.out.println("계산 결과 목록: " + calc.getResults());

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) ");
            answer = sc.nextLine();
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
