package org.example.lv1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();

        while(num1 < 0) {
            System.out.println("양수만 입력해야 합니다. 다시 입력하세요.");
            System.out.print("첫 번째 숫자를 입력하세요: ");
            num1 = scanner.nextInt();
        }
        System.out.println(num1 + " 을 입력하셨습니다.");

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        while(num2 < 0) {
            System.out.println("양수만 입력해야 합니다. 다시 입력하세요.");
            System.out.print("두 번째 숫자를 입력하세요: ");
            num2 = scanner.nextInt();
        }
        System.out.println(num2 + " 을 입력하셨습니다.");


        System.out.println(num1);
        System.out.println(num2);

    }
}
