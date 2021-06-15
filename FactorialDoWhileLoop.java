//Wap to find Multiplication table of Given Numbers
import java.util.Scanner;
class Mona1
{  
    public static void main(String agrs[])
	{
	   int i=1,num,fact=1;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("\n Enter Any Num :");
       num=sc.nextInt();	
	  do
	   {
	     fact=fact*i;
		 i++;
	   } while(i<=num);
	   System.out.println("\n Factorial of Number is :"+(fact));
    }
}
/*
*********OUTPUT**********
D:\GItHub>javac FactorialDoWhileLoop.java

D:\GItHub>java Mona1

 Enter Any Num :
12

 Factorial of Number is :479001600

D:\GItHub>*/