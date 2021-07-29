package intro;

import java.util.Scanner;

public class Prime
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert any number");
        n=sc.nextInt();
        boolean is_prime = true;
        for(int i = 2;i<n;i++)
        {
            if(n%i==0)
            {
                is_prime=false;
                break;
            }

        }
        if(is_prime)
            System.out.println(n+" is a Prime number");
        else
            System.out.println(n+" is not a Prime number");

    }

}
