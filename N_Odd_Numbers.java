//Wap to demo of n Even Numbers 
import java.util.Scanner;
class Mona
{  
    public static void main(String agrs[])
	{
	   int i,num;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("\n Enter Any Num :");
       num=sc.nextInt();	
	   System.out.println("\n N Odd Numbers Are:");
	  for(i=1;i<=num;i++)
	   {
		   if(!(i%2==0))
		   {
			    System.out.println(i+" ");
		   }
	   }




    }
}
/*
**********OUTPUT*********

D:\GItHub>javac N_Odd_Numbers.java

D:\GItHub>java Mona

 Enter Any Num :
20

 N Odd Numbers Are:
1
3
5
7
9
11
13
15
17
19

D:\GItHub>*/
