import java.util.*;
import java.lang.Character.*;
class camelcase
{
  public static void main(String[] args)
  {
      Scanner sc=new Scanner(System.in);
      String s=sc.next();
      int ctr=0;
      for(int i=0;i<s.length();i++)
      {
        char ch=s.charAt(i);
        if(Character.isUpperCase(ch))
        ctr++;
      }
      System.out.println(ctr+1);
  }
}
