import java.util.Scanner;

public class Human implements Player {
    private String name;
    private int score;

    public Human() {
        this.name = "Human";
        this.score = 0;
    }

    @Override
    public String takeTurn() {
        int moveInt;
        String humanMove = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("1. Rock, 2. Paper, 3. Scissors");

        if (scan.hasNextInt()){
            moveInt = scan.nextInt();
        } else {
            moveInt = 4;
        }
        switch (moveInt) {
            case 1:
                humanMove = "Rock";
                break;
            case 2:
                humanMove = "Paper";
                break;
            case 3:
                humanMove = "Scissors";
                break;
            default:
                System.out.println("Please pick a number between 1 and 3\n");
                takeTurn();
                break;
        }
        return humanMove;
    }

    public int getScore(){
        return this.score;
    }

    public void setScore(int point) { this.score += point; }
}