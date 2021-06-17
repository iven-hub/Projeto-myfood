
package registro.banco;
public class Data extends Cliente  {
     private int dia;
     private int mes;
     private  int ano ;
     public void setData (int dia, int mes, int ano){
          this.ano = ano ;
          this.mes = mes;
          this.dia = dia ;
     }
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAno() {
        return ano;
    }
    @Override
    public String toString() {
        return  " Data = " + dia+"/"+ mes + "/" + ano ;
    }
     }