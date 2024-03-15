package cdac.info;

public class Que3 {

	public static void main(String[] args) {
		int num1 = 50;
		double num2 = 75.55; 
		float num3 = 80.11f;
		double sum = num3 + num2;
		double sum1 = num1 + num3;
		int sum2 = num1 + (int)num2;      //narrowing
		int sum3 = (int)num2 + (int)num3; //narrowing
		float sum4 = num1 + (float)num2;
		System.out.println("sum : "+sum );
		System.out.println("sum1 : "+sum1);
		System.out.println("sum3 : "+sum2 );
		System.out.println("sum3 : "+sum3);
		System.out.println("sum4 : "+sum4);
	}

}
