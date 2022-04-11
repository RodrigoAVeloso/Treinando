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
	
	public Veiculo pesquisarId(int id) {
		Elemento x = inicio;
		Veiculo c;
		while(x != null) {
			c = (Veiculo)x.getObjeto();
			if(id == c.getId()) {
				return c;
			}
			x = x.getProx();
		}
				
		return null;
	}
	
	public boolean remover(int id) {
		Elemento[] v = pesquisarRemover(id);
		if(v != null) {
			Elemento rem = v[0];
			Elemento auxRem = v[1];
			if(rem == inicio) {
				inicio = rem.getProx();
				rem.setProx(null);
			}else if(rem == atual) {
				aux = auxRem;
				atual = auxRem;
				auxRem.setProx(null);
			}else {
				auxRem.setProx(rem.getProx());
				rem.setProx(null);
			}
			return true;
		}
		return false;
	}
	
	private Elemento [] pesquisarRemover(int id) {
		Elemento rem = inicio, auxRem = null;
		Elemento [] v = {rem, auxRem};
		Veiculo c;
		while(rem != null) {
			c =(Veiculo) rem.getObjeto();
			if(id == c.getId()) {
				v[0] = rem;
				v[1] = auxRem;
				return v;
			}
			auxRem = rem;
			rem = rem.getProx();
		}
		return null;
	}

}
