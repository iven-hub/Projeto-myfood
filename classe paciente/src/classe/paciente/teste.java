
package classe.paciente;

public class teste {
    public static void main(String[] args) {
	 ClassePaciente paciente = new ClassePaciente();//objeto paciente
	 Endereco endereco = new Endereco();//obejto endereco   
    
     //atribuindo valores
	 paciente.setNome("Cássio Tessaro");
	 paciente.setIdade(15);
	 paciente.endereco.setCidade("São Paulo");
	 paciente.endereco.setRua("rua dos perdidos");
	 paciente.endereco.setNumero(666);
         
         System.out.println(paciente.getNome()+ "\n");
	 System.out.println(paciente.getIdade() + "\n");
	 System.out.println(paciente.endereco.getCidade() + "\n");
	 System.out.println(paciente.endereco.getRua() + "\n");
	 System.out.println(paciente.endereco.getNumero() + "\n");
		
         
         
         
    }
    
}    
    