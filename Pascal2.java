import java.util.Scanner;
public class Pascal2 
{
    public static void main(String[]args) 
    {

        int y =0;
        do
        {
            System.out.println("input math:");
            Scanner sc=new Scanner(System.in);
            int n =sc.nextInt();                
            for(int i =n ;i>=1;i--)
            {           
                for (int j=1;j<=i;j++)
                {
                    System.out.print("*");
                }
                System.out.println("");                
            }
            y++;
        }while(y>0);           
    }
}