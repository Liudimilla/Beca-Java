public class Tercerizado {

	private String nome;
	private String matricula;
    private String cpf;
    protected double salario;
    
    
    public double getPromoçao() {
        return this.salario * 0.5;
    }
    public double getBonificacao() { //assinatura do método
        return this.salario * 0.2;
    }
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
    
}
