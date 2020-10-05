package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class zad58 {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static void main(String[] args) throws NoSuchAlgorithmException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        System.out.print("Введите строку: ");
        String text = reader.readLine();
        // Change this to UTF-16
        md.update(text.getBytes(StandardCharsets.UTF_8));
        byte[] digest = md.digest();
        String hex = String.format("%064x", new BigInteger(1, digest));
        System.out.println(ANSI_YELLOW + "Ваш HEX-код: " + hex);
    }
}
