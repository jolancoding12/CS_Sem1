		import java.util.Random;



class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int rand_num1 = rand.nextInt(1200);
		System.out.println(rand_num1);
		
		int nein = rand.nextInt(10);
		System.out.println(nein);
		
		int onehundo = rand.nextInt(100)+1;
		System.out.println(onehundo);
		
		double fourteen = rand.nextDouble()+14+rand.nextInt(575);
		System.out.println(fourteen);
		
		double twopointfive = rand.nextDouble()+2.5;
		System.out.println(twopointfive);
		
	}
}
