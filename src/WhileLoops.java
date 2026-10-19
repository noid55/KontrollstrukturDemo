import javax.swing.*;

public class WhileLoops {
    static void main() {

        int i = 1;

//        while(i <= 5){
//            System.out.println(i);
//            i++;
//        }


        boolean alwaysTrue = true;
//        int breakTheProgram = 2140000000;
//        int iterationsOfLoop = 1;
//        while(alwaysTrue){
//            //System.out.println("This will go on forever...");
//            System.out.println("This is the " + breakTheProgram + "th iteration of the loop");
//            breakTheProgram++;
//        }

//        String guessNumber = JOptionPane.showInputDialog(null, "Guess a number");
//        int correctNumber = 55;
//        int integerGuess = Integer.parseInt(guessNumber);
//
//        if(correctNumber == integerGuess){
//            System.out.println("Congratulations");
//        }
//        else{
//            System.out.println("Try again!");
//        }


        while (alwaysTrue) {
            String guessNumber = JOptionPane.showInputDialog(null, "Guess a number");
            int correctNumber = 55;
            int integerGuess = Integer.parseInt(guessNumber);

            if (correctNumber == integerGuess) {
                System.out.println("Congratulations");
                alwaysTrue = false;

            } else {
                System.out.println("Try again!");
            }
        }

        /* Which loop would you choose?
        1. Print the numbers from 1 to 50.
            for | while
        2. Keep asking for a number until the user enters 0.
            for | while
        3. Go through every element in an array using an index.
            for | while
        4. Keep playing a game while the player has lives remaining.
            for | while
        */
    }
}

