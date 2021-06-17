
package Projeto_pessoa;
public class Pessoas  { 
    public static void main(String[] args) {
        pessoa  p1 = new pessoa() ;
        Aluno  p2 = new Aluno ();
        Professor p3 = new Professor();
        Funcionario  p4 = new Funcionario ();
        
        p1.setNome("julia");
        p2.setNome("Jorge");
        p3.setNome("Marla ");
        p4.setNome("jaida");
        p1.setSexo("F");
        p2.setSexo("M");
        p3.setSexo("F");
        p4.setSexo("F");
        p2.setCurso("Engenharia informatica e sc");
        p1.setIdade(29);
        p2.setIdade(19);
        p4.setIdade(32);
        p3.setSalario(55000);
        p4.setSector("porteiro");
        p3.setIdade(49);
        p3.Receber_aumento(5000);
        p2.fazer_aniversario();
         System.out.println ( p1.getClass() +"  "+ p1.toString());
         System.out.println ( p2.getClass() +"  "+p2.toString());
         System.out.println (p3.getClass() +"  "+ p3.toString());
         System.out.println (p4.getClass() +"  "+ p4.toString()+ " Salario= "+ p3.getSalario());
    }   
}