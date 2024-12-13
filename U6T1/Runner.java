public class Runner {
    public static void main(String[] args) {
        // Task 1: Use the new keyword to create an int array
        int[] heights = new int[3];
        System.out.println("Task 1: Initial heights array values:");
        for (int height : heights) {
            System.out.println(height);
        }
        heights[0] = 78;
        heights[1] = 72;
        heights[2] = 69;
        System.out.println("Task 1: Updated heights array values:");
        for (int height : heights) {
            System.out.println(height);
        }

        // Task 2: Use an initializer list for a boolean array
        boolean[] bools = {true, false, true, false, true, false};
        bools[0] = bools[3];
        System.out.println("Task 2: Length of bools array: " + bools.length);
        System.out.println("Task 2: First element: " + bools[0]);
        System.out.println("Task 2: Last element: " + bools[bools.length - 1]);

        // Task 3: Swap elements in a String array
        String[] alphabeticalNames = {"Abby", "David", "Charlie", "Lauren"};
        String temp = alphabeticalNames[1];
        alphabeticalNames[1] = alphabeticalNames[2];
        alphabeticalNames[2] = temp;
        System.out.println("Task 3: Swapped alphabeticalNames array values:");
        for (String name : alphabeticalNames) {
            System.out.println(name);
        }

        // Task 4: Operate on double arrays
        double[] array1 = {7.5, 10.0};
        double[] array2 = {8.2, 14.8};
        double[] array3 = new double[2];
        array3[0] = array1[0] + array2[0];
        array3[1] = array1[1] * array2[1];
        System.out.println("Task 4: Elements of array3:");
        for (double value : array3) {
            System.out.println(value);
        }

        // Task 5: Use the new keyword to create a String array
        String[] animals = new String[4];
        System.out.println("Task 5: Initial animals array values:");
        for (String animal : animals) {
            System.out.println(animal);
        }
        animals[0] = "dog";
        animals[1] = "camel";
        animals[2] = "aardvark";
        animals[3] = "bunny";
        System.out.println("Task 5: Updated animals array values:");
        for (String animal : animals) {
            System.out.println(animal);
        }

        // Print the animal at index 4 to observe an out-of-bounds exception
        try {
            System.out.println(animals[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Task 5: Exception occurred: " + e.getMessage());
        }

        // Fix by printing the last valid index
        System.out.println("Task 5: Animal at last valid index (3): " + animals[3]);

        // Update element at index 2 by adding an "s" to make it plural
        animals[2] = animals[2] + "s";
        System.out.println("Task 5: Updated animal at index 2: " + animals[2]);
        System.out.println("Task 5: Length of animals array: " + animals.length);
        System.out.println("Task 5: Length of string at index 2: " + animals[2].length());

        // Task 6: Dog class operations
        Dog[] dogs = {
            new Dog("Sparky", 4),
            new Dog("Toby", 7),
            new Dog("Fiona", 12)
        };
        System.out.println("Task 6: Names of dogs:");
        for (Dog dog : dogs) {
            System.out.println(dog.getName());
        }
    }
}
