package Interface;

public class Carro extends Veiculo{
	
	public Carro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Carro(int id, int qtdRodas, String marca, String modelo, int cilindradas) {
		super(id, qtdRodas, marca, modelo, cilindradas);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void acelerar() {
		
		System.out.println("Acelera no pedal.");
		
	}
	
	@Override
	public void freiar() {
		
		System.out.println("O carro freia.");
		
	}

	@Override
	public void trocarMarcha() {
		
		System.out.println("A marcha foi trocada no cambio.");
		
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
