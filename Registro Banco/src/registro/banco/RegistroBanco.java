
package registro.banco;
public class RegistroBanco {

    public static void main(String[] args) {
        
         RegistroBanco p1 = new RegistroBanco() ;
        Data p2 = new Data();
        Cliente p3 = new Cliente();
        Conta  p4 = new Conta ();
        p2.setData(20,01,2021);
        p3.setNif(2012933345);
        p3.setNome("ana santos");
        p4.setNroConta(222222);
        p4.setSaldo(30000);
                System.out.println (p2.toString());
                System.out.println( p3.toString() );
                System.out.println( p4.toString());
       p4.fazerDeposito(50000);
       p4.consultarSaldo();
       p4.fazerLevantamento(30000);
       RegistroBanco e1 = new RegistroBanco() ;
        Data e2 = new Data();
        Cliente e3 = new Cliente();
        Conta  e4 = new Conta ();
        System.out.println("************************************************ ");
        e2.setData(10,01,2021);
        e3.setNif(201293344);
        e3.setNome("david ramos");
        e4.setNroConta(111111);
        e4.setSaldo(5000000);
                System.out.println (e2.toString());
                System.out.println( e3.toString() );
                System.out.println( e4.toString());
       e4.fazerDeposito(3000);
       e4.consultarSaldo();
       e4.fazerLevantamento(30000000);
        RegistroBanco f1 = new RegistroBanco() ;
        Data f2 = new Data();
        Cliente f3 = new Cliente();
        Conta  f4 = new Conta ();
        System.out.println("************************************************ ");
        f2.setData(20,01,2021);
        f3.setNif(2012945345);
        f3.setNome("Sandro silva");
        f4.setNroConta(333333);
        f4.setSaldo(30000);
                System.out.println (f2.toString());
                System.out.println( f3.toString() );
                System.out.println( f4.toString());
       f4.fazerDeposito(50000);
       f4.consultarSaldo();
       f4.fazerLevantamento(30000);
        RegistroBanco a1 = new RegistroBanco() ;
        Data a2 = new Data();
        Cliente a3 = new Cliente();
        Conta  a4 = new Conta ();
        System.out.println("************************************************ ");
        a2.setData(28,8,2018);
        a3.setNif(2012958445);
        a3.setNome("carla pina");
        a4.setNroConta(444444);
        a4.setSaldo(30000);
                System.out.println (a2.toString());
                System.out.println( a3.toString() );
                System.out.println( a4.toString());
       a4.fazerDeposito(1000);
       a4.consultarSaldo();
       a4.fazerLevantamento(3000);
       e4.fazerTranferencia(444444, 34000);
       a4.consultarSaldo();
       e4.consultarSaldo();
    }     
}
