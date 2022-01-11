import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner kek = new Scanner(System.in);
		Random geg = new Random();
		System.out.println("number please, 1-1000");
		int num1 = kek.nextInt();
		int num1_rand = geg.nextInt(1+999);
		if(num1==num1_rand)
		{
			System.out.println("nice");
		}
		else
		{
			System.out.println("what a loser");
			
		}
		}
}
