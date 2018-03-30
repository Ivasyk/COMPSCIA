//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	Scanner meme = new Scanner(System.in);
	private int a, b, c;
	private double rootOne, rootTwo;

	public Quadratic()
	{
		System.out.println("Welcome to the quadratic calculator.");
		System.out.print("enter A: ");
		a = meme.nextInt();
		System.out.print("enter B: ");
		b = meme.nextInt();
		System.out.print("enter C: ");
		c = meme.nextInt();
	}
	public void setEquation(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;
	}

	public void calcRoots( )
	{
		rootOne = (-b + Math.sqrt(Math.pow(b, 2) - (4 * (a * c))))/(2 * a);
		rootTwo = (-b - Math.sqrt(Math.pow(b, 2) - (4 * (a * c))))/(2 * a);
	}

	public void print( )
	{
		System.out.println("Root One: " + rootOne);
		System.out.println("Root Two: " + rootTwo);
	}
}
