package com.fc.test;

import java.util.Scanner;
/**
 * @author yoon
 * @since  2023-12-02
 * @deprecated 대소문자 바꾸기 : 문자열
 */
public class BJ_2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char[] ans = str.toCharArray();
        for (int i= 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if('A' <= ch && ch <= 'Z'){
                ans[i] =(char)('a'+ch -'A');
            }else{
                ans[i] = (char)('A'+ch -'a');
            }
        }
        System.out.println(ans);
    }
}
