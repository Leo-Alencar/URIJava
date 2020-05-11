import java.util.Scanner;

public class URI1073
{
    public static void main(String args[])
    {
        Scanner teclado;
        teclado = new Scanner(System.in);

        int a,res;

        a = teclado.nextInt();
        
        for(int i = 1; i <= a; i++)
        {
            if(i % 2 == 0)
            {
                res = i * i;
                System.out.println(i + "^2 = " + res);
            }
        }
        teclado.close();
    }
}