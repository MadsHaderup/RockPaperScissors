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
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Sten, 2. Papir, 3. Saks");
        int moveInt = scan.nextInt();
        String humanMove = "";
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
                break;
        }
        return humanMove;
    }

    public void setScore(int point) {
        this.score += point;
    }
    public int getScore(){
        return this.score;
    }
}