package org.example.lv2;

import java.util.ArrayList;

public class Calculator {
    private ArrayList<Integer> results = new ArrayList<>();

    public int calculate(int num1, int num2, char operator) {
        int result = 0;

        switch (operator) {
            case '＋':
                result = num1 + num2;
                System.out.println("계산 결과는 " + num1 + " + " + num2 + " = " + result + " 입니다.");
                break;
            case '－':
                result = num1 - num2;
                System.out.println("계산 결과는 " + num2 + " - " + num2 + " = " + result + " 입니다.");
                break;
            case '×':
                result = num1 * num2;
                System.out.println("계산 결과는 " + num1 + " * " + num2 + " = " + result + " 입니다.");
                break;
            case '÷':
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                } else {
                    result = num1 / num2;
                    System.out.println("계산 결과는 " + num1 + " ÷ " + num2 + " = " + result + " 입니다.");
                }
                break;
            default:
                System.out.println("올바른 연산자를 입력하세요.");
        }
        results.add(result);
        return result;
    }

    public ArrayList<Integer> getResults() {
        return results;
    }

    public void setResults(int newValue) {
        results.set(results.size() - 1, newValue);
    }

    public void removeResult() {
        results.remove(0);
    }
}