import java.util.Scanner;

public class Ex2
{
    public static void main(String args[])
    {
        Scanner teclado;
        teclado = new Scanner(System.in);

        int a,b,c,d;

        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        d = teclado.nextInt();

        if((a > b) && (c > d) && (a + b > c + d) && (a % 2 == 0) && (d % 2 == 0))
        {
            System.out.println("VIAVEIS");
        }
        else
        {
            System.out.println("INVIAVEIS");
        }
        teclado.close();
    }
}