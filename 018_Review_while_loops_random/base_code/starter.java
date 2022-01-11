import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
Random rand = new Random();
System.out.println("helloo we are playing a practically impossible guessing game, pick a number! (0-1000)");
int guess = sc.nextInt();
int funinumber = rand.nextInt(1001);
while(true)
{
	if(guess==funinumber)
	{
		break;
	}
	guess = sc.nextInt();
	if(guess>funinumber)
	{
		System.out.println("ur wrong its too big");
	}
	else if(guess<funinumber)
	{
		System.out.println("ur wrong its too smol");
	}
	else if(guess==funinumber)
	{
		System.out.println("ur right idk how but ya congrats");
	}
}
}
}
