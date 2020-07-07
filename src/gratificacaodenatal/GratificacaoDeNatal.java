package gratificacaodenatal;
import java.util.Scanner;
public class GratificacaoDeNatal 
{
    public static void main(String[] args) 
    {
        int exit = 1;
        while(exit != 0)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("número de horas extras?: ");
            int extras = sc.nextInt();
            System.out.println("número de horas falta?: ");
            int faltas = sc.nextInt();
            int h = (extras) -(2/3 * (faltas));
            if (h > 2400) System.out.println("500 reais");
            if (h > 1800 && h <= 2400) System.out.println("400 reais");
            if (h > 1200 && h <= 1800) System.out.println("300 reais");
            if (h > 599 && h <=1200) System.out.println("200 reais");
            if (h < 600) System.out.println("100 reais");
            System.out.println("sair? digite 0: ");
            exit = sc.nextInt();
        }
    }
}
