import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner age = new Scanner(System.in);
        System.out.println("What is your age?");
        int userAge = age.nextInt();

        if (userAge >= 21)
        {
            System.out.println("Please take a wrist band");
        }
    }
}