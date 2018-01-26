import java.util.*;
import java.lang.*;
class designerPDF
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int h[]=new int[26];
    for (int i=0;i<26 ;i++ )
    {
      h[i]=sc.nextInt();
    }
    String s=sc.next();
    char ch;
    int asc;
    int pos=0;
    int max=h[1];
    int l=s.length();
    for(int i=0;i<l;i++)
    {
      ch=s.charAt(i);
      asc=(int)ch;
      pos=asc-97;
      if(max<=h[pos])
      {
      max=h[pos];
      }
    }
    int ar=l*max;
    System.out.println(ar);
  }
}
