import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class dayOfProgrammer
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s;
        int y = in.nextInt();
        if(y==1918)
        {
            System.out.println("26.09.1918");
        }
        else if(y>=1700&&y<=1917)
        {
            if(y%4==0)
            {
                s=Integer.toString(y);
                System.out.println("12.09."+s);
            }
            else
            {
                s=Integer.toString(y);
                System.out.println("13.09."+s);
            }
        }
        else if(y>1917&&y<=2700)
        {
            if((y%400)==0||((y%4==0)&&(y%100!=0)))
            {
                s=Integer.toString(y);
                System.out.println("12.09."+s);
            }
            else
            {
                 s=Integer.toString(y);
                System.out.println("13.09."+s);
            }
        }
    }
}
