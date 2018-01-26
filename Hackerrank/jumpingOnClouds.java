import java.util.*;
import java.lang.*;
import java.math.*;
class jumpingOnClouds
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int c[]=new int[n];
    int e=100;
    for(int i=0;i<n;i++)
    {
      c[i]=sc.nextInt();
    }
    for(int i=0;i<n;i+=k)
    {
      if(c[i]==0)
      e--;
      else if(c[i]==1)
      e-=3;
    }
    System.out.println(e);

  }
}
