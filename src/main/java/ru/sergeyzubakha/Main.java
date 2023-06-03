package ru.sergeyzubakha;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число");
        int varInt = scanner.nextInt(); //  (-) 2^32(-1)
        System.out.println("Введите второе число");
        int varInt1 = scanner.nextInt(); //  (-) 2^32(-1)

        if (varInt > varInt1) {
            System.out.println("первое число больше второго");
        } else {
            System.out.println("второе число больше первого");
        };

        String a = "Привет";
        String b = "Hi!";
        boolean isItSame = b.equals(a);
        System.out.println("Строки одинаковые?" + " " + isItSame);

        byte varByte = 1;  // -128  +127     (-) 2^8(-1)
        byte varByte1 = -4;  // -128  +127     (-) 2^8(-1)
        short varShort = 1; // -32768  +32767 (-) 2^16(-1)
        short varShort1 = 12433; // -32768  +32767 (-) 2^16(-1)
        long varLong = 2_342_344_23; // (-) 2^64(-1)
        long varLong1 = 234324324; // (-) 2^64(-1)
        long varLong3 = 9223372036854775807L; // (-) 2^64(-1)
        long varLong4 = 9223372036854775806L; // (-) 2^64(-1)
        double vardouble = 2.3;

        System.out.println(varByte + varByte1);
        System.out.println(varShort - varShort1);
        System.out.println(varInt * varInt1);
        System.out.println(varLong / varLong1);
        System.out.println(varByte % varByte1);
        System.out.println(varLong * varLong1);
        System.out.println("переполнение" + " " + varLong3 * varLong4);
        System.out.println("вычисления комбинаций типов данных (int и double)" + " " + varInt+vardouble );

        boolean isItTrue = varByte < varByte1;
        System.out.println(isItTrue);

    }
}