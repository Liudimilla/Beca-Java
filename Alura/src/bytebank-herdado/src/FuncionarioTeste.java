public abstract class FuncionarioTeste {

        private String nome;
        private String cpf;
        private double salario;
        private int senha;
        private int tipo = 0; //0 = Funcionário comum; 1 = Gerente; 2 = Diretor
        
        

//Este método deve atingir somente o gerente, jamais o funcionário comum
        //- já que este nem senha possui.         
        public boolean autentica(int senha) {
            if(this.senha == senha) {
                return true;
            } else {
                    return false;
            }
        }
        
      public abstract double getBonificacao();// { [[ A partir daqui, cada funcionario tera um "diferente de beneficio" parâmetro específico para cada funcionário
//        	if(this.tipo == 0) { // Funcionário comum
//                return this.salario * 0.1;
//        	} else if(this.tipo == 1) { // Gerente;
//        		return this.salario;
//            } else {
//                return this.salario + 1000.0;
//            }

    //    }
        public void setTipo(int tipo) {
            this.tipo = tipo;
        }
        
        public int getTipo() {
            return tipo;
        }
        
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