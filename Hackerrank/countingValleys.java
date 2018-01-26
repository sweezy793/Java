import java.util.*;
class countingValleys
{
  public static void main(String[] args)
  {
    ;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    sc.nextLine();
    String s=sc.next();
    int v=0;
    int lev=0;


    for(int i=0;i<n;i++)
    {
      if(s.charAt(i)=='U')
      {
        ++lev;
      }
      else if(s.charAt(i)=='D')
      {
        --lev;
      }

    if(lev==0&&s.charAt(i)=='U')
    ++v;
    }
    System.out.println(v);
  }
}
