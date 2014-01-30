import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class Game
{
	
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

    public static void game () throws IOException
    {
    	
    	BufferedReader r = new BufferedReader (new InputStreamReader(System.in));	
	System.out.println ("Options for Character One:");
	System.out.println ("1. Austin");
	System.out.println ("2. Harrish");
	System.out.println ("3. Jason");
	System.out.println ("4. Allen");
	System.out.println ("5. Kevin");
	System.out.println ("6. Leo");
	System.out.println ("7. James");
	System.out.println ("8. Cody");
	System.out.println ("9. William");
	System.out.println ("10. Nan");
	System.out.println ("11. Brian");
	System.out.println ("12. Mario");
	System.out.println ("13. Jin");
	System.out.print ("Choice: ");
	int One = Integer.parseInt(r.readLine ());
	CharacterConfig.Choose (One);
	characterChoice = 2;
	System.out.println("");
	System.out.println("------------------------------------");
	System.out.println("");

	System.out.println ("Options for Character Two:");
	System.out.println ("1. Austin");
	System.out.println ("2. Harrish");
	System.out.println ("3. Jason");
	System.out.println ("4. Allen");
	System.out.println ("5. Kevin");
	System.out.println ("6. Leo");
	System.out.println ("7. James");
	System.out.println ("8. Cody");
	System.out.println ("9. William");
	System.out.println ("10. Nan");
	System.out.println ("11. Brian");
	System.out.println ("12. Mario");
	System.out.println ("13. Jin");
	System.out.print ("Choice: ");
	int Two = Integer.parseInt(r.readLine ());
	while (One == Two)
	{
	    System.out.println ("You cannot choose the same character");
	    System.out.print ("Choice: ");
	    Two = Integer.parseInt(r.readLine ());
	}
	CharacterConfig.Choose (Two);
	//Reconfigures characters for naming purposes
	characterChoice = 1;
	CharacterConfig.Choose (One);
	characterChoice = 2;
	CharacterConfig.Choose (Two);
	System.out.println("");
	System.out.println("------------------------------------");
	System.out.println("");
	
	String anykey;
	int round = 1;
	int option = 0;
	if ((CharacterOne.equals ("Mario") || CharacterTwo.equals ("Mario")) && (CharacterOne.equals ("Austin") || CharacterTwo.equals ("Austin")))
	{
	    System.out.println ("Mario fails Austin, Mario wins.");
	    AutoWin = true;
	}

	else if ((CharacterOne.equals ("Mario") || CharacterTwo.equals ("Mario")) && (CharacterOne.equals ("Nan") || CharacterTwo.equals ("Nan")))
	{
	    System.out.println ("Mario refuses to face Nan, no one wins.");
	    AutoWin = true;
	}

	while (AliveOne && AliveTwo && !AutoWin)
	{
	    successOne = false;
	    successTwo = false;

	    System.out.println ("Round " + round);
	    System.out.println (CharacterOne + " HP:" + CharacterOneHP);
	    System.out.println (CharacterOne + " Mana: " + CharacterOneMana);
	    System.out.println (CharacterOne + " ManaRegen: " + CharacterOneRegen);
	    for (int i = 0 ; i <= MovesOne ; i++)
	    {
		System.out.println (i + ". " + OptionsOne [i]);
	    }
	    System.out.print ("Your Move: ");
	    option = Integer.parseInt(r.readLine ());
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
			System.out.println ("Not Enough Mana");

		}
		else
		    System.out.println ("Choose a valid option");
		if (!successOne)
		{
		    System.out.print ("Your Move: ");
		    option = Integer.parseInt(r.readLine ());
		}
	    }
	    RollOne = Math.round (((Math.random () * MoveOneValue [option]) * 0.6) + (MoveOneValue [option] * 0.4));
	    CharacterTwoHP = CharacterTwoHP - RollOne;
	    System.out.println (ActionOne [option] + " " + CharacterTwo + " suffers " + RollOne + " damage.");
	    AliveTwo = (CharacterTwoHP > 0);
	    if (AliveTwo)
	    {
		System.out.println ("--------------------------------------------");

		System.out.println (CharacterTwo + " HP:" + CharacterTwoHP);
		System.out.println (CharacterTwo + " Mana: " + CharacterTwoMana);
		System.out.println (CharacterTwo + " ManaRegen: " + CharacterTwoRegen);
		for (int i = 0 ; i <= MovesTwo ; i++)
		{
		    System.out.println (i + ". " + OptionsTwo [i]);
		}
		System.out.print ("Your Move: ");
		option = Integer.parseInt(r.readLine ());
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
			    System.out.println ("Not Enough Mana");

		    }
		    else
			System.out.println ("Choose a valid option");
		    if (!successTwo)
		    {
			System.out.print ("Your Move: ");
			option = Integer.parseInt(r.readLine ());
		    }
		}
		RollTwo = Math.round (((Math.random () * MoveTwoValue [option]) * 0.6) + (MoveTwoValue [option] * 0.4));
		CharacterOneHP = CharacterOneHP - RollTwo;
		System.out.println (ActionTwo [option] + " " + CharacterOne + " suffers " + RollTwo + " damage.");
		System.out.println ("--------------------------------------------");

		System.out.println ("Round " + round + " results: ");
		System.out.println (CharacterOne + " HP :" + CharacterOneHP);
		System.out.println (CharacterOne + " Mana: " + CharacterOneMana);
		System.out.println (CharacterTwo + " HP :" + CharacterTwoHP);
		System.out.println (CharacterTwo + " Mana: " + CharacterTwoMana);
		AliveOne = (CharacterOneHP > 0);
		if (AliveOne)
		{
		    System.out.println ("Enter any key to proceed to next round: ");
		    anykey = r.readLine();
		}
	    }
	    CharacterOneMana = CharacterOneMana + CharacterOneRegen;
	    CharacterTwoMana = CharacterTwoMana + CharacterTwoRegen;
	    round++;
	    System.out.println("");
		System.out.println("------------------------------------");
		System.out.println("");
	}

	if (AliveOne && !AutoWin)
	{
	    System.out.println (ActionOne [option] + " " + CharacterTwo + " suffers " + RollOne + " damage.");
	    System.out.println (CharacterOne + " has slain " + CharacterTwo + "!!");
	}
	else if (AliveTwo && !AutoWin)
	{
	    System.out.println (ActionTwo [option] + " " + CharacterOne + " suffers " + RollTwo + " damage.");
	    System.out.println (CharacterTwo + " has slain " + CharacterOne + "!!");
	}

	int BenjaminRoll = (int) (Math.random () * 5);
	if (BenjaminRoll == 1 && !AutoWin)
	{
	    System.out.println ("A Wild Benjamin Has Appeared!");
	    if (AliveOne && (!CharacterOne.equals ("Nan")))
	    {
		System.out.println ("Benjamin slays " + CharacterOne + "!");
		System.out.println ("Benjamin wins!");
	    }
	    else if (AliveTwo && (!CharacterTwo.equals ("Nan")))
	    {
		System.out.println ("Benjamin slays " + CharacterTwo + "!");
		System.out.println ("Benjamin wins!");
	    }
	    else if ((AliveTwo || AliveOne) && (CharacterTwo.equals ("Nan") || CharacterOne.equals ("Nan")))
	    {
		System.out.println ("Benjamin celebrates with Nan!");
	    }
	}
    }
}

