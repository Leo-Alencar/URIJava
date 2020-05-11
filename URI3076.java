import java.io.*;

public class URI3076
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader linha = new BufferedReader(new InputStreamReader(System.in));

        String input = linha.readLine();
        
        while(input != null)
        {
            int x = Integer.parseInt(input);

            if(x % 100 == 0)
            {
                System.out.println(x/100);
            }
            else
            {
                System.out.println((x/100)+1);
            }
            input = linha.readLine();
        }
    }
}