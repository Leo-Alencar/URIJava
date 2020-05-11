import java.util.Scanner;

public class URI1114
{
    public static void main(String args[])
    {
        Scanner teclado;
        teclado = new Scanner(System.in);

        int senha,in;
        senha = 2002;

       do
       {
            in = teclado.nextInt();
            if(in != senha)
            {
                System.out.println("Senha Invalida");
            }
       }while(in != senha);

       System.out.println("Acesso Permitido");

       teclado.close();
    }
}