package intro;

import java.util.Scanner;

public class Switch
{
    public static void main(String[] args)
    {
        int ch;
        System.out.println("Pick a number\n1.Hi\n2.Hey\n3.Hello\nEnter your choice ");
        Scanner sc = new Scanner(System.in);
        ch = sc.nextInt();
        switch(ch)
        {
            case 1: System.out.println("You said Hi");
                    break;
            case 2: System.out.println("You said Hey");
                    break;
            case 3: System.out.println("You said Hello");
                    break;
            default:  System.out.println("Invalid choice!");
        }
    }

}
