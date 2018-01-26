import java.util.*;
import java.lang.*;
class utopianTree
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    int n;
    int h;
    for(int i=0;i<t;i++)
    {
      n=sc.nextInt();
      h=1;
      for(int j=0;j<n;j++)
      {
        if(j%2==0)
        h*=2;
        else
        h+=1;
      }
      System.out.println(h);
      }
    }
  }
