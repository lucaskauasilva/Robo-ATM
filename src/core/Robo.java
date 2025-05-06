package core;

/**
 * @author Jesimar da Silva Arantes
 * @Aluno Lucas Kauã Silva
 */
public class Robo {
    float posicaoX = 50;
    float posicaoY = 50;
    
    final String nome;
    final float peso;
    final float velocidadeMax = 5;
    final float pesoCargaMax = 20;
    final String tipoTracao = "esteira";
    
    public Robo(){ 
    	this.nome = "R-ATM";
    	this.peso = 70;
    	this.posicaoX = 50;
    	this.posicaoY = 50;
    }
    
    public Robo(String nome) {
    	this.nome = nome;
    	this.peso = 70;
    	this.posicaoX = 50;
    	this.posicaoY = 50;
    }
    
    public Robo(String nome, float peso) {
    	this.nome = nome;
    	this.peso = peso;
    	this.posicaoX = 50;
    	this.posicaoY = 50;
    }
    
    public Robo(String nome, float peso, float posX, float posY) {
    	this.nome = nome;
    	this.peso = peso;
    	this.posicaoX = posX;
    	this.posicaoY = posY;
    }

    public void move(float pos) {
    	this.posicaoY = pos;
    }
    
    public void move(float x, float y){
        this.posicaoX = x;
        this.posicaoY = y;
    }
    
    public void printStatus(){
        System.out.println("-----------Info R-ATM----------");
        System.out.println("Nome do Robô: " + nome);
        System.out.println("Peso do Robô: " + peso);
        System.out.println("Velocidade Max: " + velocidadeMax);
        System.out.println("Carga Max do Robô: " + pesoCargaMax);
        System.out.println("Tipo Tração do Robô: " + tipoTracao);
        System.out.println("Posição X do Robô: " + posicaoX);
        System.out.println("Posição Y do Robô: " + posicaoY);
        System.out.println("-------------------------------");
    }
    

}
