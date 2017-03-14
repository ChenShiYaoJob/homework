import java.util.Scanner;
public class Price 
{
    public static void main(String[] args) 
    {
    	ck :
    	System.out.println("請輸入工作時數:");
    	Scanner sc=new Scanner(System.in);
    	double t=sc.nextDouble();
    	double p =0;
    	
    	switch((t>=0&&t<=60)?1:(t>60&&t<=75)?2:(t>75)?3:4)
    	{
    		case 1 :
    			p=t*100;
    			System.out.println("price="+(int)p);
    			break;
    			
    		case 2 :
    			p = 60*100+(t-60)*100*1.5;
    			System.out.println("price="+(int)p);
    			break;
    			
    		case 3 :
    			p = 60*100+15*120+(t-75)*100*2.5;
    			System.out.println("price="+(int)p);
    			break;
    			
    		case 4 :
    			System.out.println("輸入錯誤");
    			break;
    	}
    }
    
    
}