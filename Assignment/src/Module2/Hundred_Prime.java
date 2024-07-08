package Module2;
/*
 * 
 * 
 * WAP to compute the sum of the first 100 prime numbers.
 */

public class Hundred_Prime {
public static void main(String[] args) {
	
    int i,j,sum=0; 
    
    for (i=1;i<=100;i++) {
    	int count=0;
    	for(j=2;j<=i/2;j++) {
    		if (i%j==0) {
    			count++;
    			break;
    		}
    		
    		
			}
    	if (count==0&& i!=1) {
    		 System.out.println("Prime Numbers :" +i);
    		sum=sum+i;
    		
    	}

    }
    System.out.println("prime number sum:"+sum);

	              
		}
}

