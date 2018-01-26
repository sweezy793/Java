import java.util.*;
import java.lang.*;
import java.lang.Math.*;

class funnyString
{

  public static boolean isFunny(String s)
  {
  String r= new StringBuilder(s).reverse().toString();
  boolean isFunny=false;
  int j=1;
  while(Math.abs(s.charAt(j)-s.charAt(j-1))== Math.abs(r.charAt(j)-r.charAt(j-1)) && j<s.length())
  {
      j++;
      if(j==s.length())
      {
          isFunny=true;
          break;
      }
  }
  return isFunny;
}
public static void main(String[] args)
{

 Scanner in= new Scanner(System.in);
  int t = in.nextInt();
  for(int i=0;i<t;i++){
      String s = in.next();
       String r= new StringBuilder(s).reverse().toString();
      if(isFunny(s)==true)
           System.out.println("Funny");
       else
           System.out.println("Not Funny");
  }
}
}
