//Wap to find Multiplication table of Given Numbers
import java.util.Scanner;
class Mona1
{  
    public static void main(String agrs[])
	{
	   int i,num;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("\n Enter Any Num :");
       num=sc.nextInt();	
	   for(i=1;i<=10;i++)
	   {
		 System.out.println((i*num));
	   }
    }
}
/*
***********OUTPUT**********

D:\GItHub>javac MultiplicationaTable_WhileLoop.java

D:\GItHub>java Mona1

 Enter Any Num :
12
12
24
36
48
60
72
84
96
108
120

D:\GItHub>*/