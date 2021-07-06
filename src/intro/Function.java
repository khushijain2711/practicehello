package intro;
import java.util.Scanner;
public class Function
{
    public static void calc(long m)
    {
        int y,d;
        y=(int)m/(365*24*60);
        d=(int)(m/60/24)%365;
        System.out.println(+m+" minutes is approximately "+y+" years and "+d+" days");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of minutes : ");
        long m = sc.nextLong();
        calc(m);

    }
}
