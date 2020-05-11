import java.util.Scanner;

public class URI1144
{
    public static void main(String args[])
    {
        Scanner teclado;
        teclado = new Scanner(System.in);

        int in;
        int x,y,z;
        x=0;
        y=1;
        z=1;

        in = teclado.nextInt();

       for(int i=1; i <= in ; i++)
       {
            x = x+1;
            y = x*x;
            z = x*x*x;
            System.out.println(x + " " + y + " " + z);
            y = y + 1;
            z = z + 1;
            System.out.println(x + " " + y + " " + z);
       }
       teclado.close();
    }
}