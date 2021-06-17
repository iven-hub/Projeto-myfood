
package Projeto_pessoa;
public class Aluno  extends pessoa  {
    private int matricula ;
    private String curso ;
    public void Cancelar_Matricula(){
        System.out.println (" Matricula cancelada ");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
