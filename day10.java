import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution 
{
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) 
    {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        
        int max = 0;
        int count = 0;

        while(n > 0)
            {
                if(n%2==1)
                    count++;
                else
                    count = 0;
                if(max<count)
                    max = count;
            n=n/2;
        }
        System.out.println(max);
    }
}