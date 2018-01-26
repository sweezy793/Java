import java.util.*;
import java.lang.*;
class hurdleRace
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n,k,h,m=0;
    n=sc.nextInt();
    k=sc.nextInt();
    for(int i=0;i<n;i++)
    {
        h=sc.nextInt();
        if(h>m)
            m=h;
    }
      if(k>m)
      System.out.println("0");
      else
      System.out.println(m-k);

  }
}
