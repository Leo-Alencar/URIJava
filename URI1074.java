import java.util.Scanner;

public class URI1074
{
    public static void main(String args[])
    {
        Scanner teclado;
        teclado = new Scanner(System.in);

        int x,in;

        x = teclado.nextInt();
        
        for(int i = 1; i <= x; i++)
        {
            in = teclado.nextInt();
            if(in % 2 == 0)
            {
                if(in > 0)
                {
                    System.out.println("EVEN POSITIVE");  
                }
                else if(in < 0)
                {
                    System.out.println("EVEN NEGATIVE");
                }
                else
                {
                    System.out.println("NULL");
                }
            }
            else
            {
                if(in > 0)
                {
                    System.out.println("ODD POSITIVE");  
                }
                else
                {
                    System.out.println("ODD NEGATIVE");
                }
            }
        }
        teclado.close();
    }
}