import java.util.*;
import java.lang.*;
import java.math.*;
class beautifulDays
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int i,j,k,ctr=0;
    i=sc.nextInt();
    j=sc.nextInt();
    k=sc.nextInt();
    for(int a=i;j>a;a++)
    {
      StringBuilder sb=new StringBuilder();
      sb.append(a);
      sb=sb.reverse();
      String s=sb.toString();
      int r=Integer.parseInt(s);
      if(Math.abs((a-r)%k)==0)
      {
        ctr++;
      }
    }
    System.out.println(ctr);
  }
  }
