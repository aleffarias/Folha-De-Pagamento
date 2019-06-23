
public class PerfilEmpregado {
	protected int numeroEmpregado;
	protected String nome;
	protected String endereco;
	protected int tipo;
	protected int metodoPagamento;
	protected boolean sindicato;
	protected double salario = 0;
	
	//======================================= Get/Set=================================================
	
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
	
	
	public boolean getSindicato() {
		return this.sindicato;
	}
	
	public void setSindicato(boolean sindicato) {
		this.sindicato = sindicato;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}	
	
}