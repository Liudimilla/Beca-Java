// todo funcionário recebe uma bonificação padrão, e que seu valor corresponde a 10% do salário.


public abstract class Funcionario {

        private String nome;
        private String cpf;
        private double salario;//Protecded ficara publico somente para os filhos.
        private int senha;
         
        public void setSenha(int senha) {
            this.senha = senha;
        }

        public boolean autentica(int senha) {
            if(this.senha == senha) {
                return true;
            } else {
                return false;
            }
        }
        public Funcionario() {

        }

      //metodo sem corpo, nao ha implementacao
        public abstract double getBonificacao(); //O método será implementado somente nas classes filhas.

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
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