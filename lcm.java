import java.util.*;
class LCM
{
	public  static void main(String args[])
	{
		System.out.println("Enter your two numbers for LCM:");
		Scanner scan=new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int c=0,i=1,lcm=1;
		for(i=2;i<=num1 && i<=num2;i++)
		{
			while(num1%i==0 && num2%i==0)
			{
				if(num1%i==0 && num2%i==0 )
				{
					lcm*=i;
					num1=num1/i;
                                		          num2=num2/i;				}	
			}
		} 
		lcm=lcm*num1*num2;
		System.out.println(lcm+"is the lcm f two numbers");
	}
}
