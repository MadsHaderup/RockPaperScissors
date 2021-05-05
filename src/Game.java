public class Game {
    public static void main(String[] args){
        new Game().play();
    }
    public void play(){
        Human human = new Human();
        Computer computer = new Computer();

        while(human.getScore()<2 && computer.getScore() <2){
            String humanStr = human.takeTurn();
            String computerStr = computer.takeTurn();
            System.out.println("Computer has: " + computerStr);
            switch (humanStr) {
                case "Rock":
                    if (computerStr.equals("Paper")) {
                        computer.setScore(1);
                    } else if (computerStr.equals("Scissors")) {
                        human.setScore(1);
                    }
                    break;

                case "Paper":
                    if (computerStr.equals("Rock")) {
                        human.setScore(1);
                    } else if (computerStr.equals("Scissors")) {
                        computer.setScore(1);
                    }
                    break;

                case "Scissors":
                    if (computerStr.equals("Paper")) {
                        human.setScore(1);
                    } else if (computerStr.equals("Scissors")) {
                        computer.setScore(1);
                    }
                    break;

            }
        }
    }
}
