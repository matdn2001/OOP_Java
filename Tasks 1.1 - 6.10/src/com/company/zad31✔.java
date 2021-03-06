package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class zad31 {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите коэффициент а: ");
        String sa = reader.readLine();
        System.out.print("Введите коэффициент b: ");
        String sb = reader.readLine();
        System.out.print("Введите коэффициент c: ");
        String sc = reader.readLine();
        int a = Integer.parseInt(sa);
        int b = Integer.parseInt(sb);
        int c = Integer.parseInt(sc);
        System.out.println(ANSI_YELLOW + "Уравнение имеет " + solutions(a, b, c) + " действительных корней." + ANSI_RESET);
    }
    public static int solutions(int a, int b, int c){
        int D = b * b - 4 * a * c;
        if (D > 0)
            return 2;
        else if (D < 0)
            return 0;
        else
            return 1;
    }
}
