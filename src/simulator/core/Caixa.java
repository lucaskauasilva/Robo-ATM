package simulator.core;

/**
 * @author Josimar S. Arantes
 * @aluno Lucas Kauã Silva
 */
public class Caixa extends CaixaIdeia{
	String nomeItem;
	int qtdItem;
	public Caixa(String nomeItem, int qtdItem, int posX, int posY, float peso, float comprimento, float largura, float altura) {
		super(posX, posY, peso, comprimento, largura, altura);
		this.nomeItem = nomeItem;
		this.qtdItem = qtdItem;
	}
	
	@Override
	public String toString() {
		return "Caixa{ " + "Nome do Item = " + nomeItem + "Quantidade do Item: " + qtdItem + '}';
	}
}
