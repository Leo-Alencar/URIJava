import java.util.Scanner;

public class URI1065
{
    public static void main(String args[])
    {
        Scanner teclado;
        teclado = new Scanner(System.in);

        float in;
        int par=0;

        for(int i=1;i <=5;i++)
        {
            in  = teclado.nextFloat();
            if(in % 2 == 0)
            {
                par++;
            }
        }

        System.out.println(par + " valores pares");

        teclado.close();
    }
}