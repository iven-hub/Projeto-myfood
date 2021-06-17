
package registro.banco;
public class Cliente {
    private int nif ;
    private String nome ;
    public int getNif() {
        return nif;
    }
    public void setNif(int nif) {
        this.nif = nif;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString() {
        return   " Nome = " + nome+ ", nif = " + nif  ;
    }   
}