package org.example.lv1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ==========================
        // 1. 사용자 입력 받기
        // ==========================

        // 숫자 입력
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();

        while(num1 < 0) {
            System.out.println("양수만 입력해야 합니다. 다시 입력하세요.");
            System.out.print("첫 번째 숫자를 입력하세요: ");
            num1 = sc.nextInt();
        }
        System.out.println(num1 + " 을 입력하셨습니다.");

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();

        while(num2 < 0) {
            System.out.println("양수만 입력해야 합니다. 다시 입력하세요.");
            System.out.print("두 번째 숫자를 입력하세요: ");
            num2 = sc.nextInt();
        }
        System.out.println(num2 + " 을 입력하셨습니다.");

        System.out.println("첫 번째 숫자: " + num1);
        System.out.println("두 번째 숫자: " + num2);

        // 연산자 입력
        System.out.print("사칙연산 기호를 입력하세요.(➕,➖,✖\uFE0F,➗): ");
        char operator = sc.next().charAt(0);

    }
}
