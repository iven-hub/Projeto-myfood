
package paciente;

/**
 *
 * @author user
 */
public class Paciente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dados paciente = new Dados();
        Endereco endereco = new Endereco();
        
        paciente.setNome("Iven Ramos");
        paciente.setIdade(20);
        endereco.setCidade("Ponta do Sol");
        endereco.setRua("kilombo");
        endereco.setNumero(123);
        
        System.out.println(paciente.getNome()+ "\n");
        System.out.println(paciente.getIdade()+ "\n");
        System.out.println(endereco.getCidade()+ "\n");
        System.out.println(endereco.getRua()+ "\n");
        System.out.println(endereco.getNumero()+ "\n");
        
    }
    
}
