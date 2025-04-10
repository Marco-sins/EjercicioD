package paquete;

public class Util 
{
	public static int intlen(int n)
	{
		int i = 0;
		while (n > 0)
		{
			i++;
			n /= 10;
		}
		return (i);
	}
	
	public static int buscarNum(int n1, int n2, int len)
	{
		while (n1 > 0)
		{
			int n = n1 % 10;
			if (n == n2)
				return (len);
			len--;
			n1 /= 10;
		}
		System.out.println("El numero no esta");
		return (0);
	}
}
