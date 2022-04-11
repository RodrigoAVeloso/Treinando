package Polimorfismo;

public class Lista {
	private Elemento inicio = null, atual, aux;
	
	public void inserir (Object objeto) {
		if (inicio == null) {
			inicio = new Elemento(objeto, null);
			aux = inicio;
		}else {
			atual = new Elemento(objeto, null);
			aux.setProx(atual);
			aux = atual;
		}
	}
	
	public void exibir () {
		Elemento x = inicio;
		while (x != null) {
			System.out.println(x.getObjeto());
			x = x.getProx();
		}
	}

}
