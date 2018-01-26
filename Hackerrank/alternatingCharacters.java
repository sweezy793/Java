import java.util.*;
import java.lang.*;
import java.lang.Math.*;

class alternatingCharacters
{

public static void main(String[] args)
{

 Scanner sc= new Scanner(System.in);
  int t = sc.nextInt();
  for(int i=0;i<t;i++)
  {
    String s=sc.next();
    int ctr=0;
    for(int j=1;j<s.length();j++)
    if(s.charAt(j-1)==s.charAt(j))
    {
      ctr++;
    }
    System.out.println(ctr);
  }
}
}
