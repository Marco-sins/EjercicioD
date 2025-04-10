package paquete;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa un numero");
		int n1 = scan.nextInt();
		System.out.println("Ingresa un digito");
		int n2 = scan.nextInt();
		int len = Util.intlen(n1);
		int pos = Util.buscarNum(n1, n2, len);
		System.out.println("La longitud del numero es: " + len);
		System.out.println("La posicion del numero desde la izquierda es: " + pos);
		scan.close();
	}
	

}
