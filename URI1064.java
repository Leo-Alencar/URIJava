import java.util.Scanner;

public class URI1064
{
    public static void main(String args[])
    {
        Scanner teclado;
        teclado = new Scanner(System.in);

        float in;
        float med = 0;
        int pos=0;


        for(int i=1;i <=6;i++)
        {
            in  = teclado.nextFloat();
            if(in > 0)
            {
                pos++;
                med = med+in;
            }
        }

        System.out.println(pos + " valores positivos");
        System.out.printf("%.1f\n",med/pos);

        teclado.close();
    }
}