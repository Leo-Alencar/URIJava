import java.util.Scanner;

public class URI1079
{
    public static void main(String args[])
    {
        Scanner teclado;
        teclado = new Scanner(System.in);

        int x;
        float a,b,c;

        x = teclado.nextInt();
        
        for(int i = 1; i <= x; i++)
        {
            a = teclado.nextFloat();
            b = teclado.nextFloat();
            c = teclado.nextFloat();

            float res = (a*2+b*3+c*5)/10;

            System.out.printf("%.1f\n",res);
        }

        teclado.close();
    }
}