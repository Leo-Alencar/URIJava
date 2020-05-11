import java.util.Scanner;

public class URI1143
{
    public static void main(String args[])
    {
        Scanner teclado;
        teclado = new Scanner(System.in);

        int in;
        int count=1;

        in = teclado.nextInt();

       for(int i=1; i <= in ; i++)
       {
            count = i;
            System.out.println(count + " " + count*count + " " + count*count*count);
       }

       teclado.close();
    }
}