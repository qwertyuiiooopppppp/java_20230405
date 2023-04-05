package ex01;

public class Exam02 {

	public static void main(String[] args) {
		
		double d = 85.4;
		int score= 10;
		
		d= score;
	//  d=(double)score;
		System.out.println(d);
		d= 85.4;
		
		score=(int)d;
		System.out.println(score);

		int sum = 0;
		long longsum = 3000000000l;
		
		longsum = (long)sum;
		
		System.out.println(longsum);
		
		System.out.println();
	}

}
