/**
 *
 * @author maria
 */
public class Exemplo5 {
    public static void main(String[] args) {
       int cont, num;
       cont = 1;
        
        num = (int) (Math.random() * 100);
        System.out.println("\t\t\t TABUADA DO " + num);
        while (cont <= 10){
            System.out.println(num + " x " + cont + " = " + cont * num);
            cont++;
        }
    }
    
}

          
   