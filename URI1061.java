import java.util.Scanner;

public class URI1061
{
    public static void main(String args[])
    {
        Scanner teclado;
        teclado = new Scanner(System.in);

        int diai,horai,mini,segi,diaf,horaf,minf,segf;

        String a1  = teclado.next();
        diai  = teclado.nextInt();
        horai = teclado.nextInt();
        String a2  = teclado.next();
        mini  = teclado.nextInt();
        String a3  = teclado.next();
        segi  = teclado.nextInt();
        String a4  = teclado.next();
        diaf  = teclado.nextInt();
        horaf = teclado.nextInt();
        String a5  = teclado.next();
        minf  = teclado.nextInt();
        String a6  = teclado.next();
        segf  = teclado.nextInt();

        int seginicial = diai*24*60*60 + horai*60*60 + mini*60 + segi - 24*60*60;
        int segfinal = diaf*24*60*60 + horaf*60*60 + minf*60 + segf - 24*60*60;

        int tempo = segfinal - seginicial;

        int dias  = tempo / 86400;
        int horas = (tempo % 86400) / 3600;
        int mins  = ((tempo % 86400) % 3600) / 60; 
        int segs  = ((tempo % 86400) % 3600) % 60;

        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(mins + " minuto(s)");
        System.out.println(segs + " segundo(s)");

        teclado.close();
    }
}