
package registro.banco;
public class Conta extends Data   {
    private int nroConta ;
    private double saldo ;
    public int getNroConta() {
        return nroConta;
    }
    public void setNroConta(int nroConta) {
        this.nroConta = nroConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
   public void fazerDeposito (double montante){
       this.saldo = saldo + montante;
   }
    public void  fazerLevantamento (double montante){
        if( this.getSaldo() > montante ){this.saldo =saldo - montante;
        System.out.println (" Levantamento de "+ montante + "  executado com sucesso " );}
        else 
            {
        System.out.println (" O saldo actual não permite fazer esse levantamento  " );}  
   }
   public  void  consultarSaldo (){
       System.out.println (" O saldo actual é de  "+this.saldo );
   }
public void fazerTranferencia (  int Conta_destino, double montante ){
   if( this.getSaldo() > montante) {this.saldo =saldo - montante  ;
  //(saldo +montante) ;
   System.out.println (" Transferencia de  "+ montante + "executado para conta  " +Conta_destino + " com sucesso " );}
        else 
        System.out.println (" O saldo actual não permite fazer essa Transferencia  " );}   

    @Override
    public String toString() {
        return " nroConta= " + nroConta + ", saldo= " + saldo ;
    }   
  }