//Wap to demo of n Even Numbers 
import java.util.Scanner;
class Mona
{  
    public static void main(String agrs[])
	{
	   int i,num;
	   int n =0;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("\n Enter Any Num :");
       num=sc.nextInt();	
	   System.out.println("\n N Even Numbers Are:");
	  for(i=1;i<=num;i++)
	   {
		   if(i%2==0)
		   {
			    System.out.println(i+" ");
				n=n+i;
		   }
	   }
	   System.out.println("\n Sum of Even Numbers Are:"+n);
    }
}
/*
*************OUTPUT**************

D:\GItHub>javac SumOfN_Natural_Even_Numbers.java

D:\GItHub>java Mona

 Enter Any Num :
18

 N Even Numbers Are:
2
4
6
8
10
12
14
16
18

 Sum of Even Numbers Are:90

D:\GItHub>*/