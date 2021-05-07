public class Game {
    public static void main(String[] args){
        new Game().play();
    }

    public void play(){
        Human human = new Human();
        Computer computer = new Computer();

        //Best of 3 games
        while(human.getScore()<2 && computer.getScore() <2){
            String humanChoice = human.takeTurn();
            String computerChoice = computer.takeTurn();
            System.out.println("Computer has: " + computerChoice + "\n");

            switch (humanChoice) {
                case "Rock":
                    if (computerChoice.equals("Scissors")) {
                        human.setScore(1);
                        System.out.println("You win!");
                    } else if (computerChoice.equals("Paper")) {
                        computer.setScore(1);
                        System.out.println("Computer wins!");
                    } else {
                        System.out.println("It's a tie!");
                    }
                    break;

                case "Paper":
                    if (computerChoice.equals("Rock")) {
                        human.setScore(1);
                        System.out.println("You win!");
                    } else if (computerChoice.equals("Scissors")) {
                        computer.setScore(1);
                        System.out.println("Computer wins!");
                    } else {
                        System.out.println("It's a tie!");
                    }
                    break;

                case "Scissors":
                    if (computerChoice.equals("Paper")) {
                        human.setScore(1);
                        System.out.println("You win!");
                    } else if (computerChoice.equals("Rock")) {
                        computer.setScore(1);
                        System.out.println("Computer wins!");
                    } else {
                        System.out.println("It's a tie!");
                    }
                    break;
            }
            displayResult(human, computer);
            System.out.println();
        }
        //sout here for winner text potentially
    }

    public void displayResult(Human human, Computer computer){

        System.out.println("Your score: " + human.getScore());
        System.out.println("Computers score: " + computer.getScore());
    }
}
