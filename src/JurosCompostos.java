import java.util.Scanner;

public class JurosCompostos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double capital;
        double taxa;
        int vezesAno;
        int anos;
        double montante;


        System.out.print("Qual o capital inicial?: ");
        capital = sc.nextDouble();

        System.out.print("Qual a taxa? (em %): ");
        taxa = sc.nextDouble() / 100;

        System.out.print("Número de vezes que os juros são aplicados por ano: ");
        vezesAno = sc.nextInt();

        System.out.print("Número de anos: ");
        anos = sc.nextInt();

        montante = capital * Math.pow(1 + taxa / vezesAno, vezesAno * anos);
        System.out.printf("O valor após %d anos será %.2f", anos, montante);

        sc.close();
    }
}
