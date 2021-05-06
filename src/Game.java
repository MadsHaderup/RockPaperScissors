public class Game {
    public static void main(String[] args){
        new Game().play();
    }
    public void play(){
        Human human = new Human();
        Computer computer = new Computer();

        //Best of 3
        while(human.getScore()<2 && computer.getScore() <2){
            String humanChoice = human.takeTurn();
            String computerChoice = computer.takeTurn();
            System.out.println("Computer has: " + computerChoice);
            switch (humanChoice) {
                case "Rock":
                    if (computerChoice.equals("Paper")) {
                        computer.setScore(1);
                    } else if (computerChoice.equals("Scissors")) {
                        human.setScore(1);
                    }
                    break;

                case "Paper":
                    if (computerChoice.equals("Rock")) {
                        human.setScore(1);
                    } else if (computerChoice.equals("Scissors")) {
                        computer.setScore(1);
                    }
                    break;

                case "Scissors":
                    if (computerChoice.equals("Paper")) {
                        human.setScore(1);
                    } else if (computerChoice.equals("Scissors")) {
                        computer.setScore(1);
                    }
                    break;
            }
        }
    }
}
