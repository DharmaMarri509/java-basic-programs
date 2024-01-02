import java.util.Scanner;
class SimplePrograms 
{
	
	public static void main(String[] args) 
	{
		fibonacci();
		//palindrome();
		//prime();
		//factorial();
		//armstrong();
		//armstrong1();
		//reverse();
		//spyNumber();
		//perfectSquare();
		//reverseString();
		//nthPrime();
		// middleDigit();
		
		// d.display();
		 //SimplePrograms s=new SimplePrograms();
		
	}
																				//fibonacci
	public static void fibonacci(){
		int firstTerm=0,secondTerm=1,nextTerm;
		int a,i;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the no. of terms");
		a=obj.nextInt();
		System.out.println("the fibonacci series: ");
		for (i=1;i<=a;i++)
		{
			System.out.print(firstTerm+"  ");
			
			nextTerm=firstTerm+secondTerm;
			firstTerm=secondTerm;
			secondTerm=nextTerm;
		}
		System.out.println("");
		System.out.println("----------------------------------------------------- ");
	}
																					//palindrome
	public static void palindrome(){
		int n,reverse=0,remainder;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the no. to check :");
		n=obj.nextInt();
		int temp=n;
		while(n!=0)
		{
			remainder=n%10;
			reverse=reverse*10+remainder;
			n=n/10;
		}
		System.out.println("the reverse no is :"+reverse);
		if(reverse==temp)
		{
			System.out.println("the given number is palindrome number .");
		}
		else
			System.out.println("the given number is not a palindrome number .");
		System.out.println("---------------------------------------------------------");

	}
																				//to check prime number
	public static void prime(){
		int n,count=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number to check as prime number :");
		n=obj.nextInt();
		for (int i=2;i<=(n/2) ;i++ )
		{
			if(n%i==0)
				count++;
				
		}
		if (count==0)
		{
			System.out.println("the given number is a prime number.");
		}
		else
			System.out.println("the given number is not a prime number.");
	}
																					//factorial......
	public static void factorial(){
		int n,fact=1;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the value of n :");
		n=obj.nextInt();
		for (int i=1;i<=n ;i++ )
		{
			fact=fact*i;
		}
		System.out.println("the factorial of given number is :"+fact);
	}
																					//armstrong......
	public static void armstrong(){
		int n,count=0,sum=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number :");
		n=obj.nextInt();
		int i=n;
		int j=n;
		while(i!=0)
		{
			count++;
			i=i/10;
		}
		while(j!=0)
		{
			int remainder=j%10;
			sum=sum+(int) Math.pow(remainder,count);
			j=j/10;
		}
		if(sum==n)
			System.out.println(n +" is a armstrong number.");
		else
			System.out.println(n +" is not a armstrong number");
	}
																		//printing armstrong numbers upto n........
	public static void armstrong1(){
		int n;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number :");
		n=obj.nextInt();
		System.out.println("the armstrong numbers upto "+n);
		for (int p=1;p<=n ;p++ )
		{
			int sum=0,count=0;
			int i=p;
			int j=p;
			while(i!=0)
			{
				count++;
				i=i/10;
			}
			while(j!=0)
			{
				int remainder=j%10;
				sum=sum+(int) Math.pow(remainder,count);
				j=j/10;
			}
			if (sum==p)
			{
				System.out.println(p);
			}
		}
	}
	//															//reverse of a number...................
	public static void reverse(){
		int n,sum=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number :");
		n=obj.nextInt();
		int i=n;
		int remainder;
		while (i!=0){
			remainder=i%10;
			sum=sum*10+remainder;
			i=i/10;
		}
		System.out.println("the reverse of the given number :"+sum);

}
																	//spy number.......................
	public static void spyNumber(){
		int n;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number :");
		n=obj.nextInt();
		int sum=0,mult=1;
		int i=n;
		while(i!=0)
		{
			int remainder=i%10;
			sum=sum+remainder;
			mult=mult*remainder;
			i=i/10;
		}
		if (sum==mult)
		{
			System.out.println(n +" is a spy number.");
		}
		else
			System.out.println(n +" is not a spy number.");
		
	}
															//printing perfect square upto given range.........
	public static void perfectSquare(){
		int n;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number");
		n=obj.nextInt();
		System.out.println("the perfect sqaures in the given range are :");
		for (int i=1;i<=n ;i++ )
		{
			int p=i;
			for (int j=1;j<=p ;j++ )
			{
				if (p%j==0 && p/j==j)
				{
					System.out.println(p);
				}
			}
		}
	
	
	
	}
														//to find reverse of a given string.......................
	public static void reverseString(){
		String name;
		System.out.println("enter the string to be reversed :");
		Scanner obj=new Scanner(System.in);
		name=obj.nextLine();
		String reverse="";
		for(int i=name.length()-1;i>=0;i--){
			reverse=reverse+name.charAt(i);
		}
		System.out.println("the reverse string of "+name +" is "+reverse);
	}
															//to find nth prime number...........
	public static void nthPrime(){
		int n;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the value :");
		n=obj.nextInt();
		int num=1,count=1,i;
		while(count<=n)
		{
			num=num+1;
			for (i=2;i<=num ;i++ )
			{
				if (num%i==0)
				{
					break;
				}
			}
			if (i==num)
			{
				count=count+1;
			}
		}
		System.out.println("the "+n+ "th prime number is :"+num);
			
			
	}
																		//to find middle digit of a number........................
	public static void middleDigit(){
		int n;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number");
		n=obj.nextInt();
		int temp=n;
		int count=0;
		while(n!=0)
		{
			//int r=n%10;
			n=n/10;
			count+=1;
		}
		int j=0;
		for (int i=1;i<=(count/2)+1 ;i++ )
		{
			j=temp%10;
			temp=temp/10;
		}
		System.out.println("the middle digit of the given number is :"+j);
	}

	
	
 






}
