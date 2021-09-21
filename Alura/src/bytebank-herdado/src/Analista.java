
public class Analista extends Funcionario {
	public double getBonificacao() {
        System.out.println("Chamando o método de bonificacao do ANALISTA");
        //return super.getBonificacao() + super.getSalario(); [apois funcionario virar abstrat MUDAr a saida]
        return 200;
    }
}


