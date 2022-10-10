import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Podaj n:");


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("Zadanie 1a. \n");

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {System.out.print("*");}
            System.out.println();
        }

        System.out.println();
        System.out.println("Zadanie 1b. \n");

        for(int i=n;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {System.out.print("*");}
            System.out.println();
        }

        System.out.println();
        System.out.println("Zadanie 1c. \n");

        for(int i=n;i>0;i--)
        {
            for(int j=0;j<n;j++)
            {
                if(j >= i - 1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Zadanie 1b. \n");

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j>=i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        }



}