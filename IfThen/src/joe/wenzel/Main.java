package joe.wenzel;

public class Main {

    public static void main(String[] args) {
//        boolean isAlien = false;
//        if (isAlien == false){
//            System.out.println("It is not an alien!");
//        } else {
//            System.out.println("It is an alien!");
//        }
//        int topScore = 1010;
//        if (topScore < 100){
//            System.out.println("You did not get the high score!");
//        } else if (topScore >= 100){
//            System.out.println("You got the high score!");
//
//        }
        boolean gameOver = true;
        int score = 5000;
        int levelComplete = 5;
        int bonus = 100;

//        if (score == 5000) {
//            System.out.println("Your score was 5000");
//            System.out.println("This was executed");
//
//        } else if (score < 1000) {
//            System.out.println("Your score was less than 1000");
//
//
//        } else {
//            System.out.println("Got here");
//        }

        if (gameOver == true) {
            int finalScore = score + (levelComplete * bonus);
            System.out.println("Your final score was final score");

        }

    }
}
