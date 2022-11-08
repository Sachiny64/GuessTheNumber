/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int R = (int)(Math.random()*99+1);
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Emter the num below 100");
	    int N = sc.nextInt();
	    int C = 1;
	    while(N != R){
	        C++;
	        if(N<R)
	        System.out.println(N+" " + "is small");
	        else
	        System.out.println(N+" "+ "is greater");
	        System.out.println("Enter another number");
	        N = sc.nextInt();
	    }
	    if(C==1)
	    System.out.println("***\nCongratulation!!");
	    else if(C==2)
	    System.out.println("*\nCongratulation!!");
	    else if(C==3)
	     System.out.println("*\nCongratulation!!");
	     else
	      System.out.println("you Win");
		
	}
}
