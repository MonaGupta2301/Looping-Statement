//Wap to find n Natural Numbers
import java.util.Scanner;
class Mona1
{  
    public static void main(String agrs[])
	{
	   int i,num;
	   Scanner sc = new Scanner(System.in);
	   System.out.println("\n Enter Any Num :");
       num=sc.nextInt();	
	   System.out.println("\n N Natural Numbers Are:");
	  for(i=1;i<=num;i++)
	   {
		    System.out.println((i)+" ");
	   }
    }
}
/*
*******OUTPUT************

D:\GItHub>javac N_NaturalNumbers_ForLoop.java

D:\GItHub>java Mona1

 Enter Any Num :
12

 N Natural Numbers Are:
1
2
3
4
5
6
7
8
9
10
11
12

D:\GItHub>*/
