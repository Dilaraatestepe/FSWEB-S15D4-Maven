package org.example;


import java.util.Stack;

public class Main {
    public static boolean checkForPalindrome(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }


        StringBuilder cleanedInput = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleanedInput.append(Character.toLowerCase(c));
            }
        }


        int left = 0;
        int right = cleanedInput.length() - 1;

        while (left < right) {
            if (cleanedInput.charAt(left) != cleanedInput.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    public static String convertDecimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }


        Stack<Integer> stack = new Stack<>();


        while (decimal > 0) {
            int remainder = decimal % 2;
            stack.push(remainder);
            decimal /= 2;
        }


        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }

        return binary.toString();
    }

    public static void main(String[] args) {
            System.out.println(checkForPalindrome("I did, did I?")); // true
            System.out.println(checkForPalindrome("Racecar")); // true
            System.out.println(checkForPalindrome("hello")); // false
            System.out.println(checkForPalindrome("Was it a car or a cat I saw ?")); // true


        System.out.println("************");

        WorkintechList<String> list = new WorkintechList<>();


        list.add("banana");
        list.add("apple");
        list.add("orange");
        list.add("apple");

        System.out.println("List after adding: " + list); // [apple, banana, orange]


        list.remove("banana");
        System.out.println("List after removing 'banana': " + list);


        System.out.println("************");


        System.out.println(convertDecimalToBinary(10)); // 1010
        System.out.println(convertDecimalToBinary(0));  // 0
        System.out.println(convertDecimalToBinary(255)); // 11111111

    }



}