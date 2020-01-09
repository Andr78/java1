package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number) {
        int number1 =  number%10 ;
        int number2 = number/10%10;
        int number3 = number/100%10;
        System.out.print(number1);
        System.out.print(number2);
        System.out.println(number3);
        return number;
    }
    public static void main(String[] args){

        reverseDigits(138);

    }
}
