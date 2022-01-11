import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("what first period");
		String first = sc.nextLine();
		System.out.println("what second period");
		String second = sc.nextLine();
		System.out.println("what third period");
		String third = sc.nextLine();
		
		System.out.println("what's ur gpa in " +first);
		int pone = sc.nextInt();
		System.out.println("what's ur gpa in " +second);
		int ptwo = sc.nextInt();
		System.out.println("what's ur gpa in " +third);
		int pthree = sc.nextInt();
		System.out.println(first+" - "+pone);
		System.out.println(second+" - "+ptwo);
		System.out.println(third+" - "+pthree);
		System.out.println("your gpa is " +((pone+ptwo+pthree)/3));
		
		
		


		
		
		
		
		
	}
}
