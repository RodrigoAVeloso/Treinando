package Interface;

public class Moto extends Veiculo {

	public Moto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Moto(int id, int qtdRodas, String marca, String modelo, int cilindradas) {
		super(id, qtdRodas, marca, modelo, cilindradas);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void acelerar() {

		System.out.println("Acelera no manete.");

	}
	
	@Override
	public void freiar() {
		System.out.println("A moto freia.");

	}

	@Override
	public void trocarMarcha() {

		System.out.println("A marcha foi trocada no pedal.");

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
