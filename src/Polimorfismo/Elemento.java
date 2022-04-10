package Polimorfismo;

public class Elemento {

	private Object objeto;// Dados
	private Elemento prox;

	public Elemento(Object objeto, Elemento prox) {
		super();
		this.objeto = objeto;
		this.prox = prox;
	}

	public Object getObjeto() {
		return objeto;
	}

	public void setObjeto(Object objeto) {
		this.objeto = objeto;
	}

	public Elemento getProx() {
		return prox;
	}

	public void setProx(Elemento prox) {
		this.prox = prox;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Elemento{" + "objeto=" + objeto + ", prox=" + prox + '}';
	}
}
