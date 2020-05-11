import java.util.Scanner;

public class URI1047
{
    public static void main(String args[])
    {
        Scanner teclado;
        teclado = new Scanner(System.in);

        float a,b,c,d;

        a = teclado.nextFloat();
        b = teclado.nextFloat();
        c = teclado.nextFloat();
        d = teclado.nextFloat();

        int hora,min;

        float h1 = a + (b/60);
        float h2 = c + (d/60);
        float h3 = h2 - h1;


        if(h3 == 0)
        {   
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }
        else
        {
            hora = (int) h3;
            min = (int) (h3-(float)hora)*60;
            System.out.println("O JOGO DUROU " + hora + " HORA(S) E " + min + " MINUTO(S)");
        }
        teclado.close();
    }
}