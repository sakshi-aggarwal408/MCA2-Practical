import java.util.Scanner;
class Ques1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Integer :");
		int n=sc.nextInt();
		for(int i=n-1;i>0;i--)
		{
			n=n*i;
		}
		System.out.println("FACTORIAL OF IS : "+n);;
		
	}
}