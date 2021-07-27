package intro;

import java.util.Scanner;

public class Employees
{
    String name,year,address;


    public void input()
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name,year of joining and address of the employee");
    name = sc.next();
    year = sc.next();
    address = sc.next();

}
public void display()
{
    System.out.format("%-15s%-20s%-15s%n",name,year,address);

}
    public static void main(String[] args)
    { int i;
        Employees[] e = new Employees[3];
        for( i=0; i<3; i++) {

            e[i] = new Employees();
            e[i].input();
        }

        System.out.format("%-15s%-20s%-15s%n","NAME","Year of joining","Address");
        for(i=0; i<3; i++)
        {
            e[i].display();
        }

    }
}
