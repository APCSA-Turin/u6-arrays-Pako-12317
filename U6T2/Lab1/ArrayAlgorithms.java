import java.util.ArrayList;

public class ArrayAlgorithms{
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

}