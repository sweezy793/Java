import java.util.*;
import java.lang.*;
import java.lang.Math.*;

class beautifulBinaryString
{

public static void main(String[] args)
{

 Scanner sc= new Scanner(System.in);
  int n = sc.nextInt();
  String s=sc.next();

  String s1=s.replaceAll("010","");
  int l=(s.length()-s1.length())/3;
  System.out.println(l);
}
}
