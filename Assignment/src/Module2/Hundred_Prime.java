package Module2;
/*
 * 
 * 
 * WAP to compute the sum of the first 100 prime numbers.
 */

public class Hundred_Prime {
public static void main(String[] args) {
	

//	int count=0,sum = 0;
//	for (int i = 1; i <= 100; i++) {
//		count++;
//		for (int j = 2; j <= i/2; j++) {
//			if(i %j==0)
//			{
//				count++;
//				break;
//			}
//		}
//		if(count == 0 && i != 1) {
//			sum=sum+i;
//		}
//	}
//
//	System.out.println("The Sum of Prime Numbers from 1 to 100 is: " + sum);

	int i, number = 1, count, sum =0; {
			
			while(number <= 100)
			{
				count = 0;
				i = 2;
			    while(i <= number/2 )
			    {
			    	if(number % i == 0)
			    	{
			    		count++;
			    		break;
			    	}
			    	i++;
			    }
			    if(count == 0 && number != 1 )
			    {
			    	sum = sum + number;
			    }
			    number++;
			}
	                System.out.println("\n The Sum of Prime Numbers from 1 to 100 = " + sum);
		}
}
}

