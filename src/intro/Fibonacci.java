package intro;

public class Fibonacci
{
    public static void main(String[] args)
    {
//      Printing first 10 fibonacci number
        int a=0,b=1,c;
        System.out.print(a+" "+b);
        for(int i = 1;i<=8;i++)
        {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
