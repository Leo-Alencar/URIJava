import java.util.Scanner;

public class URI1134
{
    public static void main(String args[])
    {
        Scanner teclado;
        teclado = new Scanner(System.in);

        int com;
        int al=0;
        int gas=0;
        int die=0;

       do
       {
            com = teclado.nextInt();

            if(com >= 1 && com <= 3)
            {
                if(com == 1 )
                {
                    al++;
                }
                else if(com == 2 )
                {
                    gas++;
                }
                else if(com == 3 )
                {
                    die++;
                }
            }
       }while(com != 4);

       System.out.println("MUITO OBRIGADO");
       System.out.println("Alcool: "+al);
       System.out.println("Gasolina: "+gas);
       System.out.println("Diesel: "+die);

       teclado.close();

    }
}