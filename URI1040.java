import java.util.Scanner;

public class URI1040
{
    public static void main(String args[])
    {
        Scanner teclado;
        teclado = new Scanner(System.in);

        float a,b,c,d,ex,medi,medf;

        a = teclado.nextFloat();
        b = teclado.nextFloat();
        c = teclado.nextFloat();
        d = teclado.nextFloat();

        medi = (a*2+b*3+c*4+d*1)/10;

        if(medi >= 5 && medi <= 6.9)
        {
            ex = teclado.nextFloat();
            medf = (ex + medi)/2;
            System.out.printf("Media: %.1f\n",medi);
            System.out.println("Aluno em exame.");
            System.out.printf("Nota do exame: %.1f\n",ex);
            if(medf >= 5)
            {
                System.out.println("Aluno aprovado.");
            }
            else
            {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n",medf);
        }
        else
        {
            System.out.printf("Media: %.1f\n",medi);
            if(medi >= 7)
            {
                System.out.println("Aluno aprovado.");
            }
            else
            {
                System.out.println("Aluno reprovado.");
            }
          
        }
        teclado.close();
    }
}