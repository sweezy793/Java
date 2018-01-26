import java.util.*;
import java.lang.Character.*;
class marsExploration
{
  public static void main(String[] args)
  {
      Scanner sc=new Scanner(System.in);
      int ctr=0;
      String s=sc.next();
      String str="SOS";
      for(int i=0;i<s.length();i++)
      {
        if(s.charAt(i)!=str.charAt(i%3))
        ctr++;
      }
      System.out.println(ctr);
  }
}
