import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class extraLongFactorials1 
{

    static void extraLongFactorials(int n)
    {
        BigInteger f = new BigInteger("1"); // Or BigInteger.ONE


        for (int i = 2; i <= n; i++)
            f = f.multiply(BigInteger.valueOf(i));
        System.out.println(f);
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        extraLongFactorials(n);
        in.close();
    }
}
