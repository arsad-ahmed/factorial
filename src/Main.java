import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Enter any number");
        Scanner scanner=new Scanner(System.in);
        int input=scanner.nextInt();

        long value=calculateFactorial(input);
        System.out.println(value);

    }

    public static long calculateFactorial(int n)
    {

        long result=1;
        if (n>1)
        {
            result=n*calculateFactorial(n-1);
        }
        return result;

    }
}