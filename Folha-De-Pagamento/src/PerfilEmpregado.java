
public class PerfilEmpregado {
	protected int numeroEmpregado;
	protected String nome;
	protected String endereco;
	protected int tipo;
	protected int metodoPagamento;
	protected boolean sindicato;
	protected double salario;
	
	//======================================= Get/Set=================================================
	
	public int getNumeroEmpregado() {
		return this.numeroEmpregado;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String geteEndereco() {
		return this.endereco;
	}
	
	public int getTipo() {
		return this.tipo;
	}
	
	public int getMetodoPagamento() {
		return this.metodoPagamento;
	}
	
	public boolean getSindicato() {
		return this.sindicato;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	
	
}