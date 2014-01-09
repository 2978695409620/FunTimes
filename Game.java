import hsa.Console;
public class Game
{
    static Console c = new Console ();
    public static String CharacterOne = "";
    public static String CharacterTwo = "";
    public static int characterChoice = 1;
    public static double CharacterOneHP = 0;
    public static double CharacterTwoHP = 0;
    public static int CharacterOneAttack = 0;
    public static int CharacterTwoAttack = 0;
    public static int CharacterOneMana = 0;
    public static int CharacterTwoMana = 0;
    public static int CharacterOneRegen = 0;
    public static int CharacterTwoRegen = 0;
    public static int[] MoveOneCost = new int [10];
    public static int[] MoveTwoCost = new int [10];
    public static String[] OptionsOne = new String [10];
    public static String[] OptionsTwo = new String [10];
    public static int[] MoveOneValue = new int [10];
    public static int[] MoveTwoValue = new int [10];
    public static int MovesOne = 0;
    public static int MovesTwo = 0;
    public static boolean AliveOne = true;
    public static boolean AliveTwo = true;
    public static boolean successOne = false;
    public static boolean successTwo = false;
    public static double RollOne = 0;
    public static double RollTwo = 0;
    public static boolean AutoWin = false;
    public static String[] ActionOne = new String [10];
    public static String[] ActionTwo = new String [10];

    public static void game ()
    {
	c.println ("Options for Character One:");
	c.println ("1. Austin");
	c.println ("2. Harrish");
	c.println ("3. Jason");
	c.println ("4. Allen");
	c.println ("5. Kevin");
	c.println ("6. Leo");
	c.println ("7. James");
	c.println ("8. Cody");
	c.println ("9. William");
	c.println ("10. Nan");
	c.println ("11. Brian");
	c.println ("12. Mario");
	c.println ("13. Jin");
	c.print ("Choice: ");
	int One = c.readInt ();
	CharacterConfig.Choose (One);
	characterChoice = 2;
	c.clear ();

	c.println ("Options for Character Two:");
	c.println ("1. Austin");
	c.println ("2. Harrish");
	c.println ("3. Jason");
	c.println ("4. Allen");
	c.println ("5. Kevin");
	c.println ("6. Leo");
	c.println ("7. James");
	c.println ("8. Cody");
	c.println ("9. William");
	c.println ("10. Nan");
	c.println ("11. Brian");
	c.println ("12. Mario");
	c.println ("13. Jin");
	c.print ("Choice: ");
	int Two = c.readInt ();
	while (One == Two)
	{
	    c.println ("You cannot choose the same character");
	    c.print ("Choice: ");
	    Two = c.readInt ();
	}
	CharacterConfig.Choose (Two);
	//Reconfigures characters for naming purposes
	characterChoice = 1;
	CharacterConfig.Choose (One);
	characterChoice = 2;
	CharacterConfig.Choose (Two);
	
	c.clear ();
	String anykey;
	int round = 1;
	int option = 0;
	if ((CharacterOne.equals ("Mario") || CharacterTwo.equals ("Mario")) && (CharacterOne.equals ("Austin") || CharacterTwo.equals ("Austin")))
	{
	    c.println ("Mario fails Austin, Mario wins.");
	    AutoWin = true;
	}

	else if ((CharacterOne.equals ("Mario") || CharacterTwo.equals ("Mario")) && (CharacterOne.equals ("Nan") || CharacterTwo.equals ("Nan")))
	{
	    c.println ("Mario refuses to face Nan, no one wins.");
	    AutoWin = true;
	}

	while (AliveOne && AliveTwo && !AutoWin)
	{
	    successOne = false;
	    successTwo = false;

	    c.println ("Round " + round);
	    c.println (CharacterOne + " HP:" + CharacterOneHP);
	    c.println (CharacterOne + " Mana: " + CharacterOneMana);
	    c.println (CharacterOne + " ManaRegen: " + CharacterOneRegen);
	    for (int i = 0 ; i <= MovesOne ; i++)
	    {
		c.println (i + ". " + OptionsOne [i]);
	    }
	    c.print ("Your Move: ");
	    option = c.readInt ();
	    while (!successOne)
	    {
		if (option >= 0 && option <= MovesOne)
		{
		    if (CharacterOneMana >= MoveOneCost [option])
		    {
			CharacterOneMana = CharacterOneMana - MoveOneCost [option];
			successOne = true;
		    }
		    else
			c.println ("Not Enough Mana");

		}
		else
		    c.println ("Choose a valid option");
		if (!successOne)
		{
		    c.print ("Your Move: ");
		    option = c.readInt ();
		}
	    }
	    RollOne = Math.round (((Math.random () * MoveOneValue [option]) * 0.6) + (MoveOneValue [option] * 0.4));
	    CharacterTwoHP = CharacterTwoHP - RollOne;
	    c.println (ActionOne [option] + " " + CharacterTwo + " suffers " + RollOne + " damage.");
	    AliveTwo = (CharacterTwoHP > 0);
	    if (AliveTwo)
	    {
		c.println ("--------------------------------------------");

		c.println (CharacterTwo + " HP:" + CharacterTwoHP);
		c.println (CharacterTwo + " Mana: " + CharacterTwoMana);
		c.println (CharacterTwo + " ManaRegen: " + CharacterTwoRegen);
		for (int i = 0 ; i <= MovesTwo ; i++)
		{
		    c.println (i + ". " + OptionsTwo [i]);
		}
		c.print ("Your Move: ");
		option = c.readInt ();
		while (!successTwo)
		{
		    if (option >= 0 && option <= MovesTwo)
		    {
			if (CharacterTwoMana >= MoveTwoCost [option])
			{
			    CharacterTwoMana = CharacterTwoMana - MoveTwoCost [option];
			    successTwo = true;
			}
			else
			    c.println ("Not Enough Mana");

		    }
		    else
			c.println ("Choose a valid option");
		    if (!successTwo)
		    {
			c.print ("Your Move: ");
			option = c.readInt ();
		    }
		}
		RollTwo = Math.round (((Math.random () * MoveTwoValue [option]) * 0.6) + (MoveTwoValue [option] * 0.4));
		CharacterOneHP = CharacterOneHP - RollTwo;
		c.println (ActionTwo [option] + " " + CharacterOne + " suffers " + RollTwo + " damage.");
		c.println ("--------------------------------------------");

		c.println ("Round " + round + " results: ");
		c.println (CharacterOne + " HP :" + CharacterOneHP);
		c.println (CharacterOne + " Mana: " + CharacterOneMana);
		c.println (CharacterTwo + " HP :" + CharacterTwoHP);
		c.println (CharacterTwo + " Mana: " + CharacterTwoMana);
		AliveOne = (CharacterOneHP > 0);
		if (AliveOne)
		{
		    c.println ("Enter any key to proceed to next round: ");
		    anykey = c.readLine ();
		}
	    }
	    CharacterOneMana = CharacterOneMana + CharacterOneRegen;
	    CharacterTwoMana = CharacterTwoMana + CharacterTwoRegen;
	    c.clear ();
	    round++;
	}

	if (AliveOne && !AutoWin)
	{
	    c.println (ActionOne [option] + " " + CharacterTwo + " suffers " + RollOne + " damage.");
	    c.println (CharacterOne + " has slain " + CharacterTwo + "!!");
	}
	else if (AliveTwo && !AutoWin)
	{
	    c.println (ActionTwo [option] + " " + CharacterOne + " suffers " + RollTwo + " damage.");
	    c.println (CharacterTwo + " has slain " + CharacterOne + "!!");
	}

	int BenjaminRoll = (int) (Math.random () * 5);
	if (BenjaminRoll == 1 && !AutoWin)
	{
	    c.println ("A Wild Benjamin Has Appeared!");
	    if (AliveOne && (!CharacterOne.equals ("Nan")))
	    {
		c.println ("Benjamin slays " + CharacterOne + "!");
		c.println ("Benjamin wins!");
	    }
	    else if (AliveTwo && (!CharacterTwo.equals ("Nan")))
	    {
		c.println ("Benjamin slays " + CharacterTwo + "!");
		c.println ("Benjamin wins!");
	    }
	    else if ((AliveTwo || AliveOne) && (CharacterTwo.equals ("Nan") || CharacterOne.equals ("Nan")))
	    {
		c.println ("Benjamin celebrates with Nan!");
	    }
	}
    }
}

