import java.util.Random;

public class Computer implements Player{
    private String name;
    private int score;
    public Computer(){
        this.name = "Computer";
        this.score = 0;
    }

    @Override
    public String takeTurn() {
        Random ran = new Random();
        int moveInt = ran.nextInt(4);
        String computerMove = "";
        switch (moveInt){
            case 1:
                computerMove = "Rock";
                break;
            case 2:
                computerMove = "Paper";
                break;
            case 3:
                computerMove = "Scissors";
                break;
            default:
                break;

        }
        return computerMove;

    }

    public void setScore(int point) {
        this.score += point;
    }

    public int getScore() {
        return score;
    }
}
