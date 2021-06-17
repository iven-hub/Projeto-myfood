package pacient;

 public class pacient{
      //aqui eu vou colocar somente alguns atributos e métodos.

       
       private String Nome;
       private String RG;
       private String CPF;

       

      public void setNome(String Nome){
          this.Nome = Nome;
      }


      public String getNome(){
          return this.Nome;
      }

     public void setRG(String RG){
         this.RG = RG;
     }

     public String getRG(){
        return this.RG;
     }
     
    public void setCPF(String CPF){
         this.CPF = CPF;
    }

    
   public String getCPF(){
       return this.CPF;
   }


   
   }//fim da classe pessoa