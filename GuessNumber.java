// by Kate Li

public class GuessNumber
{
    public static void main (String[] args)
    {
        int numguesses = 0; // running total of number of guesses
        int answer = (int)(Math.random()*10+1);
        boolean won = false; // keeps track of whether game is won
        int result = 0; // -1 is too low, 1 is too high, 0 is begin. of game
        HumanPlayer human = new HumanPlayer();
        System.out.println("Hello human, I'm thinking of a number between 1 and 10. ");
        // create a loop that continues until game is won (correct guess)
        while (won == false)
        {
            System.out.println("Enter your guess: ");
            int guess = human.play(result); // takes int from HumanPlayer
            if (guess > answer)
            {
                result = 1;
                numguesses++;
            }
            else if (guess < answer)
            {
                result = -1;
                numguesses++;
            }
            else
            {
                won = true;
                numguesses++;
            }
        }
        System.out.println("You won! It took the human " + numguesses + " tries. ");

        int numguessesComp = 0; // running total of number of guesses
        boolean wonComp = false; // keeps track of whether game is won
        int resultComp = 0; // -1 is too low, 1 is too high, 0 is begin. of game
        ComputerPlayer comp = new ComputerPlayer();
        System.out.println("Hello computer, I'm thinking of a number between 1 and 10. ");
        // create a loop that continues until game is won (correct guess)
        int guessComp = 5;
        while (wonComp == false)
        {
            System.out.println("Enter your guess: ");
            guessComp = comp.play(resultComp, guessComp); // takes int from ComputerPlayer
            System.out.println(guessComp);
            if (guessComp > answer)
            {
                resultComp = 1;
                numguessesComp++;
            }
            else if (guessComp < answer)
            {
                resultComp = -1;
                numguessesComp++;
            }
            else
            {
                wonComp = true;
                numguessesComp++;
            }
        }
        System.out.println("You won! It took the computer " + numguessesComp + " tries. ");

    }
}