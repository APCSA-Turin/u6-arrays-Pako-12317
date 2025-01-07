public class Runner {
    public static void main(String[] args) {
        int[] grades = {75, 80, 82, 78, 92};

        for (int i = 0; i < grades.length; i++) {
            grades[i] += 5;
        }

        for (int grade : grades) {
            System.out.println(grade);
        }
    }
}
