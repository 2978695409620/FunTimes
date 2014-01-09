public class CharacterConfig
{
    public static void ChooseAustin ()
    {
	if (Game.characterChoice == 1)
	{
	    Game.CharacterOne = "Austin";
	    Game.CharacterOneHP = CharacterStats.AustinHP;
	    Game.CharacterOneAttack = CharacterStats.AustinAttack;
	    Game.CharacterOneMana = CharacterStats.AustinMana;
	    Game.CharacterOneRegen = CharacterStats.AustinRegen;
	    Game.MovesOne = CharacterMoves.AustinMoves;
	    Game.MoveOneValue [0] = CharacterStats.AustinAttack;
	    Game.MoveOneValue [1] = CharacterMoves.Sleep;
	    Game.MoveOneValue [2] = CharacterMoves.Argue;
	    Game.MoveOneValue [3] = CharacterMoves.Confusion;
	    Game.MoveOneValue [4] = CharacterMoves.NoIdea;
	    Game.MoveOneCost [0] = CharacterMoves.AttackCost;
	    Game.MoveOneCost [1] = CharacterMoves.SleepCost;
	    Game.MoveOneCost [2] = CharacterMoves.ArgueCost;
	    Game.MoveOneCost [3] = CharacterMoves.ConfusionCost;
	    Game.MoveOneCost [4] = CharacterMoves.NoIdeaCost;
	    Game.OptionsOne [0] = "Attack (" + CharacterMoves.AttackCost + " mana)";
	    Game.OptionsOne [1] = "Sleep (" + CharacterMoves.SleepCost + " mana)";
	    Game.OptionsOne [2] = "Argue (" + CharacterMoves.ArgueCost + " mana)";
	    Game.OptionsOne [3] = "Confusion (" + CharacterMoves.ConfusionCost + " mana)";
	    Game.OptionsOne [4] = "NoIdea (" + CharacterMoves.NoIdeaCost + " mana)";
	    Game.ActionOne [0] = Game.CharacterOne + " attacks " + Game.CharacterTwo + ".";
	    Game.ActionOne [1] = "Austin sleeps in class.";
	    Game.ActionOne [2] = "Austin argues.";
	    Game.ActionOne [3] = "Austin is really confused about what is happening.";
	    Game.ActionOne [4] = "Austin has no idea what is going on.";
	}
	else if (Game.characterChoice == 2)
	{
	    Game.CharacterTwo = "Austin";
	    Game.CharacterTwoHP = CharacterStats.AustinHP;
	    Game.CharacterTwoAttack = CharacterStats.AustinAttack;
	    Game.CharacterTwoMana = CharacterStats.AustinMana;
	    Game.CharacterTwoRegen = CharacterStats.AustinRegen;
	    Game.MovesTwo = CharacterMoves.AustinMoves;
	    Game.MoveTwoValue [0] = CharacterStats.AustinAttack;
	    Game.MoveTwoValue [1] = CharacterMoves.Sleep;
	    Game.MoveTwoValue [2] = CharacterMoves.Argue;
	    Game.MoveTwoValue [3] = CharacterMoves.Confusion;
	    Game.MoveTwoValue [4] = CharacterMoves.NoIdea;
	    Game.MoveTwoCost [0] = CharacterMoves.AttackCost;
	    Game.MoveTwoCost [1] = CharacterMoves.SleepCost;
	    Game.MoveTwoCost [2] = CharacterMoves.ArgueCost;
	    Game.MoveTwoCost [3] = CharacterMoves.ConfusionCost;
	    Game.MoveTwoCost [4] = CharacterMoves.NoIdeaCost;
	    Game.OptionsTwo [0] = "Attack (" + CharacterMoves.AttackCost + " mana)";
	    Game.OptionsTwo [1] = "Sleep (" + CharacterMoves.SleepCost + " mana)";
	    Game.OptionsTwo [2] = "Argue (" + CharacterMoves.ArgueCost + " mana)";
	    Game.OptionsTwo [3] = "Confusion (" + CharacterMoves.ConfusionCost + " mana)";
	    Game.OptionsTwo [4] = "NoIdea (" + CharacterMoves.NoIdeaCost + " mana)";
	    Game.ActionTwo [0] = Game.CharacterTwo + " attacks " + Game.CharacterOne + ".";
	    Game.ActionTwo [1] = "Austin sleeps in class.";
	    Game.ActionTwo [2] = "Austin argues.";
	    Game.ActionTwo [3] = "Austin is really confused about what is happening.";
	    Game.ActionTwo [4] = "Austin has no idea what is going on.";
	}
    }


    public static void ChooseHarrish ()
    {
	if (Game.characterChoice == 1)
	{
	    Game.CharacterOne = "Harrish";
	    Game.CharacterOneHP = CharacterStats.HarrishHP;
	    Game.CharacterOneAttack = CharacterStats.HarrishAttack;
	    Game.CharacterOneMana = CharacterStats.HarrishMana;
	    Game.CharacterOneRegen = CharacterStats.HarrishRegen;
	    Game.MovesOne = CharacterMoves.HarrishMoves;
	    Game.MoveOneValue [0] = CharacterStats.HarrishAttack;
	    Game.MoveOneValue [1] = CharacterMoves.GivesUp;
	    Game.MoveOneValue [2] = CharacterMoves.Motivation;
	    Game.MoveOneValue [3] = CharacterMoves.Cower;
	    Game.MoveOneValue [4] = CharacterMoves.Hide;
	    Game.MoveOneCost [0] = CharacterMoves.AttackCost;
	    Game.MoveOneCost [1] = CharacterMoves.GivesUpCost;
	    Game.MoveOneCost [2] = CharacterMoves.MotivationCost;
	    Game.MoveOneCost [3] = CharacterMoves.CowerCost;
	    Game.MoveOneCost [4] = CharacterMoves.HideCost;
	    Game.OptionsOne [0] = "Attack (" + CharacterMoves.AttackCost + " mana)";
	    Game.OptionsOne [1] = "GivesUp (" + CharacterMoves.GivesUpCost + " mana)";
	    Game.OptionsOne [2] = "Motivation (" + CharacterMoves.MotivationCost + " mana)";
	    Game.OptionsOne [3] = "Cower (" + CharacterMoves.CowerCost + " mana)";
	    Game.OptionsOne [4] = "Hide (" + CharacterMoves.HideCost + " mana)";
	    Game.ActionOne [0] = Game.CharacterOne + " attacks " + Game.CharacterTwo + ".";
	    Game.ActionOne [1] = "Harrish gives up.";
	    Game.ActionOne [2] = "Harrish is motivated.";
	    Game.ActionOne [3] = "Harrish cowers in fear.";
	    Game.ActionOne [4] = "Harrish hides, confusing the enemy.";
	}
	else if (Game.characterChoice == 2)
	{
	    Game.CharacterTwo = "Harrish";
	    Game.CharacterTwoHP = CharacterStats.HarrishHP;
	    Game.CharacterTwoAttack = CharacterStats.HarrishAttack;
	    Game.CharacterTwoMana = CharacterStats.HarrishMana;
	    Game.CharacterTwoRegen = CharacterStats.HarrishRegen;
	    Game.MovesTwo = CharacterMoves.HarrishMoves;
	    Game.MoveTwoValue [0] = CharacterStats.HarrishAttack;
	    Game.MoveTwoValue [1] = CharacterMoves.GivesUp;
	    Game.MoveTwoValue [2] = CharacterMoves.Motivation;
	    Game.MoveTwoValue [3] = CharacterMoves.Cower;
	    Game.MoveTwoValue [4] = CharacterMoves.Hide;
	    Game.MoveTwoCost [0] = CharacterMoves.AttackCost;
	    Game.MoveTwoCost [1] = CharacterMoves.GivesUpCost;
	    Game.MoveTwoCost [2] = CharacterMoves.MotivationCost;
	    Game.MoveTwoCost [3] = CharacterMoves.CowerCost;
	    Game.MoveTwoCost [4] = CharacterMoves.HideCost;
	    Game.OptionsTwo [0] = "Attack (" + CharacterMoves.AttackCost + " mana)";
	    Game.OptionsTwo [1] = "GivesUp (" + CharacterMoves.GivesUpCost + " mana)";
	    Game.OptionsTwo [2] = "Motivation (" + CharacterMoves.MotivationCost + " mana)";
	    Game.OptionsTwo [3] = "Cower (" + CharacterMoves.CowerCost + " mana)";
	    Game.OptionsTwo [4] = "Hide (" + CharacterMoves.HideCost + " mana)";
	    Game.ActionTwo [0] = Game.CharacterTwo + " attacks " + Game.CharacterOne + ".";
	    Game.ActionTwo [1] = "Harrish gives up.";
	    Game.ActionTwo [2] = "Harrish is motivated.";
	    Game.ActionTwo [3] = "Harrish cowers in fear.";
	    Game.ActionTwo [4] = "Harrish hides, confusing the enemy.";
	}
    }


    public static void ChooseJason ()
    {
	if (Game.characterChoice == 1)
	{
	    Game.CharacterOne = "Jason";
	    Game.CharacterOneHP = CharacterStats.JasonHP;
	    Game.CharacterOneAttack = CharacterStats.JasonAttack;
	    Game.CharacterOneMana = CharacterStats.JasonMana;
	    Game.CharacterOneRegen = CharacterStats.JasonRegen;
	    Game.MovesOne = CharacterMoves.JasonMoves;
	    Game.MoveOneValue [0] = CharacterStats.JasonAttack;
	    Game.MoveOneValue [1] = CharacterMoves.Poke;
	    Game.MoveOneValue [2] = CharacterMoves.Jab;
	    Game.MoveOneValue [3] = CharacterMoves.Kick;
	    Game.MoveOneValue [4] = CharacterMoves.RoundHouseKick;
	    Game.MoveOneCost [0] = CharacterMoves.AttackCost;
	    Game.MoveOneCost [1] = CharacterMoves.PokeCost;
	    Game.MoveOneCost [2] = CharacterMoves.JabCost;
	    Game.MoveOneCost [3] = CharacterMoves.KickCost;
	    Game.MoveOneCost [4] = CharacterMoves.RoundHouseKickCost;
	    Game.OptionsOne [0] = "Attack (" + CharacterMoves.AttackCost + " mana)";
	    Game.OptionsOne [1] = "Poke (" + CharacterMoves.PokeCost + " mana)";
	    Game.OptionsOne [2] = "Jab (" + CharacterMoves.JabCost + " mana)";
	    Game.OptionsOne [3] = "Kick (" + CharacterMoves.KickCost + " mana)";
	    Game.OptionsOne [4] = "RoundHouseKick (" + CharacterMoves.RoundHouseKickCost + " mana)";
	    Game.ActionOne [0] = Game.CharacterOne + " attacks " + Game.CharacterTwo + ".";
	    Game.ActionOne [1] = "Jason pokes " + Game.CharacterTwo + " lightly.";
	    Game.ActionOne [2] = "Jason jabs " + Game.CharacterTwo + ".";
	    Game.ActionOne [3] = "Jason kicks " + Game.CharacterTwo + ".";
	    Game.ActionOne [4] = "Jason roundhouse kicks " + Game.CharacterTwo + " in the face.";
	}
	else if (Game.characterChoice == 2)
	{
	    Game.CharacterTwo = "Jason";
	    Game.CharacterTwoHP = CharacterStats.JasonHP;
	    Game.CharacterTwoAttack = CharacterStats.JasonAttack;
	    Game.CharacterTwoMana = CharacterStats.JasonMana;
	    Game.CharacterTwoRegen = CharacterStats.JasonRegen;
	    Game.MovesTwo = CharacterMoves.JasonMoves;
	    Game.MoveTwoValue [0] = CharacterStats.JasonAttack;
	    Game.MoveTwoValue [1] = CharacterMoves.Poke;
	    Game.MoveTwoValue [2] = CharacterMoves.Jab;
	    Game.MoveTwoValue [3] = CharacterMoves.Kick;
	    Game.MoveTwoValue [4] = CharacterMoves.RoundHouseKick;
	    Game.MoveTwoCost [0] = CharacterMoves.AttackCost;
	    Game.MoveTwoCost [1] = CharacterMoves.PokeCost;
	    Game.MoveTwoCost [2] = CharacterMoves.JabCost;
	    Game.MoveTwoCost [3] = CharacterMoves.KickCost;
	    Game.MoveTwoCost [4] = CharacterMoves.RoundHouseKickCost;
	    Game.OptionsTwo [0] = "Attack (" + CharacterMoves.AttackCost + " mana)";
	    Game.OptionsTwo [1] = "Poke (" + CharacterMoves.PokeCost + " mana)";
	    Game.OptionsTwo [2] = "Jab (" + CharacterMoves.JabCost + " mana)";
	    Game.OptionsTwo [3] = "Kick (" + CharacterMoves.KickCost + " mana)";
	    Game.OptionsTwo [4] = "RoundHouseKick (" + CharacterMoves.RoundHouseKickCost + " mana)";
	    Game.ActionTwo [0] = Game.CharacterTwo + " attacks " + Game.CharacterOne + ".";
	    Game.ActionTwo [1] = "Jason pokes " + Game.CharacterOne + " lightly.";
	    Game.ActionTwo [2] = "Jason jabs " + Game.CharacterOne + ".";
	    Game.ActionTwo [3] = "Jason kicks " + Game.CharacterOne + ".";
	    Game.ActionTwo [4] = "Jason roundhouse kicks " + Game.CharacterOne + " in the face.";
	}
    }


    public static void ChooseAllen ()
    {
	if (Game.characterChoice == 1)
	{
	    Game.CharacterOne = "Allen";
	    Game.CharacterOneHP = CharacterStats.AllenHP;
	    Game.CharacterOneAttack = CharacterStats.AllenAttack;
	    Game.CharacterOneMana = CharacterStats.AllenMana;
	    Game.CharacterOneRegen = CharacterStats.AllenRegen;
	    Game.MovesOne = CharacterMoves.AllenMoves;
	    Game.MoveOneValue [0] = CharacterStats.AllenAttack;
	    Game.MoveOneValue [1] = CharacterMoves.HaHa;
	    Game.MoveOneValue [2] = CharacterMoves.LeapAttack;
	    Game.MoveOneValue [3] = CharacterMoves.Crush;
	    Game.MoveOneValue [4] = CharacterMoves.Avatar;
	    Game.MoveOneCost [0] = CharacterMoves.AttackCost;
	    Game.MoveOneCost [1] = CharacterMoves.HaHaCost;
	    Game.MoveOneCost [2] = CharacterMoves.LeapAttackCost;
	    Game.MoveOneCost [3] = CharacterMoves.CrushCost;
	    Game.MoveOneCost [4] = CharacterMoves.AvatarCost;
	    Game.OptionsOne [0] = "Attack (" + CharacterMoves.AttackCost + " mana)";
	    Game.OptionsOne [1] = "HaHa (" + CharacterMoves.HaHaCost + " mana)";
	    Game.OptionsOne [2] = "LeapAttack (" + CharacterMoves.LeapAttackCost + " mana)";
	    Game.OptionsOne [3] = "Crush (" + CharacterMoves.CrushCost + " mana)";
	    Game.OptionsOne [4] = "Avatar (" + CharacterMoves.AvatarCost + " mana)";
	    Game.ActionOne [0] = Game.CharacterOne + " attacks " + Game.CharacterTwo + ".";
	    Game.ActionOne [1] = "Allen laughs at " + Game.CharacterTwo + ".";
	    Game.ActionOne [2] = "Allen leaps into the air and lands on " + Game.CharacterTwo + ".";
	    Game.ActionOne [3] = "Allen crushes " + Game.CharacterTwo + ".";
	    Game.ActionOne [4] = "Allen turns into an unstoppable force.";
	}
	else if (Game.characterChoice == 2)
	{
	    Game.CharacterTwo = "Allen";
	    Game.CharacterTwoHP = CharacterStats.AllenHP;
	    Game.CharacterTwoAttack = CharacterStats.AllenAttack;
	    Game.CharacterTwoMana = CharacterStats.AllenMana;
	    Game.CharacterTwoRegen = CharacterStats.AllenRegen;
	    Game.MovesTwo = CharacterMoves.AllenMoves;
	    Game.MoveTwoValue [0] = CharacterStats.AllenAttack;
	    Game.MoveTwoValue [1] = CharacterMoves.HaHa;
	    Game.MoveTwoValue [2] = CharacterMoves.LeapAttack;
	    Game.MoveTwoValue [3] = CharacterMoves.Crush;
	    Game.MoveTwoValue [4] = CharacterMoves.Avatar;
	    Game.MoveTwoCost [0] = CharacterMoves.AttackCost;
	    Game.MoveTwoCost [1] = CharacterMoves.HaHaCost;
	    Game.MoveTwoCost [2] = CharacterMoves.LeapAttackCost;
	    Game.MoveTwoCost [3] = CharacterMoves.CrushCost;
	    Game.MoveTwoCost [4] = CharacterMoves.AvatarCost;
	    Game.OptionsTwo [0] = "Attack (" + CharacterMoves.AttackCost + " mana)";
	    Game.OptionsTwo [1] = "HaHa (" + CharacterMoves.HaHaCost + " mana)";
	    Game.OptionsTwo [2] = "LeapAttack (" + CharacterMoves.LeapAttackCost + " mana)";
	    Game.OptionsTwo [3] = "Crush (" + CharacterMoves.CrushCost + " mana)";
	    Game.OptionsTwo [4] = "Avatar (" + CharacterMoves.AvatarCost + " mana)";
	    Game.ActionTwo [0] = Game.CharacterTwo + " attacks " + Game.CharacterOne + ".";
	    Game.ActionTwo [1] = "Allen laughs at " + Game.CharacterOne + ".";
	    Game.ActionTwo [2] = "Allen leaps into the air and lands on " + Game.CharacterOne + ".";
	    Game.ActionTwo [3] = "Allen crushes " + Game.CharacterOne + ".";
	    Game.ActionTwo [4] = "Allen turns into an unstoppable force.";
	}
    }


    public static void ChooseKevin ()
    {
	if (Game.characterChoice == 1)
	{
	    Game.CharacterOne = "Kevin";
	    Game.CharacterOneHP = CharacterStats.KevinHP;
	    Game.CharacterOneAttack = CharacterStats.KevinAttack;
	    Game.CharacterOneMana = CharacterStats.KevinMana;
	    Game.CharacterOneRegen = CharacterStats.KevinRegen;
	    Game.MovesOne = CharacterMoves.KevinMoves;
	    Game.MoveOneValue [0] = CharacterStats.KevinAttack;
	    Game.MoveOneValue [1] = CharacterMoves.TooLongDidNotRead;
	    Game.MoveOneValue [2] = CharacterMoves.Scorch;
	    Game.MoveOneValue [3] = CharacterMoves.Pyroblast;
	    Game.MoveOneValue [4] = CharacterMoves.LivingFire;
	    Game.MoveOneCost [0] = CharacterMoves.AttackCost;
	    Game.MoveOneCost [1] = CharacterMoves.TooLongDidNotReadCost;
	    Game.MoveOneCost [2] = CharacterMoves.ScorchCost;
	    Game.MoveOneCost [3] = CharacterMoves.PyroblastCost;
	    Game.MoveOneCost [4] = CharacterMoves.LivingFireCost;
	    Game.OptionsOne [0] = "Attack (" + CharacterMoves.AttackCost + " mana)";
	    Game.OptionsOne [1] = "TooLongDidNotRead (" + CharacterMoves.TooLongDidNotReadCost + " mana)";
	    Game.OptionsOne [2] = "Scorch (" + CharacterMoves.ScorchCost + " mana)";
	    Game.OptionsOne [3] = "Pyroblast (" + CharacterMoves.PyroblastCost + " mana)";
	    Game.OptionsOne [4] = "LivingFire (" + CharacterMoves.LivingFireCost + " mana)";
	    Game.ActionOne [0] = Game.CharacterOne + " attacks " + Game.CharacterTwo + ".";
	    Game.ActionOne [1] = "Kevin does not read.";
	    Game.ActionOne [2] = "Kevin throws a tiny ball of fire at " + Game.CharacterTwo + ".";
	    Game.ActionOne [3] = "Kevin casts a huge fireball at " + Game.CharacterTwo + ".";
	    Game.ActionOne [4] = "Kevin turns " + Game.CharacterTwo + " into a pillar of fire.";
	}
	else if (Game.characterChoice == 2)
	{
	    Game.CharacterTwo = "Kevin";
	    Game.CharacterTwoHP = CharacterStats.KevinHP;
	    Game.CharacterTwoAttack = CharacterStats.KevinAttack;
	    Game.CharacterTwoMana = CharacterStats.KevinMana;
	    Game.CharacterTwoRegen = CharacterStats.KevinRegen;
	    Game.MovesTwo = CharacterMoves.KevinMoves;
	    Game.MoveTwoValue [0] = CharacterStats.KevinAttack;
	    Game.MoveTwoValue [1] = CharacterMoves.TooLongDidNotRead;
	    Game.MoveTwoValue [2] = CharacterMoves.Scorch;
	    Game.MoveTwoValue [3] = CharacterMoves.Pyroblast;
	    Game.MoveTwoValue [4] = CharacterMoves.LivingFire;
	    Game.MoveTwoCost [0] = CharacterMoves.AttackCost;
	    Game.MoveTwoCost [1] = CharacterMoves.TooLongDidNotReadCost;
	    Game.MoveTwoCost [2] = CharacterMoves.ScorchCost;
	    Game.MoveTwoCost [3] = CharacterMoves.PyroblastCost;
	    Game.MoveTwoCost [4] = CharacterMoves.LivingFireCost;
	    Game.OptionsTwo [0] = "Attack (" + CharacterMoves.AttackCost + " mana)";
	    Game.OptionsTwo [1] = "TooLongDidNotRead (" + CharacterMoves.TooLongDidNotReadCost + " mana)";
	    Game.OptionsTwo [2] = "Scorch (" + CharacterMoves.ScorchCost + " mana)";
	    Game.OptionsTwo [3] = "Pyroblast (" + CharacterMoves.PyroblastCost + " mana)";
	    Game.OptionsTwo [4] = "LivingFire (" + CharacterMoves.LivingFireCost + " mana)";
	    Game.ActionTwo [0] = Game.CharacterTwo + " attacks " + Game.CharacterOne + ".";
	    Game.ActionTwo [1] = "Kevin does not read.";
	    Game.ActionTwo [2] = "Kevin throws a tiny ball of fire at " + Game.CharacterOne + ".";
	    Game.ActionTwo [3] = "Kevin casts a huge fireball at " + Game.CharacterOne + ".";
	    Game.ActionTwo [4] = "Kevin turns " + Game.CharacterOne + " into a pillar of fire.";
	}
    }


    public static void ChooseLeo ()
    {
	if (Game.characterChoice == 1)
	{
	    Game.CharacterOne = "Leo";
	    Game.CharacterOneHP = CharacterStats.LeoHP;
	    Game.CharacterOneAttack = CharacterStats.LeoAttack;
	    Game.CharacterOneMana = CharacterStats.LeoMana;
	    Game.CharacterOneRegen = CharacterStats.LeoRegen;
	    Game.MovesOne = CharacterMoves.LeoMoves;
	    Game.MoveOneValue [0] = CharacterStats.LeoAttack;
	    Game.MoveOneValue [1] = CharacterMoves.Ambush;
	    Game.MoveOneValue [2] = CharacterMoves.DeathStare;
	    Game.MoveOneValue [3] = CharacterMoves.LeoMonade;
	    Game.MoveOneValue [4] = CharacterMoves.InviteToBed;
	    Game.MoveOneCost [0] = CharacterMoves.AttackCost;
	    Game.MoveOneCost [1] = CharacterMoves.AmbushCost;
	    Game.MoveOneCost [2] = CharacterMoves.DeathStareCost;
	    Game.MoveOneCost [3] = CharacterMoves.LeoMonadeCost;
	    Game.MoveOneCost [4] = CharacterMoves.InviteToBedCost;
	    Game.OptionsOne [0] = "Attack (" + CharacterMoves.AttackCost + " mana)";
	    Game.OptionsOne [1] = "Ambush (" + CharacterMoves.AmbushCost + " mana)";
	    Game.OptionsOne [2] = "DeathStare (" + CharacterMoves.DeathStareCost + " mana)";
	    Game.OptionsOne [3] = "LeoMonade (" + CharacterMoves.LeoMonadeCost + " mana)";
	    Game.OptionsOne [4] = "InviteToBed (" + CharacterMoves.InviteToBedCost + " mana)";
	    Game.ActionOne [0] = Game.CharacterOne + " attacks " + Game.CharacterTwo + ".";
	    Game.ActionOne [1] = "Leo ambushes " + Game.CharacterTwo + " from the nearby bush.";
	    Game.ActionOne [2] = "Leo stares at " + Game.CharacterTwo + " with deathly intent.";
	    Game.ActionOne [3] = "Leo is just being himself.";
	    Game.ActionOne [4] = "Leo invites " + Game.CharacterTwo + " to bed.";
	}
	else if (Game.characterChoice == 2)
	{
	    Game.CharacterTwo = "Leo";
	    Game.CharacterTwoHP = CharacterStats.LeoHP;
	    Game.CharacterTwoAttack = CharacterStats.LeoAttack;
	    Game.CharacterTwoMana = CharacterStats.LeoMana;
	    Game.CharacterTwoRegen = CharacterStats.LeoRegen;
	    Game.MovesTwo = CharacterMoves.LeoMoves;
	    Game.MoveTwoValue [0] = CharacterStats.LeoAttack;
	    Game.MoveTwoValue [1] = CharacterMoves.Ambush;
	    Game.MoveTwoValue [2] = CharacterMoves.DeathStare;
	    Game.MoveTwoValue [3] = CharacterMoves.LeoMonade;
	    Game.MoveTwoValue [4] = CharacterMoves.InviteToBed;
	    Game.MoveTwoCost [0] = CharacterMoves.AttackCost;
	    Game.MoveTwoCost [1] = CharacterMoves.AmbushCost;
	    Game.MoveTwoCost [2] = CharacterMoves.DeathStareCost;
	    Game.MoveTwoCost [3] = CharacterMoves.LeoMonadeCost;
	    Game.MoveTwoCost [4] = CharacterMoves.InviteToBedCost;
	    Game.OptionsTwo [0] = "Attack (" + CharacterMoves.AttackCost + " mana)";
	    Game.OptionsTwo [1] = "Ambush (" + CharacterMoves.AmbushCost + " mana)";
	    Game.OptionsTwo [2] = "DeathStare (" + CharacterMoves.DeathStareCost + " mana)";
	    Game.OptionsTwo [3] = "LeoMonade (" + CharacterMoves.LeoMonadeCost + " mana)";
	    Game.OptionsTwo [4] = "InviteToBed (" + CharacterMoves.InviteToBedCost + " mana)";
	    Game.ActionTwo [0] = Game.CharacterTwo + " attacks " + Game.CharacterOne + ".";
	    Game.ActionTwo [1] = "Leo ambushes " + Game.CharacterOne + " from the nearby bush.";
	    Game.ActionTwo [2] = "Leo stares at " + Game.CharacterOne + " with deathly intent.";
	    Game.ActionTwo [3] = "Leo is just being himself.";
	    Game.ActionTwo [4] = "Leo invites " + Game.CharacterOne + " to bed.";
	}
    }



    public static void ChooseJames ()
    {
	if (Game.characterChoice == 1)
	{
	    Game.CharacterOne = "James";
	    Game.CharacterOneHP = CharacterStats.JamesHP;
	    Game.CharacterOneAttack = CharacterStats.JamesAttack;
	    Game.CharacterOneMana = CharacterStats.JamesMana;
	    Game.CharacterOneRegen = CharacterStats.JamesRegen;
	    Game.MovesOne = CharacterMoves.JamesMoves;
	    Game.MoveOneValue [0] = CharacterStats.JamesAttack;
	    Game.MoveOneValue [1] = CharacterMoves.WorkHard;
	    Game.MoveOneValue [2] = CharacterMoves.Wise;
	    Game.MoveOneValue [3] = CharacterMoves.Program;
	    Game.MoveOneValue [4] = CharacterMoves.HighMark;
	    Game.MoveOneCost [0] = CharacterMoves.AttackCost;
	    Game.MoveOneCost [1] = CharacterMoves.WorkHardCost;
	    Game.MoveOneCost [2] = CharacterMoves.WiseCost;
	    Game.MoveOneCost [3] = CharacterMoves.ProgramCost;
	    Game.MoveOneCost [4] = CharacterMoves.HighMarkCost;
	    Game.OptionsOne [0] = "Attack (" + CharacterMoves.AttackCost + " mana)";
	    Game.OptionsOne [1] = "WorkHard (" + CharacterMoves.WorkHardCost + " mana)";
	    Game.OptionsOne [2] = "Wise (" + CharacterMoves.WiseCost + " mana)";
	    Game.OptionsOne [3] = "Program (" + CharacterMoves.ProgramCost + " mana)";
	    Game.OptionsOne [4] = "HighMark (" + CharacterMoves.HighMarkCost + " mana)";
	    Game.ActionOne [0] = Game.CharacterOne + " attacks " + Game.CharacterTwo + ".";
	    Game.ActionOne [1] = "James works very hard in class.";
	    Game.ActionOne [2] = "James is exceptionally wise.";
	    Game.ActionOne [3] = "James programs a deadly program.";
	    Game.ActionOne [4] = "James receives a perfect mark.";
	}
	else if (Game.characterChoice == 2)
	{
	    Game.CharacterTwo = "James";
	    Game.CharacterTwoHP = CharacterStats.JamesHP;
	    Game.CharacterTwoAttack = CharacterStats.JamesAttack;
	    Game.CharacterTwoMana = CharacterStats.JamesMana;
	    Game.CharacterTwoRegen = CharacterStats.JamesRegen;
	    Game.MovesTwo = CharacterMoves.JamesMoves;
	    Game.MoveTwoValue [0] = CharacterStats.JamesAttack;
	    Game.MoveTwoValue [1] = CharacterMoves.WorkHard;
	    Game.MoveTwoValue [2] = CharacterMoves.Wise;
	    Game.MoveTwoValue [3] = CharacterMoves.Program;
	    Game.MoveTwoValue [4] = CharacterMoves.HighMark;
	    Game.MoveTwoCost [0] = CharacterMoves.AttackCost;
	    Game.MoveTwoCost [1] = CharacterMoves.WorkHardCost;
	    Game.MoveTwoCost [2] = CharacterMoves.WiseCost;
	    Game.MoveTwoCost [3] = CharacterMoves.ProgramCost;
	    Game.MoveTwoCost [4] = CharacterMoves.HighMarkCost;
	    Game.OptionsTwo [0] = "Attack (" + CharacterMoves.AttackCost + " mana)";
	    Game.OptionsTwo [1] = "WorkHard (" + CharacterMoves.WorkHardCost + " mana)";
	    Game.OptionsTwo [2] = "Wise (" + CharacterMoves.WiseCost + " mana)";
	    Game.OptionsTwo [3] = "Program (" + CharacterMoves.ProgramCost + " mana)";
	    Game.OptionsTwo [4] = "HighMark (" + CharacterMoves.HighMarkCost + " mana)";
	    Game.ActionTwo [0] = Game.CharacterTwo + " attacks " + Game.CharacterOne + ".";
	    Game.ActionTwo [1] = "James works very hard in class.";
	    Game.ActionTwo [2] = "James is exceptionally wise.";
	    Game.ActionTwo [3] = "James programs a deadly program.";
	    Game.ActionTwo [4] = "James receives a perfect mark.";
	}
    }


    public static void ChooseCody ()
    {
	if (Game.characterChoice == 1)
	{
	    Game.CharacterOne = "Cody";
	    Game.CharacterOneHP = CharacterStats.CodyHP;
	    Game.CharacterOneAttack = CharacterStats.CodyAttack;
	    Game.CharacterOneMana = CharacterStats.CodyMana;
	    Game.CharacterOneRegen = CharacterStats.CodyRegen;
	    Game.MovesOne = CharacterMoves.CodyMoves;
	    Game.MoveOneValue [0] = CharacterStats.CodyAttack;
	    Game.MoveOneValue [1] = CharacterMoves.Calm;
	    Game.MoveOneValue [2] = CharacterMoves.FlyingKick;
	    Game.MoveOneValue [3] = CharacterMoves.FacePalm;
	    Game.MoveOneValue [4] = CharacterMoves.Calculus;
	    Game.MoveOneCost [0] = CharacterMoves.AttackCost;
	    Game.MoveOneCost [1] = CharacterMoves.CalmCost;
	    Game.MoveOneCost [2] = CharacterMoves.FlyingKickCost;
	    Game.MoveOneCost [3] = CharacterMoves.FacePalmCost;
	    Game.MoveOneCost [4] = CharacterMoves.CalculusCost;
	    Game.OptionsOne [0] = "Attack (" + CharacterMoves.AttackCost + " mana)";
	    Game.OptionsOne [1] = "Calm (" + CharacterMoves.CalmCost + " mana)";
	    Game.OptionsOne [2] = "FlyingKick (" + CharacterMoves.FlyingKickCost + " mana)";
	    Game.OptionsOne [3] = "FacePalm (" + CharacterMoves.FacePalmCost + " mana)";
	    Game.OptionsOne [4] = "Calculus (" + CharacterMoves.CalculusCost + " mana)";
	    Game.ActionOne [0] = Game.CharacterOne + " attacks " + Game.CharacterTwo + ".";
	    Game.ActionOne [1] = "Cody is very calm in every situation.";
	    Game.ActionOne [2] = "Cody jumps up and kicks " + Game.CharacterTwo + " in the face.";
	    Game.ActionOne [3] = "Cody facepalms at " + Game.CharacterTwo + ".";
	    Game.ActionOne [4] = "Cody uses the powers of calculus against " + Game.CharacterTwo + ".";
	}
	else if (Game.characterChoice == 2)
	{
	    Game.CharacterTwo = "Cody";
	    Game.CharacterTwoHP = CharacterStats.CodyHP;
	    Game.CharacterTwoAttack = CharacterStats.CodyAttack;
	    Game.CharacterTwoMana = CharacterStats.CodyMana;
	    Game.CharacterTwoRegen = CharacterStats.CodyRegen;
	    Game.MovesTwo = CharacterMoves.CodyMoves;
	    Game.MoveTwoValue [0] = CharacterStats.CodyAttack;
	    Game.MoveTwoValue [1] = CharacterMoves.Calm;
	    Game.MoveTwoValue [2] = CharacterMoves.FlyingKick;
	    Game.MoveTwoValue [3] = CharacterMoves.FacePalm;
	    Game.MoveTwoValue [4] = CharacterMoves.Calculus;
	    Game.MoveTwoCost [0] = CharacterMoves.AttackCost;
	    Game.MoveTwoCost [1] = CharacterMoves.CalmCost;
	    Game.MoveTwoCost [2] = CharacterMoves.FlyingKickCost;
	    Game.MoveTwoCost [3] = CharacterMoves.FacePalmCost;
	    Game.MoveTwoCost [4] = CharacterMoves.CalculusCost;
	    Game.OptionsTwo [0] = "Attack (" + CharacterMoves.AttackCost + " mana)";
	    Game.OptionsTwo [1] = "Calm (" + CharacterMoves.CalmCost + " mana)";
	    Game.OptionsTwo [2] = "FlyingKick (" + CharacterMoves.FlyingKickCost + " mana)";
	    Game.OptionsTwo [3] = "FacePalm (" + CharacterMoves.FacePalmCost + " mana)";
	    Game.OptionsTwo [4] = "Calculus (" + CharacterMoves.CalculusCost + " mana)";
	    Game.ActionTwo [0] = Game.CharacterTwo + " attacks " + Game.CharacterOne + ".";
	    Game.ActionTwo [1] = "Cody is very calm in every situation.";
	    Game.ActionTwo [2] = "Cody jumps up and kicks " + Game.CharacterOne + " in the face.";
	    Game.ActionTwo [3] = "Cody facepalms at " + Game.CharacterOne + ".";
	    Game.ActionTwo [4] = "Cody uses the powers of calculus against " + Game.CharacterOne + ".";
	}
    }


    public static void ChooseWilliam ()
    {
	if (Game.characterChoice == 1)
	{
	    Game.CharacterOne = "William";
	    Game.CharacterOneHP = CharacterStats.WilliamHP;
	    Game.CharacterOneAttack = CharacterStats.WilliamAttack;
	    Game.CharacterOneMana = CharacterStats.WilliamMana;
	    Game.CharacterOneRegen = CharacterStats.WilliamRegen;
	    Game.MovesOne = CharacterMoves.WilliamMoves;
	    Game.MoveOneValue [0] = CharacterStats.WilliamAttack;
	    Game.MoveOneValue [1] = CharacterMoves.Rage;
	    Game.MoveOneValue [2] = CharacterMoves.Tantrum;
	    Game.MoveOneValue [3] = CharacterMoves.Berserk;
	    Game.MoveOneValue [4] = CharacterMoves.TableFlip;
	    Game.MoveOneCost [0] = CharacterMoves.AttackCost;
	    Game.MoveOneCost [1] = CharacterMoves.RageCost;
	    Game.MoveOneCost [2] = CharacterMoves.TantrumCost;
	    Game.MoveOneCost [3] = CharacterMoves.BerserkCost;
	    Game.MoveOneCost [4] = CharacterMoves.TableFlipCost;
	    Game.OptionsOne [0] = "Attack (" + CharacterMoves.AttackCost + " mana)";
	    Game.OptionsOne [1] = "Rage (" + CharacterMoves.RageCost + " mana)";
	    Game.OptionsOne [2] = "Tantrum (" + CharacterMoves.TantrumCost + " mana)";
	    Game.OptionsOne [3] = "Berserk (" + CharacterMoves.BerserkCost + " mana)";
	    Game.OptionsOne [4] = "TableFlip (" + CharacterMoves.TableFlipCost + " mana)";
	    Game.ActionOne [0] = Game.CharacterOne + " attacks " + Game.CharacterTwo + ".";
	    Game.ActionOne [1] = "William rages at " + Game.CharacterTwo + ".";
	    Game.ActionOne [2] = "William throws a tantrum.";
	    Game.ActionOne [3] = "William goes berserk against " + Game.CharacterTwo + ".";
	    Game.ActionOne [4] = "William flips the table and whips it directly at " + Game.CharacterTwo + ".";
	}
	else if (Game.characterChoice == 2)
	{
	    Game.CharacterTwo = "William";
	    Game.CharacterTwoHP = CharacterStats.WilliamHP;
	    Game.CharacterTwoAttack = CharacterStats.WilliamAttack;
	    Game.CharacterTwoMana = CharacterStats.WilliamMana;
	    Game.CharacterTwoRegen = CharacterStats.WilliamRegen;
	    Game.MovesTwo = CharacterMoves.WilliamMoves;
	    Game.MoveTwoValue [0] = CharacterStats.WilliamAttack;
	    Game.MoveTwoValue [1] = CharacterMoves.Rage;
	    Game.MoveTwoValue [2] = CharacterMoves.Tantrum;
	    Game.MoveTwoValue [3] = CharacterMoves.Berserk;
	    Game.MoveTwoValue [4] = CharacterMoves.TableFlip;
	    Game.MoveTwoCost [0] = CharacterMoves.AttackCost;
	    Game.MoveTwoCost [1] = CharacterMoves.RageCost;
	    Game.MoveTwoCost [2] = CharacterMoves.TantrumCost;
	    Game.MoveTwoCost [3] = CharacterMoves.BerserkCost;
	    Game.MoveTwoCost [4] = CharacterMoves.TableFlipCost;
	    Game.OptionsTwo [0] = "Attack (" + CharacterMoves.AttackCost + " mana)";
	    Game.OptionsTwo [1] = "Rage (" + CharacterMoves.RageCost + " mana)";
	    Game.OptionsTwo [2] = "Tantrum (" + CharacterMoves.TantrumCost + " mana)";
	    Game.OptionsTwo [3] = "Berserk (" + CharacterMoves.BerserkCost + " mana)";
	    Game.OptionsTwo [4] = "TableFlip (" + CharacterMoves.TableFlipCost + " mana)";
	    Game.ActionTwo [0] = Game.CharacterTwo + " attacks " + Game.CharacterOne + ".";
	    Game.ActionTwo [1] = "William rages at " + Game.CharacterOne + ".";
	    Game.ActionTwo [2] = "William throws a tantrum.";
	    Game.ActionTwo [3] = "William goes berserk against " + Game.CharacterOne + ".";
	    Game.ActionTwo [4] = "William flips the table and whips it directly at " + Game.CharacterOne + ".";
	}
    }


    public static void ChooseNan ()
    {
	if (Game.characterChoice == 1)
	{
	    Game.CharacterOne = "Nan";
	    Game.CharacterOneHP = CharacterStats.NanHP;
	    Game.CharacterOneAttack = CharacterStats.NanAttack;
	    Game.CharacterOneMana = CharacterStats.NanMana;
	    Game.CharacterOneRegen = CharacterStats.NanRegen;
	    Game.MovesOne = CharacterMoves.NanMoves;
	    Game.MoveOneValue [0] = CharacterStats.NanAttack;
	    Game.MoveOneValue [1] = CharacterMoves.Logic;
	    Game.MoveOneValue [2] = CharacterMoves.RighteousFury;
	    Game.MoveOneValue [3] = CharacterMoves.LanceOfLonginus;
	    Game.MoveOneValue [4] = CharacterMoves.Ascension;
	    Game.MoveOneCost [0] = CharacterMoves.AttackCost;
	    Game.MoveOneCost [1] = CharacterMoves.LogicCost;
	    Game.MoveOneCost [2] = CharacterMoves.RighteousFuryCost;
	    Game.MoveOneCost [3] = CharacterMoves.LanceOfLonginusCost;
	    Game.MoveOneCost [4] = CharacterMoves.AscensionCost;
	    Game.OptionsOne [0] = "Attack (" + CharacterMoves.AttackCost + " mana)";
	    Game.OptionsOne [1] = "Logic (" + CharacterMoves.LogicCost + " mana)";
	    Game.OptionsOne [2] = "RighteousFury (" + CharacterMoves.RighteousFuryCost + " mana)";
	    Game.OptionsOne [3] = "LanceOfLonginus (" + CharacterMoves.LanceOfLonginusCost + " mana)";
	    Game.OptionsOne [4] = "Ascension (" + CharacterMoves.AscensionCost + " mana)";
	    Game.ActionOne [0] = Game.CharacterOne + " attacks " + Game.CharacterTwo + ".";
	    Game.ActionOne [1] = "Nan uses the power of logic to smite " + Game.CharacterTwo + ".";
	    Game.ActionOne [2] = "Nan activates righteous fury.";
	    Game.ActionOne [3] = "Nan hurls the holy Lance of Longinus at " + Game.CharacterTwo + ".";
	    Game.ActionOne [4] = "Nan ascends into a higher existence.";
	}
	else if (Game.characterChoice == 2)
	{
	    Game.CharacterTwo = "Nan";
	    Game.CharacterTwoHP = CharacterStats.NanHP;
	    Game.CharacterTwoAttack = CharacterStats.NanAttack;
	    Game.CharacterTwoMana = CharacterStats.NanMana;
	    Game.CharacterTwoRegen = CharacterStats.NanRegen;
	    Game.MovesTwo = CharacterMoves.NanMoves;
	    Game.MoveTwoValue [0] = CharacterStats.NanAttack;
	    Game.MoveTwoValue [1] = CharacterMoves.Logic;
	    Game.MoveTwoValue [2] = CharacterMoves.RighteousFury;
	    Game.MoveTwoValue [3] = CharacterMoves.LanceOfLonginus;
	    Game.MoveTwoValue [4] = CharacterMoves.Ascension;
	    Game.MoveTwoCost [0] = CharacterMoves.AttackCost;
	    Game.MoveTwoCost [1] = CharacterMoves.LogicCost;
	    Game.MoveTwoCost [2] = CharacterMoves.RighteousFuryCost;
	    Game.MoveTwoCost [3] = CharacterMoves.LanceOfLonginusCost;
	    Game.MoveTwoCost [4] = CharacterMoves.AscensionCost;
	    Game.OptionsTwo [0] = "Attack (" + CharacterMoves.AttackCost + " mana)";
	    Game.OptionsTwo [1] = "Logic (" + CharacterMoves.LogicCost + " mana)";
	    Game.OptionsTwo [2] = "RighteousFury (" + CharacterMoves.RighteousFuryCost + " mana)";
	    Game.OptionsTwo [3] = "LanceOfLonginus (" + CharacterMoves.LanceOfLonginusCost + " mana)";
	    Game.OptionsTwo [4] = "Ascension (" + CharacterMoves.AscensionCost + " mana)";
	    Game.ActionTwo [0] = Game.CharacterTwo + " attacks " + Game.CharacterOne + ".";
	    Game.ActionTwo [1] = "Nan uses the power of logic to smite " + Game.CharacterOne + ".";
	    Game.ActionTwo [2] = "Nan activates righteous fury.";
	    Game.ActionTwo [3] = "Nan hurls the holy Lance of Longinus at " + Game.CharacterOne + ".";
	    Game.ActionTwo [4] = "Nan ascends into a higher existence.";
	}
    }


    public static void ChooseBrian ()
    {
	if (Game.characterChoice == 1)
	{
	    Game.CharacterOne = "Brian";
	    Game.CharacterOneHP = CharacterStats.BrianHP;
	    Game.CharacterOneAttack = CharacterStats.BrianAttack;
	    Game.CharacterOneMana = CharacterStats.BrianMana;
	    Game.CharacterOneRegen = CharacterStats.BrianRegen;
	    Game.MovesOne = CharacterMoves.BrianMoves;
	    Game.MoveOneValue [0] = CharacterStats.BrianAttack;
	    Game.MoveOneValue [1] = CharacterMoves.Skip;
	    Game.MoveOneValue [2] = CharacterMoves.Smash;
	    Game.MoveOneValue [3] = CharacterMoves.Strangle;
	    Game.MoveOneValue [4] = CharacterMoves.Obliterate;
	    Game.MoveOneCost [0] = CharacterMoves.AttackCost;
	    Game.MoveOneCost [1] = CharacterMoves.SkipCost;
	    Game.MoveOneCost [2] = CharacterMoves.SmashCost;
	    Game.MoveOneCost [3] = CharacterMoves.StrangleCost;
	    Game.MoveOneCost [4] = CharacterMoves.ObliterateCost;
	    Game.OptionsOne [0] = "Attack (" + CharacterMoves.AttackCost + " mana)";
	    Game.OptionsOne [1] = "Skip (" + CharacterMoves.SkipCost + " mana)";
	    Game.OptionsOne [2] = "Smash (" + CharacterMoves.SmashCost + " mana)";
	    Game.OptionsOne [3] = "Strangle (" + CharacterMoves.StrangleCost + " mana)";
	    Game.OptionsOne [4] = "Obliterate (" + CharacterMoves.ObliterateCost + " mana)";
	    Game.ActionOne [0] = Game.CharacterOne + " attacks " + Game.CharacterTwo + ".";
	    Game.ActionOne [1] = "Brian skips class altogether.";
	    Game.ActionOne [2] = "Brian smashes" + Game.CharacterTwo + ".";
	    Game.ActionOne [3] = "Brian strangles " + Game.CharacterTwo + ".";
	    Game.ActionOne [4] = "Brian obliterates " + Game.CharacterTwo + ".";
	}
	else if (Game.characterChoice == 2)
	{
	    Game.CharacterTwo = "Brian";
	    Game.CharacterTwoHP = CharacterStats.BrianHP;
	    Game.CharacterTwoAttack = CharacterStats.BrianAttack;
	    Game.CharacterTwoMana = CharacterStats.BrianMana;
	    Game.CharacterTwoRegen = CharacterStats.BrianRegen;
	    Game.MovesTwo = CharacterMoves.BrianMoves;
	    Game.MoveTwoValue [0] = CharacterStats.BrianAttack;
	    Game.MoveTwoValue [1] = CharacterMoves.Skip;
	    Game.MoveTwoValue [2] = CharacterMoves.Smash;
	    Game.MoveTwoValue [3] = CharacterMoves.Strangle;
	    Game.MoveTwoValue [4] = CharacterMoves.Obliterate;
	    Game.MoveTwoCost [0] = CharacterMoves.AttackCost;
	    Game.MoveTwoCost [1] = CharacterMoves.SkipCost;
	    Game.MoveTwoCost [2] = CharacterMoves.SmashCost;
	    Game.MoveTwoCost [3] = CharacterMoves.StrangleCost;
	    Game.MoveTwoCost [4] = CharacterMoves.ObliterateCost;
	    Game.OptionsTwo [0] = "Attack (" + CharacterMoves.AttackCost + " mana)";
	    Game.OptionsTwo [1] = "Skip (" + CharacterMoves.SkipCost + " mana)";
	    Game.OptionsTwo [2] = "Smash (" + CharacterMoves.SmashCost + " mana)";
	    Game.OptionsTwo [3] = "Strangle (" + CharacterMoves.StrangleCost + " mana)";
	    Game.OptionsTwo [4] = "Obliterate (" + CharacterMoves.ObliterateCost + " mana)";
	    Game.ActionTwo [0] = Game.CharacterTwo + " attacks " + Game.CharacterOne + ".";
	    Game.ActionTwo [1] = "Brian skips class altogether.";
	    Game.ActionTwo [2] = "Brian smashes" + Game.CharacterOne + ".";
	    Game.ActionTwo [3] = "Brian strangles " + Game.CharacterOne + ".";
	    Game.ActionTwo [4] = "Brian obliterates " + Game.CharacterOne + ".";
	}
    }


    public static void ChooseMario ()
    {
	if (Game.characterChoice == 1)
	{
	    Game.CharacterOne = "Mario";
	    Game.CharacterOneHP = CharacterStats.MarioHP;
	    Game.CharacterOneAttack = CharacterStats.MarioAttack;
	    Game.CharacterOneMana = CharacterStats.MarioMana;
	    Game.CharacterOneRegen = CharacterStats.MarioRegen;
	    Game.MovesOne = CharacterMoves.MarioMoves;
	    Game.MoveOneValue [0] = CharacterStats.MarioAttack;
	    Game.MoveOneValue [1] = CharacterMoves.Nice;
	    Game.MoveOneValue [2] = CharacterMoves.HardQuestion;
	    Game.MoveOneValue [3] = CharacterMoves.HardTest;
	    Game.MoveOneValue [4] = CharacterMoves.YouFail;
	    Game.MoveOneCost [0] = CharacterMoves.AttackCost;
	    Game.MoveOneCost [1] = CharacterMoves.NiceCost;
	    Game.MoveOneCost [2] = CharacterMoves.HardQuestionCost;
	    Game.MoveOneCost [3] = CharacterMoves.HardTestCost;
	    Game.MoveOneCost [4] = CharacterMoves.YouFailCost;
	    Game.OptionsOne [0] = "Attack (" + CharacterMoves.AttackCost + " mana)";
	    Game.OptionsOne [1] = "Nice (" + CharacterMoves.NiceCost + " mana)";
	    Game.OptionsOne [2] = "HardQuestion (" + CharacterMoves.HardQuestionCost + " mana)";
	    Game.OptionsOne [3] = "HardTest (" + CharacterMoves.HardTestCost + " mana)";
	    Game.OptionsOne [4] = "YouFail (" + CharacterMoves.YouFailCost + " mana)";
	    Game.ActionOne [0] = Game.CharacterOne + " attacks " + Game.CharacterTwo + ".";
	    Game.ActionOne [1] = "Mario feels like being nice today.";
	    Game.ActionOne [2] = "Mario asks " + Game.CharacterTwo + " a hard question.";
	    Game.ActionOne [3] = "Mario gives " + Game.CharacterTwo + " a hard test.";
	    Game.ActionOne [4] = "Mario decided that " + Game.CharacterTwo + " should fail the course.";
	}
	else if (Game.characterChoice == 2)
	{
	    Game.CharacterTwo = "Mario";
	    Game.CharacterTwoHP = CharacterStats.MarioHP;
	    Game.CharacterTwoAttack = CharacterStats.MarioAttack;
	    Game.CharacterTwoMana = CharacterStats.MarioMana;
	    Game.CharacterTwoRegen = CharacterStats.MarioRegen;
	    Game.MovesTwo = CharacterMoves.MarioMoves;
	    Game.MoveTwoValue [0] = CharacterStats.MarioAttack;
	    Game.MoveTwoValue [1] = CharacterMoves.Nice;
	    Game.MoveTwoValue [2] = CharacterMoves.HardQuestion;
	    Game.MoveTwoValue [3] = CharacterMoves.HardTest;
	    Game.MoveTwoValue [4] = CharacterMoves.YouFail;
	    Game.MoveTwoCost [0] = CharacterMoves.AttackCost;
	    Game.MoveTwoCost [1] = CharacterMoves.NiceCost;
	    Game.MoveTwoCost [2] = CharacterMoves.HardQuestionCost;
	    Game.MoveTwoCost [3] = CharacterMoves.HardTestCost;
	    Game.MoveTwoCost [4] = CharacterMoves.YouFailCost;
	    Game.OptionsTwo [0] = "Attack (" + CharacterMoves.AttackCost + " mana)";
	    Game.OptionsTwo [1] = "Nice (" + CharacterMoves.NiceCost + " mana)";
	    Game.OptionsTwo [2] = "HardQuestion (" + CharacterMoves.HardQuestionCost + " mana)";
	    Game.OptionsTwo [3] = "HardTest (" + CharacterMoves.HardTestCost + " mana)";
	    Game.OptionsTwo [4] = "YouFail (" + CharacterMoves.YouFailCost + " mana)";
	    Game.ActionTwo [0] = Game.CharacterTwo + " attacks " + Game.CharacterOne + ".";
	    Game.ActionTwo [1] = "Mario feels like being nice today.";
	    Game.ActionTwo [2] = "Mario asks " + Game.CharacterOne + " a hard question.";
	    Game.ActionTwo [3] = "Mario gives " + Game.CharacterOne + " a hard test.";
	    Game.ActionTwo [4] = "Mario decided that " + Game.CharacterOne + " should fail the course.";
	}
    }


    public static void ChooseJin ()
    {
	if (Game.characterChoice == 1)
	{
	    Game.CharacterOne = "Jin";
	    Game.CharacterOneHP = CharacterStats.JinHP;
	    Game.CharacterOneAttack = CharacterStats.JinAttack;
	    Game.CharacterOneMana = CharacterStats.JinMana;
	    Game.CharacterOneRegen = CharacterStats.JinRegen;
	    Game.MovesOne = CharacterMoves.JinMoves;
	    Game.MoveOneValue [0] = CharacterStats.JinAttack;
	    Game.MoveOneValue [1] = CharacterMoves.HeHe;
	    Game.MoveOneValue [2] = CharacterMoves.Shoot;
	    Game.MoveOneValue [3] = CharacterMoves.Snipe;
	    Game.MoveOneValue [4] = CharacterMoves.SnipeHead;
	    Game.MoveOneCost [0] = CharacterMoves.AttackCost;
	    Game.MoveOneCost [1] = CharacterMoves.HeHeCost;
	    Game.MoveOneCost [2] = CharacterMoves.ShootCost;
	    Game.MoveOneCost [3] = CharacterMoves.SnipeCost;
	    Game.MoveOneCost [4] = CharacterMoves.SnipeHeadCost;
	    Game.OptionsOne [0] = "Attack (" + CharacterMoves.AttackCost + " mana)";
	    Game.OptionsOne [1] = "HeHe (" + CharacterMoves.HeHeCost + " mana)";
	    Game.OptionsOne [2] = "Shoot (" + CharacterMoves.ShootCost + " mana)";
	    Game.OptionsOne [3] = "Snipe (" + CharacterMoves.SnipeCost + " mana)";
	    Game.OptionsOne [4] = "SnipeHead (" + CharacterMoves.SnipeHeadCost + " mana)";
	    Game.ActionOne [0] = Game.CharacterOne + " attacks " + Game.CharacterTwo + ".";
	    Game.ActionOne [1] = "Jin smirks at " + Game.CharacterTwo + ".";
	    Game.ActionOne [2] = "Jin shoots " + Game.CharacterTwo + " with an AK47.";
	    Game.ActionOne [3] = "Jin snipes " + Game.CharacterTwo + " with a sniper rifle.";
	    Game.ActionOne [4] = "Jin snipes " + Game.CharacterTwo + " in the head with an anti-tank sniper rifle.";
	}
	else if (Game.characterChoice == 2)
	{
	    Game.CharacterTwo = "Jin";
	    Game.CharacterTwoHP = CharacterStats.JinHP;
	    Game.CharacterTwoAttack = CharacterStats.JinAttack;
	    Game.CharacterTwoMana = CharacterStats.JinMana;
	    Game.CharacterTwoRegen = CharacterStats.JinRegen;
	    Game.MovesTwo = CharacterMoves.JinMoves;
	    Game.MoveTwoValue [0] = CharacterStats.JinAttack;
	    Game.MoveTwoValue [1] = CharacterMoves.HeHe;
	    Game.MoveTwoValue [2] = CharacterMoves.Shoot;
	    Game.MoveTwoValue [3] = CharacterMoves.Snipe;
	    Game.MoveTwoValue [4] = CharacterMoves.SnipeHead;
	    Game.MoveTwoCost [0] = CharacterMoves.AttackCost;
	    Game.MoveTwoCost [1] = CharacterMoves.HeHeCost;
	    Game.MoveTwoCost [2] = CharacterMoves.ShootCost;
	    Game.MoveTwoCost [3] = CharacterMoves.SnipeCost;
	    Game.MoveTwoCost [4] = CharacterMoves.SnipeHeadCost;
	    Game.OptionsTwo [0] = "Attack (" + CharacterMoves.AttackCost + " mana)";
	    Game.OptionsTwo [1] = "HeHe (" + CharacterMoves.HeHeCost + " mana)";
	    Game.OptionsTwo [2] = "Shoot (" + CharacterMoves.ShootCost + " mana)";
	    Game.OptionsTwo [3] = "Snipe (" + CharacterMoves.SnipeCost + " mana)";
	    Game.OptionsTwo [4] = "SnipeHead (" + CharacterMoves.SnipeHeadCost + " mana)";
	    Game.ActionTwo [0] = Game.CharacterTwo + " attacks " + Game.CharacterOne + ".";
	    Game.ActionTwo [1] = "Jin smirks at " + Game.CharacterOne + ".";
	    Game.ActionTwo [2] = "Jin shoots " + Game.CharacterOne + " with an AK47.";
	    Game.ActionTwo [3] = "Jin snipes " + Game.CharacterOne + " with a sniper rifle.";
	    Game.ActionTwo [4] = "Jin snipes " + Game.CharacterOne + " in the head with an anti-tank sniper rifle.";
	}
    }


    public static void Choose (int choice)
    {
	if (choice == 1)
	    ChooseAustin ();
	else if (choice == 2)
	    ChooseHarrish ();
	else if (choice == 3)
	    ChooseJason ();
	else if (choice == 4)
	    ChooseAllen ();
	else if (choice == 5)
	    ChooseKevin ();
	else if (choice == 6)
	    ChooseLeo ();
	else if (choice == 7)
	    ChooseJames ();
	else if (choice == 8)
	    ChooseCody ();
	else if (choice == 9)
	    ChooseWilliam ();
	else if (choice == 10)
	    ChooseNan ();
	else if (choice == 11)
	    ChooseBrian ();
	else if (choice == 12)
	    ChooseMario ();
	else if (choice == 13)
	    ChooseJin ();
    }
}


