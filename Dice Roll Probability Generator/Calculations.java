// This class is responsibe for running the simulation and determening which part of the algorith should run based on the value
// of integer n that has been determined in the SpecificNumber or SpecificNumberSum classes, and return an array with 3 probabilities
// that are going to be displayed in the Results window created by the code in the Results class.

public class Calculations
{
    public static String probability[] = new String[3];
    
    public static void simulation(int n)
    {
        int win = 0;
        int rollNumber = 0;
        int rollResult[] = new int[30];
        //Part of the simulation that runs when n equals to 1 to return 3 probabilities of a specific number roll.
        if (n == 1)
        {
            int diceInput[] = SpecificNumber.getDice();
            int inputInput[] = SpecificNumber.getInput();
            for (int v = 0; v < 10; v++)
            {
                for (int w = 0; w < 10; w++)
                {
                    for (int x = 0; x < 10; x++)
                    {
                        for (int y = diceInput[0]; y > 0; y--)
                        {
                            rollResult[rollNumber] = (int)(Math.random()*(4-1+1)+1);
                            rollNumber++;
                        }
                        for (int y = diceInput[1]; y > 0; y--)
                        {
                            rollResult[rollNumber] = (int)(Math.random()*(6-1+1)+1);
                            rollNumber++;
                        }
                        for (int y = diceInput[2]; y > 0; y--)
                        {
                            rollResult[rollNumber] = (int)(Math.random()*(8-1+1)+1);
                            rollNumber++;
                        }
                        for (int y = diceInput[3]; y > 0; y--)
                        {
                            rollResult[rollNumber] = (int)(Math.random()*(10-1+1)+1);
                            rollNumber++;
                        }
                        for (int y = diceInput[4]; y > 0; y--)
                        {
                            rollResult[rollNumber] = (int)(Math.random()*(12-1+1)+1);
                            rollNumber++;
                        }
                        for (int y = diceInput[5]; y > 0; y--)
                        {
                            rollResult[rollNumber] = (int)(Math.random()*(20-1+1)+1);
                            rollNumber++;
                        }
                        
                        while (rollNumber > 0)
                        {
                            rollNumber--;
                            if (rollResult[rollNumber] == inputInput[0])
                            {
                                win++;
                                rollNumber = 0;
                            }
                        }
                    }
                    if(v < 1 && w < 1)
                    {
                        probability[0] = win + "/10";
                    }
                }
                if(v < 1)
                {
                    probability[1] = win + "/100";
                }
            }
            probability[2] = win + "/1000";
        }
        
        //Part of the simulation that runs when n equals to 2 to return 3 probabilities of a specific number sum.
        if (n == 2)
        {
            int RollResultSum = 0;
            int diceInput[] = SpecificNumberSum.getDice();
            int inputInput[] = SpecificNumberSum.getInput();
            for (int v = 0; v < 10; v++)
            {
                for (int w = 0; w < 10; w++)
                {
                    for (int x = 0; x < 10; x++)
                    {
                        for (int y = diceInput[0]; y > 0; y--)
                        {
                            rollResult[rollNumber] = (int)(Math.random()*(4-1+1)+1);
                            rollNumber++;
                        }
                        for (int y = diceInput[1]; y > 0; y--)
                        {
                            rollResult[rollNumber] = (int)(Math.random()*(6-1+1)+1);
                            rollNumber++;
                        }
                        for (int y = diceInput[2]; y > 0; y--)
                        {
                            rollResult[rollNumber] = (int)(Math.random()*(8-1+1)+1);
                            rollNumber++;
                        }
                        for (int y = diceInput[3]; y > 0; y--)
                        {
                            rollResult[rollNumber] = (int)(Math.random()*(10-1+1)+1);
                            rollNumber++;
                        }
                        for (int y = diceInput[4]; y > 0; y--)
                        {
                            rollResult[rollNumber] = (int)(Math.random()*(12-1+1)+1);
                            rollNumber++;
                        }
                        for (int y = diceInput[5]; y > 0; y--)
                        {
                            rollResult[rollNumber] = (int)(Math.random()*(20-1+1)+1);
                            rollNumber++;
                        }
                        
                        while (rollNumber > 0)
                        {
                            rollNumber--;
                            RollResultSum = RollResultSum + rollResult[rollNumber];
                        }
                        if (RollResultSum == inputInput[0])
                            {
                                win++;
                            }
                        RollResultSum = 0;
                    }
                    if(v < 1 && w < 1)
                    {
                        probability[0] = win + "/10";
                    }
                }
                if(v < 1)
                {
                    probability[1] = win + "/100";
                }
            }
            probability[2] = win + "/1000";
        }
    }
}