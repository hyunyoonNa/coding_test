package com.fc.test;

import java.util.Scanner;

/**
 * @author yoon
 * @since  2023-12-03
 * @deprecated 애너그램 구현하기 : 문자열
 */
public class BJ_1919 {
    public static int[] getAlphbetCount(String str){
        int[] count = new int[26];
        for(int i = 0; i < str.length(); i++){
            count[str.charAt(i)-'a']++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        //a, b , c , d
//        int[] countA = new int[26]; //알파벳 소문자갯수 26 ex) dared = [1],[0],[0],[2]...
//        int[] countB = new int[26];
        int[] countA = getAlphbetCount(a); //알파벳 소문자갯수 26 ex) dared = [1],[0],[0],[2]...
        int[] countB = getAlphbetCount(b);

       /* for(int i = 0; i < a.length(); i++){
            countA[a.charAt(i)-'a']++;
        }*/
        for (int i = 0; i < 26; i++) {
            if (countA[i] > 0) System.out.println((char) ('a' + i) + " : " + countA[i]);
        }

        System.out.println("----------------------");
         /* for(int i = 0; i < b.length(); i++){
            countA[b.charAt(i)-'a']++;
        }*/
        for (int i = 0; i < 26; i++) {
            if(countB[i] > 0) System.out.println((char) ('a' + i) + " : " + countB[i]);
        }

        int ans = 0;
        for (int i = 0; i < 26; i++)
            ans += Math.abs(countA[i] - countB[i]);
     /*   {
            if(countA[i] > countB[i]) ans += countA[i] - countB[i];
            else if (countB[i] > countA[i]) ans += countB[i] - countA[i];
        }*/
        System.out.println("---------------------");
        System.out.println(ans);
    }
}
