package Polimorfismo;

public class Carro extends Veiculo{
	
	public Carro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Carro(int qtdRodas, String marca, String modelo, int cilindradas) {
		super(qtdRodas, marca, modelo, cilindradas);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void trocarRodas(int preco) {
		int valorTotal = preco * qtdRodas;
		
		System.out.println("O valor total da troca deu: " + valorTotal + " R$.");
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
