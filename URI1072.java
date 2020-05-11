import java.util.Scanner;

public class URI1072
{
    public static void main(String args[])
    {
        Scanner teclado;
        teclado = new Scanner(System.in);

        int n;
        int in=0;
        int out=0;
        int num;

        n = teclado.nextInt();

        for(int i=1;i <= n;i++)
        {
            num = teclado.nextInt();
            if(num >= 10 && num <=20)
            {
                in++;
            }
            else
            {
                out++;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
        teclado.close();
    }
}