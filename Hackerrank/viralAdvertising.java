import java.util.*;
import java.lang.*;
class viralAdvertising
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i=5,j=0,d=0,l=0,s=0;
    while(j<n)
    {

      l=i/2;
      d=i-l;
      i=l*3;

      j++;
      s+=l;
    }
    System.out.println(s);
  }
}
