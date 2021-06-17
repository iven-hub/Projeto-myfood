
package Projeto_pessoa;
public class Funcionario extends pessoa {
    private String sector ;
    private boolean trabalho  ;
    public void muda_trabalho (){
        this.trabalho =! this.trabalho;
    }
    public String getSector() {
        return sector;
    }
    public void setSector(String sector) {
        this.sector = sector;
    }
    public boolean getTrabalho() {
        return trabalho;
    }
    public void setTrabalho(boolean trabalho) {
        this.trabalho = trabalho;
    }   
}