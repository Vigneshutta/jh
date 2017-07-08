import java.util.*;
import java.io.*;
public class Armstrongintervals
{
    public static void main(String[] args)throws IOException
    {
     int num1, num2, i, num, digit, sum;
    BufferedReader vc=new BufferedReader(new InputStreamReader(System.in));


  System.out.println("Enter first number:");
  num1=Integer.parseInt(vc.readLine());

  System.out.println("Enter second number:");
  num2=Integer.parseInt(vc.readLine());

  System.out.println("Armstrong numbers between"+num1+"and"+num2+"are:"); 
  for(i = num1; i <= num2; i++)
  {
        sum = 0;
        num = i;

        for(; num > 0; num /= 10)
        {
            digit = num % 10;
            sum = sum + digit * digit * digit;
        }

        if(sum == i)
        {
        System.out.println(i);
        }
  }
