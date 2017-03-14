public class Pascal 
{

    public static void main(String[]args) 
    {
    	for(int i =6;i>=1;i--)
    	{    		
	    		for (int j=1;j<=i;j++)
	    		{
	    			System.out.print("*");
	    		}
    		System.out.println("");
    	}
    	System.out.println("");
    	System.out.println("");
    	for(int x =1;x<=6;x++)
    	{    		
	    		for (int y=1;y<=x;y++)
	    		{
	    			System.out.print("*");
	    		}
    		System.out.println("");
    	}
    }
    
    
}