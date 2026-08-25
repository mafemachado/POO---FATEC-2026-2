
/**
 *
 * @author maria
 */
public class Exemplo6 {

    public static void main(String[] args) {
        int cont, num;
        cont = 1;

        num = (int) (Math.random() * 100);
        System.out.println("\t\t\t TABUADA DO " + num);
        do {
            System.out.println(num + " x " + cont + " = " + cont * num);
            cont++;
        } while (cont <= 10);

    }
}
