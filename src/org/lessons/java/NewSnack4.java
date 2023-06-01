package org.lessons.java;

public class NewSnack4 {
    public static boolean isPalindrome(String string){
        int left = 0;
        int right = string.length() -1;

        while (left <= right){
            if (string.charAt(left) != string.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String inputString = "osso";
        System.out.println(isPalindrome(inputString));

        inputString = "cane";
        System.out.println(isPalindrome(inputString));
    }
    }
