import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("hey give me a number por favor");
	int num1 = sc.nextInt();
	System.out.println("anotha one plz");
	int num2 = sc.nextInt();
	if(num1 == num2)
	{
		System.out.println("theese aare eequal");
	}
	else
	{
		System.out.println("theese aint eequal");
	}
	System.out.println("ok give me ONE more number, last one");
	int num3 = sc.nextInt();
	
	if((num1>num2) && (num1>num3))
	{
		System.out.println("the first number, "+num1+" is greater than "+num2+" and "+num3);
	}
	else if((num2>num1) && (num2>num3))
	{
		System.out.println("the second number, "+num2+" is greater than "+num1+" and "+num3);
	}
	else if((num3>num1) && (num3>num2))
	{
		System.out.println("the last number, "+num3+" is greater than "+num1+" and "+num2);
	}
	else if ((num1 == num2) && (num2 == num3))
	{
		System.out.println("theyre all equal");
	}
	
	if((num1<num2) && (num1<num3))
	{
		System.out.println("the first number, "+num1+" is less than "+num2+" and "+num3);
	}
	else if((num2<num1) && (num2<num3))
	{
		System.out.println("the second number, "+num2+" is less than "+num1+" and "+num3);
	}
	else if((num3<num1) && (num3<num2))
	{
		System.out.println("the last number, "+num3+" is less than "+num1+" and "+num2);
	}
	else if ((num1 == num2) && (num2 == num3))
	{
		System.out.println("theyre all equal");
	}
}
	}
