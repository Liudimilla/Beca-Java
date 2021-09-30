package br.com.alura.Collections;


import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

    private String nome;
    private String instrutor;
    private String monitor;
    private List<Aula> aulas = new LinkedList<Aula>();
    private Set<Aluno> alunos = new HashSet<>();//para guarda a lista de alunos
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
   

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
   
    }
    public String getMonitor() {
		return monitor;
	}

    public String getInstrutor() {
        return instrutor;
    }
    

   public List<Aula> getAulas() {
       return aulas;
    }
    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }
   public List<Aula> getAula() {
       return Collections.unmodifiableList(aulas);
    }
   public int getTempoTotal() {
       return this.aulas.stream().mapToInt(Aula::getTempo).sum();
   }
//   public int getTempoTotal() { //percorrerá a lista de aulas do curso e somará os seus tempos, utilizando uma variável auxiliar:
//	    int tempoTotal = 0;
//	    for (Aula aula : aulas) {
//	        tempoTotal += aula.getTempo();
//	    }
//	    return tempoTotal;
	
//método toString, talvez não seja das melhores ideias ficar concatenando
@Override
public String toString() {
    return "[Curso: " + this.getNome() + ", tempo total: " + this.getTempoTotal()
            + ", aulas: + " + this.aulas + "]";
}

public void matricula(Aluno aluno) {
	this.alunos.add(aluno);
	this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
}
public Set<Aluno> getAlunos() { 
    return Collections.unmodifiableSet(alunos);
}
//public Set<Curso> getCursos() {
//    return Collections.unmodifiableSet(cursos);
//}

public boolean estaMatriculado(Aluno aluno) {
	return this.alunos.contains(aluno);
}

//public Aluno buscaMatriculado(int numero) {
//	 for (Aluno aluno : alunos) {
//	        if (aluno.getNumeroMatricula() == numero) {
//	            return aluno;
//	        }
//	    }
//	 throw new NoSuchElementException("Matricula " + numero
//	            + " não encontrada");
//}
//public void matricula(Aluno aluno) {
//    // adiciona no Set de alunos
//    this.alunos.add(aluno);
//    // cria a relação no Map
//    this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
//}
public Aluno buscaMatriculado(int numero) {
	if(!matriculaParaAluno.containsKey(numero))
		throw new NoSuchElementException();
    return matriculaParaAluno.get(numero);//dado o numero de matricula devolve o nome do aluno.

}

}