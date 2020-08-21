//2. Создать новый проект приложения аналогичный тому, который мы с вами создавали.
package com.company;

//3. Создать в этом проекте класс с методом main аналогичный тому который мы с вами создавали.
public class Main {

//    4. Написать публичный метод принимающий 2 параметра: первый типа byte и второй типа short.
//    Метод должен возвращать сумму значений параметров.
//    Тип возвращаемого значения должен быть byte.
    public static byte addByteShort (byte a, short b) {
        return (byte)(a+b);
    }

//    5. Написать публичный метод принимающий 2 параметра: первый типа int и второй типа long.
//    Метод должен возвращать произведение значений параметров.
//    Тип возвращаемого значения int.
    public static int multiIntLong(int a, long b) {
        return (int)(a*b);
    }

//    6. Написать метод getMaxNumber принимающий 2 параметра: int и int.
//    Метод должен сравнить переданные параметры между собой и вернуть максимальный.
//    Для решения необходимо использовать IF или тернарный оператор ?:
    public static int getMaxNumber (int a, int b) {
        return a > b ? a : b;
    }

//    7. Написать метод isCharA принимающий 1 параметр типа char.
//    Если передана буква 'А', то возвращать true, а в остальных случаях false
    public static boolean isCharA (char c) {
        return c == 'A';
    }

//    8. Написать метод isCharNumber принимающий 1 параметр типа char.
//    Если передано число, то вернуть true, а в остальных случаях false
    public static boolean isCharNumber (char c) {
        return (c >= '0') && (c <= '9');
    }

//    9. Написать метод выводящий на экран в цикле бинарное представление чисел от 0 до 30.
//    Для вывода бинарного представления использовать Integer.toBinaryString().
//    Без входных параметров и не возвращающая ничего.
    public static void binary0_30 () {
        System.out.println("Двоичное представление чисел от 0 до 30 :");
        for (int i=0;i<=30;++i) System.out.print(i + "=" + Integer.toBinaryString(i) + " ");
        System.out.println();
    }

//    10. Написать метод выводящий бинарное представление Integer.MAX_VALUE и Integer.MAX_VALUE + 1.
//    Для вывода бинарного представления использовать Integer.toBinaryString().
//    Без входных параметров и не возвращающая ничего.
//    Покажет, что переполнение не вызывает ошибку и как это выглядет в памяти
    public static void integerMax () {
        System.out.println("Integer.MAX_VALUE = " + Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println("Integer.MAX_VALUE + 1 = " + Integer.toBinaryString(Integer.MAX_VALUE+1));
    }

//    11. Написать метод принимающий 1 параметр типа char и возвращающий его числовое представление.
    public static int charToInt (char c) {
        return c;
    }

//    12. Написать метод принимающий 1 параметр типа int и возвращающий его представление в виде печатного символа
    public static char IntToChar (int a) {
        return (char) (a%256);
    }

    public static void main(String[] args) {
//    4. Написать публичный метод принимающий 2 параметра: первый типа byte и второй типа short.
//    Метод должен возвращать сумму значений параметров.
//    Тип возвращаемого значения должен быть byte.
        System.out.println("addByteShort((byte) 1, (short) 5) : " + addByteShort((byte) 1, (short) 5));
//    5. Написать публичный метод принимающий 2 параметра: первый типа int и второй типа long.
//    Метод должен возвращать произведение значений параметров.
//    Тип возвращаемого значения int.
        System.out.println("multiIntLong(50,100) : " + multiIntLong(50,100));
//    6. Написать метод getMaxNumber принимающий 2 параметра: int и int.
//    Метод должен сравнить переданные параметры между собой и вернуть максимальный.
//    Для решения необходимо использовать IF или тернарный оператор ?:
        System.out.println("getMaxNumber(1,99) : " + getMaxNumber(1,99));
//    7. Написать метод isCharA принимающий 1 параметр типа char.
//    Если передана буква 'А', то возвращать true, а в остальных случаях false
        System.out.println("isCharA('A') : " + isCharA('A'));
        System.out.println("isCharA('a') : " + isCharA('a'));
//    8. Написать метод isCharNumber принимающий 1 параметр типа char.
//    Если передано число, то вернуть true, а в остальных случаях false
        System.out.println("isCharNumber('5') : " + isCharNumber('5'));
        System.out.println("isCharNumber('y') : " + isCharNumber('y'));
//    9. Написать метод выводящий на экран в цикле бинарное представление чисел от 0 до 30.
        binary0_30();
//    10. Написать метод выводящий бинарное представление Integer.MAX_VALUE и Integer.MAX_VALUE + 1.
        integerMax();
//    11. Написать метод принимающий 1 параметр типа char и возвращающий его числовое представление.
        System.out.println("charToInt('A') : " + charToInt('A'));
//    12. Написать метод принимающий 1 параметр типа int и возвращающий его представление в виде печатного символа
        System.out.println("IntToChar(65) : " + IntToChar(65));

        Cat catSimple = new Cat(0,0,0, "Чеширский кот");
        Dog dogSimple = new Dog(0,0,0,"Овчарка");

        catSimple.setXYZ(4,5,6);
        dogSimple.setXYZ(1,2,3);

        System.out.println(catSimple.getType() + catSimple.getXYZ());
        System.out.println(dogSimple.getType() + dogSimple.getXYZ());

        System.out.println("Кот говорит: " + catSimple.getMessage(0));
        System.out.println("Пес говорит: " + dogSimple.getMessage(0));

        System.out.println("Кот " + catSimple.goOnTree(5));
        System.out.println("Кот " + catSimple.jumpFromTree());
    }
}