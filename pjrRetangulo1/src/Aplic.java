
import fatec.poo.model.Retangulo;

/**
 *
 * @author maria
 */
public class Aplic {
    public static void main(String[] args){
        Retangulo objRet, objRet2; //definição de ponteiro
        
        objRet = new Retangulo(); // instanciação (alocação) de um objeto da classe Retangulo
        objRet2 = new Retangulo();
    
        //passagem de mensagens 
        objRet.setAltura(5.0);
        objRet.setBase(8.0);
        objRet2.setAltura(30.0);
        objRet2.setBase(40.0);
        
        //Retangulo 1
        System.out.println("Medida da altura: " + objRet.getAltura());
        System.out.println("Medida da base: " + objRet.getBase());
        System.out.println("Medida da Área: " + objRet.calcArea());
        System.out.println("Medida do Perímetro: " +  objRet.calcPerimetro());
        System.out.println("Medida da diagonal: " + objRet.calcDiagonal());
        
        System.out.println(" ");
        //Retangulo 2
        System.out.println("Medida da altura: " + objRet2.getAltura());
        System.out.println("Medida da base: " + objRet2.getBase());
        System.out.println("Medida da Área: " + objRet2.calcArea());
        System.out.println("Medida do Perímetro: " +  objRet2.calcPerimetro());
        System.out.println("Medida da diagonal: " + objRet2.calcDiagonal());
  
    }
    s
}
