public class ForLoops {
    static void main() {

//        int counter = 0;
//        for (int i = 0; i < 10; i++) {
//            System.out.println("How many times will this sentence print?");
//            counter++;
//            System.out.println("This is the " + i + "th cycle of the for loop");
//        }
//        System.out.println("The sentence printed " + counter + " times");


        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        String stringArray[] = {"First string",
                "Second string",
                "Third string",
                "Fourth string",
                "Fifth string"};

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }

        int array[] = {1, 2, 3, 45, 5, 6, 7, 8, 9, 345, 456, 678, 3456};
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        System.out.println("Sum of the array is: " + sum);

    }
}
