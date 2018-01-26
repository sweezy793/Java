import java.util.*;
import java.lang.Character.*;
class Pangrams
{
  public static void main(String[] args)
  {
      Scanner sc=new Scanner(System.in);
      int ctr=0;
      String str=sc.nextLine();
      char ch[]=new char[26];
      String s=str.toLowerCase();
      for(int i=0;i<s.length();i++)
      {
        if(s.charAt(i)>=97&&s.charAt(i)<=122)
        {
          if(ch[s.charAt(i)-97]==0)
          {
            ctr++;
            ch[s.charAt(i)-97]=1;
          }
        }
      }
      if(ctr==26)
      System.out.println("pangram");
      else
      System.out.println("not pangram");
  }
}
