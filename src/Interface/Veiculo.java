package Interface;

public abstract class Veiculo implements VeiculoInterface{
	
	protected int id;
	protected int qtdRodas;
	protected String marca;
	protected String modelo;
	protected int cilindradas;
	
	public Veiculo() {}
	
	public Veiculo(int id, int qtdRodas, String marca, String modelo, int cilindradas) {
		super();
		this.id = id;
		this.qtdRodas = qtdRodas;
		this.marca = marca;
		this.modelo = modelo;
		this.cilindradas = cilindradas;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getQtdRodas() {
		return qtdRodas;
	}
	public void setQtdRodas(int qtdRodas) {
		this.qtdRodas = qtdRodas;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getCilindradas() {
		return cilindradas;
	}
	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Veiculo {ID: " + id + ",modelo: " + modelo + ", marca: " + marca + ", Quantidade de rodas: " + qtdRodas + ", Cilindradas: " + cilindradas + "}.";
	} 
	
}

