import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("what name");
		String text = sc.nextLine();
		System.out.println("how old you are");
		int age = sc.nextInt();
		System.out.println("what month born?");
		int month = sc.nextInt();
		System.out.println("what day were you born");
		int day = sc.nextInt();
		System.out.println("what year were born");
		int year = sc.nextInt();
		System.out.println("how much one dollar fifty cents");
		double dollarfifty = sc.nextDouble();
		System.out.println("Your name is "+text+  " and you were born on "  +month+ "/" +day+ "/" +year);
		System.out.println("You're " +age+ " years old and a dollar fifty is " +dollarfifty);

	}
}
