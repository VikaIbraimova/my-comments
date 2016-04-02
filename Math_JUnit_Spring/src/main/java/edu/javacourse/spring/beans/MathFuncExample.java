package edu.javacourse.spring.beans;

public class MathFuncExample {
    int calls;

    /**
     * Функция делает:
     * Счетчик вызова методов factorial,plus
     * @return
     */
    public int getCalls() {
        return calls;
    }

    /**
     * Функция делает:
     * Находит факториал неотрицательного числа
     * @param number
     * @return
     */
    public long factorial(int number) {
        calls++;

        if (number < 0)
            throw new IllegalArgumentException();

        long result = 1;
        if (number > 1) {
            for (int i = 1; i <= number; i++)
                result = result * i;
        }

        return result;
    }

    /**
     * Функция делает:
     * Складывает два числа
     * @param num1
     * @param num2
     * @return
     */
    public long plus(int num1, int num2) {
        calls++;
        return num1 + num2;
    }
}