import java.util.Scanner;

public class URI1078
{
    public static void main(String args[])
    {
        Scanner teclado;
        teclado = new Scanner(System.in);

        int x;

        x = teclado.nextInt();
        
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(i + " x " + x + " = " + i*x);
        }

        teclado.close();
    }
}