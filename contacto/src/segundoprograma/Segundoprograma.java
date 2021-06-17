
package segundoprograma;
import java.util.Scanner;
public class Segundoprograma {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
               System.out.println("Digite o seu nome: ");
               String nome = in.nextLine();
               System.out.println("digite a sua casa :");
               String casa = in.nextLine();
               System.out.println("Qual e a sua idade: ");
               int idade = in.nextInt();
               System.out.println("Qual e o seu contato: ");
               int contato = in.nextInt();
               System.out.print("Ola seu nome e "+nome);
               System.out.print(",tem "+idade + " anos");
               System.out.print( ",mora em " +casa);
               System.out.println(" e seu contacto é "+contato+ ".");
    }
}