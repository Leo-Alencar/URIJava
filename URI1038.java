import java.util.Scanner;

public class URI1038
{
    public static void main(String args[])
    {
        Scanner teclado;
        teclado = new Scanner(System.in);

        int a,b;
        double c;

        a = teclado.nextInt();
        b = teclado.nextInt();

        if(a == 1)
        {   
            c = b * 4.00;
            System.out.printf("Total: R$ %.2f\n",c);
        }
        else if(a == 2)
        {
            c = b * 4.50;
            System.out.printf("Total: R$ %.2f\n",c);
        }
        else if(a == 3)
        {
            c = b * 5.00;
            System.out.printf("Total: R$ %.2f\n",c);
        }
        else if(a == 4)
        {
            c = b * 2.00;
            System.out.printf("Total: R$ %.2f\n",c);
        }
        else if(a == 5)
        {
            c = b * 1.50;
            System.out.printf("Total: R$ %.2f\n",c);
        }
        teclado.close();
    }
}