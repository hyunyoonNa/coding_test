package com.fc.test;

import java.util.Scanner;

public class BJ_1543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String doc = sc.nextLine();
        String word = sc.nextLine();

        String replaced = doc.replace(word, "");
        int length =doc.length() - replaced.length();
        int count  = length/ word.length();
        System.out.println(count);
    }
}