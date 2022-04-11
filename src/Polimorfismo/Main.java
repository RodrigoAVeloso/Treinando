package Polimorfismo;

public class Main {

	public static void main(String[] args) {
		Lista lista = new Lista();
		Veiculo carro = new Carro(4, "Honda", "Civic", 2000);
		Veiculo carro2 = new Carro(4, "Honda", "Fit", 1000);
		Veiculo carro3 = new Carro(4, "Honda", "City", 1600);
		Veiculo carro4 = new Carro(4, "Honda", "HR-V", 2000);
		
		lista.inserir(carro);
		lista.inserir(carro2);
		lista.inserir(carro3);
		lista.inserir(carro4);
		
		lista.exibir();
	}

}
