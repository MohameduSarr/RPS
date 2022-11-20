import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            String playerAMove;
            String playerBMove;

            while (true) {
                System.out.println("Player A, enter your move (r, p, s)");
                playerAMove = scanner.nextLine();

                if (playerAMove.equalsIgnoreCase("r") || playerAMove.equalsIgnoreCase("p") || playerAMove.equalsIgnoreCase("s")) {
                    break;
                }
                System.out.println(playerAMove + " Is not a valid input.");
            }

            while (true) {
                System.out.println("Player B, enter your move (r, p, s)");
                playerBMove = scanner.nextLine();

                if (playerBMove.equalsIgnoreCase("r") || playerBMove.equalsIgnoreCase("p") || playerBMove.equalsIgnoreCase("s")) {
                    break;
                }
                System.out.println(playerBMove + " Is not a valid input.");
            }

            if (playerAMove.equalsIgnoreCase(playerBMove)) {
                System.out.println("It's a tie!");

            } else if (playerAMove.equalsIgnoreCase("r")) {
                if (playerBMove.equalsIgnoreCase("p")) {
                    System.out.println("Paper beats rock! Player B wins!");
                }
            } else if (playerAMove.equalsIgnoreCase("p")) {
                if (playerBMove.equalsIgnoreCase("r")) {
                    System.out.println("Paper beats rock! Player A wins!");
                } else if (playerAMove.equalsIgnoreCase("p")) {
                    if (playerBMove.equalsIgnoreCase("s")) {
                        System.out.println("Scissors beats paper! Player B wins!");
                    }
                } else if (playerAMove.equalsIgnoreCase("s")) {
                    if (playerBMove.equalsIgnoreCase("p")) {
                        System.out.println("Scissors beats paper! Player A wins!");
                    }
                } else if (playerAMove.equalsIgnoreCase("s") && playerBMove.equalsIgnoreCase("r")) {
                    if (playerBMove.equalsIgnoreCase("r")) {
                        System.out.println("Rock beats scissors! Player B wins!");
                    }
                } else if (playerAMove.equalsIgnoreCase("r")) {
                    if (playerBMove.equalsIgnoreCase("s")) {
                        System.out.println("Rock beats Scissors! Player A wins!");
                    }
                }

                System.out.println("Do you want to play again? [Y/N]");
                String playAgain = scanner.nextLine();

                if (!playAgain.equalsIgnoreCase("Y")) {
                    break;
                }
            }
        }
    }
}