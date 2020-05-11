import java.util.Scanner;

public class URI1070
{
    public static void main(String args[])
    {
        Scanner teclado;
        teclado = new Scanner(System.in);

        int x;
        x = teclado.nextInt();
        int t = 1;
        
        for(int i = x; t <= 6; i++)
        {
            if(i % 2 != 0)
            {
                System.out.println(i);
                t++;
            }
        }
        teclado.close();
    }
}