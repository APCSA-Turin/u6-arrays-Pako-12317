public class Main {
   public static String[] makeLowercase(String[] wordList) {
      String[] lowerCaseArray = new String[wordList.length];
      for (int i = 0; i < wordList.length; i++) {
          lowerCaseArray[i] = wordList[i].toLowerCase();
      }
      return lowerCaseArray;
  }

  public static int endsInExclamations(String[] stringList) {
      int count = 0;
      for (String str : stringList) {
          if (str.endsWith("!")) {
              count++;
          }
      }
      return count;
  }

  public static void makeUppercase(String[] wordList) {
      for (int i = 0; i < wordList.length; i++) {
          wordList[i] = wordList[i].toUpperCase();
      }
  }

  public static int[] arrayMaximums(int[] intArr1, int[] intArr2) {
      int[] maxArray = new int[intArr1.length];
      for (int i = 0; i < intArr1.length; i++) {
          maxArray[i] = Math.max(intArr1[i], intArr2[i]);
      }
      return maxArray;
  }

  public static int countConsecutiveDoubles(int[] numList) {
      int count = 0;
      for (int i = 0; i < numList.length - 1; i++) {
          if (numList[i] == numList[i + 1]) {
              count++;
          }
      }
      return count;
  }

  public static int longestStreak(int[] nums) {
      int maxStreak = 1;
      int currentStreak = 1;

      for (int i = 1; i < nums.length; i++) {
          if (nums[i] == nums[i - 1]) {
              currentStreak++;
              maxStreak = Math.max(maxStreak, currentStreak);
          } else {
              currentStreak = 1;
          }
      }

      return maxStreak;
  }
 }