import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class bonApetit
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        int s=0;
        for(int i = 0;i < n;i++)
        {
            ar[i] = in.nextInt();
        }
        int b = in.nextInt();
        for(int i=0;i<n;i++)
        {
            if(i!=k)
            s+=ar[i];
        }
        int si=s/2;
        if(b>si)
        {
            System.out.println(b-si);
        }
        else if(b==si)
        {
            System.out.println("Bon Appetit");
        }
    }
}
