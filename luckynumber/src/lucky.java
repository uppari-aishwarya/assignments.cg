import java.util.*;  
public class lucky 
{  
public static int count = 2;   
static boolean isLuckyNumber(int n)  
{  
if(count > n)  
return true;  
if(n%count == 0)  
return false;       
n = n-(n/count);   
count++;  
return isLuckyNumber(n);  
}  
public static void main (String args[])  
{  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the number: ");     
int num=sc.nextInt();  
if(isLuckyNumber(num))  
System.out.println(num+" is a Lucky Number.");  
else  
System.out.println(num+" is not a Lucky Number.");  
}  
}  


