
import fatec.poo.model.Retangulo;
import java.util.Scanner;

/**
 *
 * @author maria
 */
public class Aplic {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double medAlt, medBase;
        int opcao;

        System.out.println("Digite a medida da altura: ");
        medAlt = entrada.nextDouble();
        System.out.println("Digite a medida da base: ");
        medBase = entrada.nextDouble();

        Retangulo objRet = new Retangulo();

        objRet.setAltura(medAlt);
        objRet.setBase(medBase);

        do {
            System.out.println("\n\n1 - Consultar Área");
            System.out.println("2 - Consultar Perímetro");
            System.out.println("3 - Consultar diagonal");
            System.out.println("4 - Sair");
            System.out.println("\n\t\tDigite a opção: ");
            opcao = entrada.nextInt();

            if (opcao >= 1 && opcao <= 3) {
                System.out.println("\n \n Medida da altura: " + objRet.getAltura());
                System.out.println("\n \n Medida da base : " + objRet.getBase());
                if (opcao == 1) {
                    System.out.println("\nMedida da área: " + objRet.calcArea());

                } else if (opcao == 2) {
                    System.out.println("\nMedida do perímetro: " + objRet.calcPerimetro());
                } else if (opcao == 3) {
                    System.out.println("\nMedida da diagonal: " + objRet.calcDiagonal());
                }
            }
        } while (opcao < 4);
    }
}
