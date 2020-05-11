import java.util.Scanner;

public class URI1071
{
    public static void main(String args[])
    {
        Scanner teclado;
        teclado = new Scanner(System.in);

        int in1;
        int in2;
        int impars=0;

        in1  = teclado.nextInt();
        in2  = teclado.nextInt();

        int max;
        int min;

        if(in1 > in2)
        {
            max = in1;
            min = in2;
        }
        else
        {
            max = in2;
            min = in1;
        }

        for(int i=min+1;i < max;i++)
        {
            if(i % 2 != 0)
            {
                impars = impars + i;
            }
        }

        System.out.println(impars);

        teclado.close();
    }
}