package inter;

import java.util.Scanner;

public class swap
{
 static Scanner d=new Scanner(System.in);
 public static void main(String[] args) {
	System.out.println("enter first value");
	int a=d.nextInt();
	System.out.println("enter second number");
	int b=d.nextInt();
	System.out.println("before swap");
	System.out.println("a value:"+a);
	System.out.println("b value:"+b);
	a=a+b;
	b=a-b;
	a=a-b; 
	System.out.println("after swap");
	System.out.println("a value:"+a);
	System.out.println("b value:"+b);
	
}
}
