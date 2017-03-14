import java.util.Scanner;
public class Square 
{
	public static void main(String[]args) 
    {
       	int y =0,sum = 0,sum1 = 0,sum2 = 0;
        do
        {
            System.out.println("input math:");
            Scanner sc=new Scanner(System.in);
            int n =sc.nextInt();
            int i =0,j=0;
            if(n%2==1) 
            {
            	for(i = 1;i<n+1;i+=2)
            	{
            		sum1 = sum1+(i^2);
            		System.out.println("sum1="+sum1);	
            	}
            	
            }
            else if(n%2==0)
            {
            	for(j = 0;j<n+1;j+=2)
            	{
            		sum2 += (j^2);
            		System.out.println("sum2="+sum2);	
            	}            	
            }
            
            sum = sum1-(sum2);
            System.out.println("sum="+sum);
            y++;
            sum =0;
		}while(y>0);
	}
}