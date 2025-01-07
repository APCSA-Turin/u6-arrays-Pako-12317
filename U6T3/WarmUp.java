public class WarmUp{
    public static void main(String[] args) {
        int[] nums = {8, 4, 10, 5, 7, 11, 3, 9, 23, 6};
        int sum = 0;
        for (int i : nums) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
