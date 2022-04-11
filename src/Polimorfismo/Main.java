package Polimorfismo;

public class Main {

	public static void main(String[] args) {
		Lista lista = new Lista();
		Veiculo carro = new Carro(1,4, "Honda", "Civic", 2000);
		Veiculo carro2 = new Carro(2, 4, "Honda", "Fit", 1000);
		Veiculo moto = new Moto(3, 2, "Honda", "Start", 160);
		Veiculo moto2 = new Moto(4,4, "Honda", "Titan", 160);
		
		lista.inserir(carro);
		lista.inserir(carro2);
		lista.inserir(moto);
		lista.inserir(moto2);
		
		lista.exibir();
		
		carro.trocarRodas(50);
		
		Veiculo pesquisa = lista.pesquisarId(0);
		
		if (pesquisa != null) {
			System.out.println(pesquisa);
		}else {
			System.out.println("Não encotrado");
		}
		
		boolean rem = lista.remover(2);
		
		if(rem) {
			System.out.println("Removido com sucesso!");
			lista.exibir();
		}else {
			System.out.println("Id não encotrado.");
		}
		
		carro.acelerar();
		
		moto.acelerar();
	}

}
