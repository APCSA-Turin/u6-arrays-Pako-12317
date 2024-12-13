package U6T2.Lab2;

import java.util.ArrayList;

public class ArrayAlgorithms {
    private ArrayAlgorithms(){}

    public static double average(int[] numlist){
        int sum = 0;
        for (int i : numlist){
            sum+=i;
        }
        return (double)sum/numlist.length;
    }

    public static int minimum(int[] numList) {
        int min = numList[1];
        for (int i : numList){
            if (i<min){
                min = i;
            }
        }
        return min;
    }
    
    public static int howManyContain(String[] strList, String target) {
        int c = 0;
        for (String i : strList){
            if(i.contains(target)){
                c++;
            }
        }
        return c;
    }
    
    public static String[] stringToArray(String myStr) {
        return myStr.split("");
    }
    
    public static void introduceAdults(Person[] people) {
        for (Person i : people){
            if (i.getAge()>=18) {
                i.introduce();
            }
        }
    }
    
    public static void reversePrint(String[] wordList) {
        ArrayList <String> revList = new ArrayList<String>();
        for (int i = wordList.length - 1; i >= 0; i--) {
            String word = wordList[i];
            // Reverse the characters of the string
            String reversedWord = new StringBuilder(word).reverse().toString();
            // Print the reversed word
            revList.add(reversedWord);
        }
        for (String i : revList){
            System.out.println(i);
        }
    }

    public static int[] combine(int[] arr1, int[] arr2){
        int[] combined = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, combined, 0, arr1.length);
        System.arraycopy(arr2, 0, combined, arr1.length, arr2.length);
        return combined;
    }

    public static void bookEnd(int[] nums, int num) {
        nums[0]=num;
        nums[nums.length-1]=num;
    }

    public static void multiplyBy(int[] numList, int multiplier) {
        for(int i=0; i<numList.length; i++){
            numList[i]*=multiplier;
        }
    }
    
    public static int[] multiplyByNoModify(int[] numList, int multiplier) {
        int[] newArray = new int[numList.length];
        for(int i=0; i<numList.length; i++){
            newArray[i]=(numList[i]*multiplier);
        }
        
        return newArray;
    }
    
    public static void addExclamation(String[] wordList) {
        int x = 0;
        for(String i : wordList){
            if (!i.endsWith("!")){
                wordList[x]+="!";
                x++;
            }
        }
    }
    
    public static boolean[] isFreezing(int[] tempList) {
        boolean[] freezingArray = new boolean[tempList.length];
        for (int i = 0; i < tempList.length; i++) {
            freezingArray[i] = tempList[i] <= 32;
        }
        return freezingArray;
    }

    public static void shiftLeft(int[] numList) {
        if (numList.length > 1) {
            int firstElement = numList[0];
            for (int i = 0; i < numList.length - 1; i++) {
                numList[i] = numList[i + 1];
            }
            numList[numList.length - 1] = firstElement;
        }
    }
    
    public static void shiftRight(int[] numList) {
        if (numList.length > 1) {
            int lastElement = numList[numList.length - 1];
            for (int i = numList.length - 1; i > 0; i--) {
                numList[i] = numList[i - 1];
            }
            numList[0] = lastElement;
        }
    }

    public static void reverse(int[] numList) {
        // Strategy 1: Reverse from a copy
        if (numList.length > 1) {
            int[] copy = new int[numList.length];
            for (int i = 0; i < numList.length; i++) {
                copy[i] = numList[i];
            }
            for (int i = 0; i < numList.length; i++) {
                numList[i] = copy[numList.length - 1 - i];
            }
        }
    }
    
    public static void reverseInPlace(int[] numList) {
        // Strategy 2: Reverse in place
        if (numList.length > 1) {
            for (int i = 0; i < numList.length / 2; i++) {
                int temp = numList[i];
                numList[i] = numList[numList.length - 1 - i];
                numList[numList.length - 1 - i] = temp;
            }
        }
    }
}
