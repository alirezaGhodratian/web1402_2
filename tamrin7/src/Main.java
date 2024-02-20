import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("plz add a number");
        Scanner number = new Scanner(System.in);
        int num=Integer.valueOf(number.nextLine());
        int temp =num;
        int res=0;

        while (num!=0)
        {
            int yekan =num%10;
            num/=10;

            res=res*10+yekan;

        }

        if (temp==res)
        {System.out.println("the number is symmetric number"); }
        else
        {System.out.println("the number is not symmetric number"); }

    }
}