import java.util.*;
import java.lang.*;
class catsMouse
{
  public static void main(String[] args)
  {
    int q,x,y,z;
    Scanner sc=new Scanner(System.in);
    q=sc.nextInt();
    for(int i=0;i<q;i++)
    {
      x=sc.nextInt();
      y=sc.nextInt();
      z=sc.nextInt();
      if(Math.abs(x-z)>Math.abs(y-z))
      System.out.println("Cat B");
      else if(Math.abs(x-z)<Math.abs(y-z))
      System.out.println("Cat A");
      else if(Math.abs(x-z)==Math.abs(y-z))
      System.out.println("Mouse C");
    }
  }
}
