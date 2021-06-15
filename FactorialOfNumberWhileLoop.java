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
	   while(i<=num)
	   {
	     fact=fact*i;
		 i++;
	   }
	   System.out.println("\n Factorial of Number is :"+(fact));
    }
}
/*
********OUTPUT*********
D:\GItHub>javac FactorialOfNumberWhileLoop.java

D:\GItHub>java Mona1

 Enter Any Num :
20

 Factorial of Number is :-2102132736

D:\GItHub>*/