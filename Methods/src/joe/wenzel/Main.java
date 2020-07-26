package joe.wenzel;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        int highScorePostion = calculateHighScorePosition(1500);
        displayHighScorePosition("Joe", highScorePostion);

        highScorePostion = calculateHighScorePosition(900);
        displayHighScorePosition("Bill", highScorePostion);

        highScorePostion = calculateHighScorePosition(50);
        displayHighScorePosition("Jim", highScorePostion);

        highScorePostion = calculateHighScorePosition(1000);
        displayHighScorePosition("Paul", highScorePostion);


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;

            return finalScore;

        }
        return -1;
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table");


    }
    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;

        } else if ((score >= 500) && (score < 1000)) {
            return 2;
        } else if ((score >= 100) && (score < 500)) {
            return 3;
        } else {
            return 4;
        }

    }
}
