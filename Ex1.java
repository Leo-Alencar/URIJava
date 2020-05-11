import java.util.Scanner;

public class Ex1
{
    public static void main(String args[])
    {
        Scanner teclado;
        teclado = new Scanner(System.in);

        int a;

        a = teclado.nextInt();

        if(a % 2 == 0)
        {
            System.out.println("O numero eh par");
        }
        teclado.close();
    }
}