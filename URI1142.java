import java.util.Scanner;

public class URI1142
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
            System.out.println(count + " " + ++count + " " + ++count + " PUM");
            count=count+2;
       }

       teclado.close();
    }
}