/**
 *
 * @author maria
 */
public class Exemplo8 {
    public static void main(String[] args) {
     double[] tabNum;
     double soma = 0;
     int cont;
     
     tabNum = new double[10];
     for (cont = 0; cont < 10; cont++){
         tabNum [cont] = Math.random() * 100;
         System.out.println(tabNum[cont]);
         soma += tabNum[cont];
     }
     
        System.out.println("Media: " + soma / 10);
    }
    
}
