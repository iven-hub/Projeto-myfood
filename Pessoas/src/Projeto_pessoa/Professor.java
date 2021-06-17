
package Projeto_pessoa;
public class Professor  extends pessoa  {
    private String especialidade ;
    private float Salario ;
    public void Receber_aumento (float Aumento){
         this.Salario = Salario + Aumento;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public float getSalario() {
        return Salario;
    }
    public void setSalario(float Salario) {
        this.Salario = Salario;
    }
}