import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("hey man wots ur name");
		String name = sc.nextLine();
		System.out.println("how bout' ur title");
		String title = sc.nextLine();
		System.out.println("pick your class you dnd or wow nerd (warrior, wizard, or rogue)");
		String wowclass = sc.nextLine();
	if(wowclass.equals("warrior"))
	{
		System.out.println("nice youre a warrior");
		System.out.println("ok well you have these traits for ur adventure, and you have 25 points to spend on these:");
		System.out.println("strength - ur stronk and can carry big stuff");
		System.out.println("dexterity - you can move quickly and speedy");
		System.out.println("intelligence - youre good at magic spells and youre smort");
		System.out.println("constitution - amount of base health");
		System.out.println("charisma - how cool you are");
		int ttlpnt = 25;
		System.out.println("now, you have 25 points to spend, how much do you want with strength? (only a max of 10 points btw)");
		int strength = sc.nextInt();
		if(strength>10)
		{
			System.out.println("plz put something between 0 and 10 ");
		}
		else
		{
		System.out.println("you now have "+(ttlpnt-strength)+" points left to spend");
		System.out.println("now pick ya dexterity, and remember only a number that is equal or less than 10");
		int dexterity = sc.nextInt();
		if(dexterity>10)
		{
			System.out.println("THATS THE WRONG NUMBA");
		}
		else
		{
		System.out.println("you now have "+((ttlpnt-strength)-dexterity)+" points to spend");
		System.out.println("guess whats next? yep, intelligence, or as they say in spanish class, intelligente");
		int intelligence = sc.nextInt();
		if(intelligence>10)
			{
				System.out.println("thats just so wrong, on like so many levels");
			}
		else
			{
				System.out.println("you now have "+(ttlpnt-(strength+dexterity+intelligence))+" points left to spend. spend wisely!");
				System.out.println("and nowwwwwww. .. . . . . constitution!!! ok dude pick a numba");
				int constitution = sc.nextInt();
				if(constitution>10)
				{
					System.out.println("how hard is it to pick 0-10, trash");
				}
				else
				{
					System.out.println("ok u got "+(ttlpnt-(strength+dexterity+intelligence+constitution))+" of these points left");
					System.out.println("yayyyy final trait, charisma!");
					int charisma = sc.nextInt();
					if(charisma>10)
					{
						System.out.println("cmon man you know its only 1-10");
					}
					else
					{
						System.out.println("and finally... you have "+(ttlpnt-(strength+dexterity+intelligence+constitution+charisma))+" points");
						System.out.println("anyway, these are your total trait points according to what order it was in, strength first and charisma last:");
						System.out.println(strength);
						System.out.println(dexterity);
						System.out.println(intelligence);
						System.out.println(constitution);
						System.out.println(charisma);
						System.out.println("also, youre a "+ wowclass +", and you are " +name+ " of " +title+". good luck on your journey!!");
					}
				}
			}
		}
		
	}
	}
	else if(wowclass.equals("wizard"))
	{
		System.out.println("nice youre a wizard");
		System.out.println("ok well you have these traits for ur adventure, and you have 25 points to spend on these:");
		System.out.println("strength - ur stronk and can carry big stuff");
		System.out.println("dexterity - you can move quickly and speedy");
		System.out.println("intelligence - youre good at magic spells and youre smort");
		System.out.println("constitution - amount of base health");
		System.out.println("charisma - how cool you are");
		int ttlpnt = 25;
		System.out.println("now, you have 25 points to spend, how much do you want with strength? (only a max of 10 points btw)");
		int strength = sc.nextInt();
		if(strength>10)
		{
			System.out.println("plz put something between 0 and 10 ");
		}
		else
		{
		System.out.println("you now have "+(ttlpnt-strength)+" points left to spend");
		System.out.println("now pick ya dexterity, and remember only a number that is equal or less than 10");
		int dexterity = sc.nextInt();
		if(dexterity>10)
		{
			System.out.println("THATS THE WRONG NUMBA");
		}
		else
		{
		System.out.println("you now have "+((ttlpnt-strength)-dexterity)+" points to spend");
		System.out.println("guess whats next? yep, intelligence, or as they say in spanish class, intelligente");
		int intelligence = sc.nextInt();
		if(intelligence>10)
			{
				System.out.println("thats just so wrong, on like so many levels");
			}
		else
			{
				System.out.println("you now have "+(ttlpnt-(strength+dexterity+intelligence))+" points left to spend. spend wisely!");
				System.out.println("and nowwwwwww. .. . . . . constitution!!! ok dude pick a numba");
				int constitution = sc.nextInt();
				if(constitution>10)
				{
					System.out.println("how hard is it to pick 0-10, trash");
				}
				else
				{
					System.out.println("ok u got "+(ttlpnt-(strength+dexterity+intelligence+constitution))+" of these points left");
					System.out.println("yayyyy final trait, charisma!");
					int charisma = sc.nextInt();
					if(charisma>10)
					{
						System.out.println("cmon man you know its only 1-10");
					}
					else
					{
						System.out.println("and finally... you have "+(ttlpnt-(strength+dexterity+intelligence+constitution+charisma))+" points");
						System.out.println("anyway, these are your total trait points according to what order it was in, strength first and charisma last:");
						System.out.println(strength);
						System.out.println(dexterity);
						System.out.println(intelligence);
						System.out.println(constitution);
						System.out.println(charisma);
						System.out.println("also, youre a "+ wowclass +", and you are " +name+ " of " +title+". good luck on your journey!!");
					}
				}
			}
		}
		
	}
	}
	else if(wowclass.equals("rogue"))
	{
		System.out.println("nice youre a rogue");
		System.out.println("ok well you have these traits for ur adventure, and you have 25 points to spend on these:");
		System.out.println("strength - ur stronk and can carry big stuff");
		System.out.println("dexterity - you can move quickly and speedy");
		System.out.println("intelligence - youre good at magic spells and youre smort");
		System.out.println("constitution - amount of base health");
		System.out.println("charisma - how cool you are");
		int ttlpnt = 25;
		System.out.println("now, you have 25 points to spend, how much do you want with strength? (only a max of 10 points btw)");
		int strength = sc.nextInt();
		if(strength>10)
		{
			System.out.println("plz put something between 0 and 10 ");
		}
		else
		{
		System.out.println("you now have "+(ttlpnt-strength)+" points left to spend");
		System.out.println("now pick ya dexterity, and remember only a number that is equal or less than 10");
		int dexterity = sc.nextInt();
		if(dexterity>10)
		{
			System.out.println("THATS THE WRONG NUMBA");
		}
		else
		{
		System.out.println("you now have "+((ttlpnt-strength)-dexterity)+" points to spend");
		System.out.println("guess whats next? yep, intelligence, or as they say in spanish class, intelligente");
		int intelligence = sc.nextInt();
		if(intelligence>10)
			{
				System.out.println("thats just so wrong, on like so many levels");
			}
		else
			{
				System.out.println("you now have "+(ttlpnt-(strength+dexterity+intelligence))+" points left to spend. spend wisely!");
				System.out.println("and nowwwwwww. .. . . . . constitution!!! ok dude pick a numba");
				int constitution = sc.nextInt();
				if(constitution>10)
				{
					System.out.println("how hard is it to pick 0-10, trash");
				}
				else
				{
					System.out.println("ok u got "+(ttlpnt-(strength+dexterity+intelligence+constitution))+" of these points left");
					System.out.println("yayyyy final trait, charisma!");
					int charisma = sc.nextInt();
					if(charisma>10)
					{
						System.out.println("cmon man you know its only 1-10");
					}
					else
					{
						System.out.println("and finally... you have "+(ttlpnt-(strength+dexterity+intelligence+constitution+charisma))+" points");
						System.out.println("anyway, these are your total trait points according to what order it was in, strength first and charisma last:");
						System.out.println(strength);
						System.out.println(dexterity);
						System.out.println(intelligence);
						System.out.println(constitution);
						System.out.println(charisma);
						System.out.println("also, youre a "+ wowclass +", and you are " +name+ " of " +title+". good luck on your journey!!");
					}
				}
			}
		}
		
	}
	}
		if(wowclass.equals("Warrior"))
	{
		System.out.println("nice youre a warrior");
		System.out.println("ok well you have these traits for ur adventure, and you have 25 points to spend on these:");
		System.out.println("strength - ur stronk and can carry big stuff");
		System.out.println("dexterity - you can move quickly and speedy");
		System.out.println("intelligence - youre good at magic spells and youre smort");
		System.out.println("constitution - amount of base health");
		System.out.println("charisma - how cool you are");
		int ttlpnt = 25;
		System.out.println("now, you have 25 points to spend, how much do you want with strength? (only a max of 10 points btw)");
		int strength = sc.nextInt();
		if(strength>10)
		{
			System.out.println("plz put something between 0 and 10 ");
		}
		else
		{
		System.out.println("you now have "+(ttlpnt-strength)+" points left to spend");
		System.out.println("now pick ya dexterity, and remember only a number that is equal or less than 10");
		int dexterity = sc.nextInt();
		if(dexterity>10)
		{
			System.out.println("THATS THE WRONG NUMBA");
		}
		else
		{
		System.out.println("you now have "+((ttlpnt-strength)-dexterity)+" points to spend");
		System.out.println("guess whats next? yep, intelligence, or as they say in spanish class, intelligente");
		int intelligence = sc.nextInt();
		if(intelligence>10)
			{
				System.out.println("thats just so wrong, on like so many levels");
			}
		else
			{
				System.out.println("you now have "+(ttlpnt-(strength+dexterity+intelligence))+" points left to spend. spend wisely!");
				System.out.println("and nowwwwwww. .. . . . . constitution!!! ok dude pick a numba");
				int constitution = sc.nextInt();
				if(constitution>10)
				{
					System.out.println("how hard is it to pick 0-10, trash");
				}
				else
				{
					System.out.println("ok u got "+(ttlpnt-(strength+dexterity+intelligence+constitution))+" of these points left");
					System.out.println("yayyyy final trait, charisma!");
					int charisma = sc.nextInt();
					if(charisma>10)
					{
						System.out.println("cmon man you know its only 1-10");
					}
					else
					{
						System.out.println("and finally... you have "+(ttlpnt-(strength+dexterity+intelligence+constitution+charisma))+" points");
						System.out.println("anyway, these are your total trait points according to what order it was in, strength first and charisma last:");
						System.out.println(strength);
						System.out.println(dexterity);
						System.out.println(intelligence);
						System.out.println(constitution);
						System.out.println(charisma);
						System.out.println("also, youre a "+ wowclass +", and you are " +name+ " of " +title+". good luck on your journey!!");
					}
				}
			}
		}
		
	}
	}
	else if(wowclass.equals("Wizard"))
	{
		System.out.println("nice youre a wizard");
		System.out.println("ok well you have these traits for ur adventure, and you have 25 points to spend on these:");
		System.out.println("strength - ur stronk and can carry big stuff");
		System.out.println("dexterity - you can move quickly and speedy");
		System.out.println("intelligence - youre good at magic spells and youre smort");
		System.out.println("constitution - amount of base health");
		System.out.println("charisma - how cool you are");
		int ttlpnt = 25;
		System.out.println("now, you have 25 points to spend, how much do you want with strength? (only a max of 10 points btw)");
		int strength = sc.nextInt();
		if(strength>10)
		{
			System.out.println("plz put something between 0 and 10 ");
		}
		else
		{
		System.out.println("you now have "+(ttlpnt-strength)+" points left to spend");
		System.out.println("now pick ya dexterity, and remember only a number that is equal or less than 10");
		int dexterity = sc.nextInt();
		if(dexterity>10)
		{
			System.out.println("THATS THE WRONG NUMBA");
		}
		else
		{
		System.out.println("you now have "+((ttlpnt-strength)-dexterity)+" points to spend");
		System.out.println("guess whats next? yep, intelligence, or as they say in spanish class, intelligente");
		int intelligence = sc.nextInt();
		if(intelligence>10)
			{
				System.out.println("thats just so wrong, on like so many levels");
			}
		else
			{
				System.out.println("you now have "+(ttlpnt-(strength+dexterity+intelligence))+" points left to spend. spend wisely!");
				System.out.println("and nowwwwwww. .. . . . . constitution!!! ok dude pick a numba");
				int constitution = sc.nextInt();
				if(constitution>10)
				{
					System.out.println("how hard is it to pick 0-10, trash");
				}
				else
				{
					System.out.println("ok u got "+(ttlpnt-(strength+dexterity+intelligence+constitution))+" of these points left");
					System.out.println("yayyyy final trait, charisma!");
					int charisma = sc.nextInt();
					if(charisma>10)
					{
						System.out.println("cmon man you know its only 1-10");
					}
					else
					{
						System.out.println("and finally... you have "+(ttlpnt-(strength+dexterity+intelligence+constitution+charisma))+" points");
						System.out.println("anyway, these are your total trait points according to what order it was in, strength first and charisma last:");
						System.out.println(strength);
						System.out.println(dexterity);
						System.out.println(intelligence);
						System.out.println(constitution);
						System.out.println(charisma);
						System.out.println("also, youre a "+ wowclass +", and you are " +name+ " of " +title+". good luck on your journey!!");
					}
				}
			}
		}
		
	}
	}
		else if(wowclass.equals("Rogue"))
	{
		System.out.println("nice youre a rogue");
		System.out.println("ok well you have these traits for ur adventure, and you have 25 points to spend on these:");
		System.out.println("strength - ur stronk and can carry big stuff");
		System.out.println("dexterity - you can move quickly and speedy");
		System.out.println("intelligence - youre good at magic spells and youre smort");
		System.out.println("constitution - amount of base health");
		System.out.println("charisma - how cool you are");
		int ttlpnt = 25;
		System.out.println("now, you have 25 points to spend, how much do you want with strength? (only a max of 10 points btw)");
		int strength = sc.nextInt();
		if(strength>10)
		{
			System.out.println("plz put something between 0 and 10 ");
		}
		else
		{
		System.out.println("you now have "+(ttlpnt-strength)+" points left to spend");
		System.out.println("now pick ya dexterity, and remember only a number that is equal or less than 10");
		int dexterity = sc.nextInt();
		if(dexterity>10)
		{
			System.out.println("THATS THE WRONG NUMBA");
		}
		else
		{
		System.out.println("you now have "+((ttlpnt-strength)-dexterity)+" points to spend");
		System.out.println("guess whats next? yep, intelligence, or as they say in spanish class, intelligente");
		int intelligence = sc.nextInt();
		if(intelligence>10)
			{
				System.out.println("thats just so wrong, on like so many levels");
			}
		else
			{
				System.out.println("you now have "+(ttlpnt-(strength+dexterity+intelligence))+" points left to spend. spend wisely!");
				System.out.println("and nowwwwwww. .. . . . . constitution!!! ok dude pick a numba");
				int constitution = sc.nextInt();
				if(constitution>10)
				{
					System.out.println("how hard is it to pick 0-10, trash");
				}
				else
				{
					System.out.println("ok u got "+(ttlpnt-(strength+dexterity+intelligence+constitution))+" of these points left");
					System.out.println("yayyyy final trait, charisma!");
					int charisma = sc.nextInt();
					if(charisma>10)
					{
						System.out.println("cmon man you know its only 1-10");
					}
					else
					{
						System.out.println("and finally... you have "+(ttlpnt-(strength+dexterity+intelligence+constitution+charisma))+" points");
						System.out.println("anyway, these are your total trait points according to what order it was in, strength first and charisma last:");
						System.out.println(strength);
						System.out.println(dexterity);
						System.out.println(intelligence);
						System.out.println(constitution);
						System.out.println(charisma);
						System.out.println("also, youre a "+ wowclass +", and you are " +name+ " of " +title+". good luck on your journey!!");
					}
				}
			}
		}
		
	}
	}
		else
	{
		System.out.println("say warrior, rogue, or wizard you monkey");
	}
	
}
}
