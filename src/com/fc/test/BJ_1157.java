package com.fc.test;


import java.util.Scanner;

/**
 * @author yoon
 * @since  2023-12-03
 * @deprecated  백준 단어공부 : 문자열
 *
 */
public class BJ_1157 {
    public static int [] getAlphabetCount(String str){
        int[] count= new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if('A' <= ch && ch <= 'Z'){
                count[ch - 'A']++;
            }else{
                count[ch-'a']++;
            }
        }
        return count;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int[] count = getAlphabetCount(str);
        int maxCount = -1;

        char maxAlphabet = '?';
        for (int i = 0; i < 26; i++) {
            if (count[i] > maxCount){
                maxCount = count[i];
                maxAlphabet = (char)('A'+i);
            } else if (count[i] == maxCount) {
                maxAlphabet = '?';
            }
        }
        System.out.println(maxAlphabet);
    }
}