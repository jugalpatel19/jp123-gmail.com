package Module2;
/*
 * 
 * W.A.J.P to check given number is Armstrong or not?  test
 */

public class ArmstrongNumber {
	public static void main(String[] args) {
		for(int i=1;i<=500;i++)
		{
			int number=i;
			int originalnum=number;
			int sum=0;
			int digit;
			while (number>0) {
				digit=number%10;
				sum+=digit*digit*digit;
				number/=10;
			
			}
			if(sum==originalnum)
			{
				System.out.println(originalnum);
			}
		}
	
	}

}
