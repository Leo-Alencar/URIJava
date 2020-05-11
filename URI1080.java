import java.util.Scanner;

public class URI1080
{
    public static void main(String args[])
    {
        Scanner teclado;
        teclado = new Scanner(System.in);

        int x,maior,pos;

        maior = 0;
        pos = 0;
        
        for(int i = 1; i <= 100; i++)
        {
            x = teclado.nextInt();
            if (x > maior)
            {
                maior = x;
                pos = i;
            }
        }

        System.out.println(maior);
        System.out.println(pos);
        teclado.close();
    }
}