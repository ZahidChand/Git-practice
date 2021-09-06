import java.io.*;
import java.util.*;
class Number
{
	public static void main(String args[])
	{
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no");
		no = sc.nextInt();
		
		if(no<0)
		{
		try
			{
				throw new  NegativeException();
			}
		catch(NegativeException e)
			{
				System.out.println(e);
			}
		}
		else
		{
			if(no%2==0)
				{
					System.out.println(no+ " Is EVEN");
				}
			else
				{
					System.out.println(no+ " Is ODD");
				}
		}
	}
}
class NegativeException extends Exception
{
	NegativeException()
	{
		System.out.println("NO Is Negative");
	}
}

/* hkhgaedugj kgaejujtarhga; eklu ue kjaeyoiah/;as fdfadfgdfuad
faefdlu fyef
efeo uyfi

*/