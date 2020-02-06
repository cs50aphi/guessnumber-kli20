public class ComputerPlayer
{
    public int play(int resultComp, int guessComp)
    {
        if (resultComp == -1)
        {
            // Too low, add 1
            guessComp++;
        }
        else if (resultComp == 1)
        {
            // Too high, subtract 1
            guessComp--;
        }
        return guessComp;
    }
}