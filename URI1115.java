import java.util.Scanner;

public class URI1115
{
    public static void main(String args[])
    {
        Scanner teclado;
        teclado = new Scanner(System.in);

        int x,y;
        String quad = " ";
       do
       {
            x = teclado.nextInt();
            y = teclado.nextInt();
            if(x != 0 && y != 0)
            {
                if(x > 0 && y > 0)
                {
                    quad = "primeiro";
                }
                else if(x > 0 && y < 0)
                {
                    quad = "quarto";
                }
                else if(x < 0 && y > 0)
                {
                    quad = "segundo";
                }
                else if(x < 0 && y < 0)
                {
                    quad = "terceiro";
                }

                System.out.println(quad);
            }
       }while(x != 0 && y != 0);

       teclado.close();
    }
}