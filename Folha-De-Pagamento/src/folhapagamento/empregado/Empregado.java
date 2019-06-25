package folhapagamento.empregado;

public abstract class Empregado {
	private int numeroEmpregado;
	private String nome;
	private String endereco;
	private int tipo;
	private int metodoPagamento;
	private int isSindicato = 0;

	Sindicato sindicato = new Sindicato();
	
	// Construtor
	public Empregado(int numeroEmpregado, String nome, String endereco, int tipo, int metodoPagamento, int isSindicato) {
		this.numeroEmpregado = numeroEmpregado;
		this.nome = nome;
		this.endereco = endereco;
		this.tipo = tipo;
		this.metodoPagamento = metodoPagamento;
		this.isSindicato = isSindicato;
	}
	
	public abstract void salario();
	
	//======================================= Get/Set =================================================
	
	public int getNumeroEmpregado() {
		return this.numeroEmpregado;
	}
	
	public void setNumeroEmpregado(int numeroEmpregado) {
		this.numeroEmpregado = numeroEmpregado;
	}
	
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	public int getTipo() {
		return this.tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
	public int getMetodoPagamento() {
		return this.metodoPagamento;
	}
	
	public void setMetodoPagamento(int metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}
	
	
	public int getIsSindicato() {
		return this.isSindicato;
	}
	
	public void setIsSindicato(int isSindicato) {
		this.isSindicato = isSindicato;
	}
	
	
	public Sindicato getSindicato() {
		return sindicato;
	}

	public void setSindicato(Sindicato sindicato) {
		this.sindicato = sindicato;
	}
	
}