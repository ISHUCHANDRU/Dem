import java.io.*;
import java.util.*;
public class Positive
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n>0)
System.out.println("Positive");
 else if(n<0)
System.out.println("negative");
else if(n==0)
System.out.println("zero");
else
System.out.println("other");
}
}
