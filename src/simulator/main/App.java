package simulator.main;

import simulator.core.Robo;
import java.util.Scanner;

/**
 * @author Jesimar S. Arantes
 * @aluno Lucas Kauã Silva
 */
public class App {
    public static void main(String[] args) {
    	Robo robo = new Robo();
    	String tecla = "";
    	Scanner scan = new Scanner(System.in);
    	boolean ok = false;
    	do {
    		try{
    			System.out.println("Digite uma tecla: "); //@Lks
    			tecla = scan.next();
    			robo.setOrientacao(tecla.charAt(0));
    			robo.printPos();
    		}catch (IllegalArgumentException ex){
    			if (tecla.charAt(0) == '0'){
    				ok = true;
    			}else {
    				System.out.println("Valor errado");
    				scan.nextLine();
    				ok = false;
    			}
    		}
    	}while(!ok);
    	robo.printPos();
    }
}
