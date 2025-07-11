package org.example.lv2;

public class Calculator {
    private int result = 0;

    public int sum(int a, int b) {
        result = a + b;
        System.out.println("계산 결과는 " + a + " + " + b + " = " + result + " 입니다.");
        return result;
    }

    public int sub(int a, int b) {
            result = a - b;
            System.out.println("계산 결과는 " + a + " - " + b + " = " + result + " 입니다.");
            return result;
    }

    public int mul(int a, int b) {
        result = a * b;
        System.out.println("계산 결과는 " + a + " × " + b + " = " + result + " 입니다.");
        return result;
    }

    public int div(int a, int b) {
        if (b == 0) {
            System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
        } else {
            result = a / b;
            System.out.println("계산 결과는 " + a + " ÷ " + b + " = " + result + " 입니다.");
        }
        return result;
    }
}
