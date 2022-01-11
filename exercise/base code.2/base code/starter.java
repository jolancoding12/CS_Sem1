class starter {
	public static void main(String args[]) {
	
	int a = 4;
	int b = 3;
	int d = a+b;
	int c = a*b;
	
	int ans1 = c*d%a+b;
	int ans2 = ((-a)+d)%c;
	int ans3 = ((a/b)*c)-d;
	int ans4 = ((-a)-(-b))*(c%d)+a;
	
	System.out.print(ans4);
	
	}
}