package com.company;

/**
 * Created by makovetskyi on 10/31/2016.
 */
public class GFiveNumbers<T extends Number> {

    private Number[] numbers = new Number[5];

    public void setNumber(T o, int index) {
        numbers[index] = o;
    }

    public T getNumber(int index) {
        return (T) numbers[index];
    }

    public Number sum() {
        double result = 0;
        for (Number number : numbers) {
            if (number != null) {
                result = result + number.doubleValue();
            }
        }
        return result;
    }

    public void print() {
        for (Number number : numbers) {
            System.out.println(number);
        }
    }

    public int find(T target) {
        for (int i = 0; i < 5; i++) {
            if (target.equals(numbers[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean isClassOfAll(Class clazz) {
        for (Number number : numbers) {
            if (number.getClass() != clazz) {
                return false;
            }
        }
        return true;
    }
}
