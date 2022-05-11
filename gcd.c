#include<stdio.h>
void main()
{
	int i=1,n1,n2,gcd,lcm;
	printf("enter the value of n1:");
	scanf("%d",&n1);
	printf("enter the value of n2:");
	scanf("%d",&n2);
	while(i<=n1 && i<=n2)
	{
		if(n1%i==0 && n2%i==0)
		{
			gcd=i;
			
		}
		i++;	
	}
	printf("the gcd is =%d",gcd);
	lcm=(n1*n2)/gcd;
	printf("the lcm of two numbers is =%d",lcm);	

	
}

